package com.javerian.erp.mlm.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.model.workflow.DocumentQuestions;
import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;
import com.javerian.erp.mlm.model.workflow.ReviewerRemark;
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.service.workflow.DocumentQuestionsService;
import com.javerian.erp.mlm.service.workflow.ProjectWorkDetailsService;
import com.javerian.erp.mlm.service.workflow.ReviewerRemarkService;
import com.javerian.erp.mlm.util.StatusEnum;
import com.javerian.erp.mlm.util.Util;
import com.javerian.erp.mlm.vo.ReviewerVO;

@Controller
public class ReviewerRemarkController {

	@Autowired
	ReviewerRemarkService reviewerRemarkService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@Autowired
	ProjectWorkDetailsService projectWorkDetailsService;

	@Autowired
	UserService userService;

	@Autowired
	DocumentQuestionsService documentQuestionsService;

	@RequestMapping(value = { "/project_allocation" }, method = RequestMethod.GET)
	public String projectAllocation(ModelMap model) {
		addModelAttr(model);
		return "project_allocation";
	}

	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new ReviewerRemark());

		List<ReviewerRemark> listOfReviewerRemark = reviewerRemarkService.findAllReviewerRemark();
		List<ReviewerVO> listOfReviewerVO = new ArrayList<>();

		int count = 0;
		for (ReviewerRemark reviewerRemark : listOfReviewerRemark) {

			User user = userService.findById(reviewerRemark.getReviewed_by());

			ReviewerVO reviewVo = new ReviewerVO();
			reviewVo.setsNo(++count);
			reviewVo.setDocumentId(reviewerRemark.getDocument_id());
			reviewVo.setProjectId(reviewerRemark.getProject_id());
			reviewVo.setQuestion(reviewerRemark.getQuestion_id());
			reviewVo.setRating(reviewerRemark.getReview_rating());
			reviewVo.setAssignDate(reviewerRemark.getAssign_datetime().toString());
			if (reviewerRemark.getReview_datetime() != null) {
				reviewVo.setReviewDate(reviewerRemark.getReview_datetime().toString());
			}
			reviewVo.setUserName(user.getUsername());
			reviewVo.setStatus(StatusEnum.values()[reviewerRemark.getStatus() - 1].toString());

			listOfReviewerVO.add(reviewVo);
		}

		model.addAttribute("listOfReviewerVO", listOfReviewerVO);

		List<ProjectWorkDetails> listOfAllProject = projectWorkDetailsService.findAllProjectWorkDetails();
		Map<String, ProjectWorkDetails> map = new HashMap<>();
		for (ProjectWorkDetails projectWorkDetails : listOfAllProject) {
			if (projectWorkDetails != null && !projectWorkDetails.getAllocated()) {
				map.put(projectWorkDetails.getTicket_id(), projectWorkDetails);
			}
		}
		Collection<ProjectWorkDetails> listOfProject = map.values();
		model.addAttribute("listOfProject", listOfProject);

		List<User> listOfAllUser = userService.findAllUsers();
		List<User> listOfUser = new ArrayList<>();
		for (User user : listOfAllUser) {
			if (user.getEligibility_status() == true) {
				listOfUser.add(user);
			}
		}
		model.addAttribute("listOfUser", listOfUser);
	}

	@RequestMapping(value = "/save_project_allocation", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute ReviewerRemark reviewerRemark, BindingResult result, ModelMap model) {

		try {
			Integer countOfAssignedProjectToUser = reviewerRemarkService
					.getCountOfAssignedProjectToUser(reviewerRemark.getReviewed_by());

			if (countOfAssignedProjectToUser < 2) {

				List<DocumentQuestions> listOfAllQuestions = documentQuestionsService.findAllDocumentQuestions();
				ProjectWorkDetails project = projectWorkDetailsService
						.findByDocumentId(reviewerRemark.getDocument_id());

				for (DocumentQuestions question : listOfAllQuestions) {

					ReviewerRemark newObj = (ReviewerRemark) reviewerRemark.clone();
					newObj.setProject_id(project.getPrj_work_details_id());
					newObj.setQuestion_id(question.getId());
					newObj.setAssign_datetime(Util.getCurrentTime());
					newObj.setStatus(StatusEnum.OPEN.getStatus());
					reviewerRemarkService.save(newObj);
				}
				project.setAllocated(true);
				projectWorkDetailsService.updateProject(project);

				addModelAttr(model);
			} else {

				addModelAttr(model);
				model.addAttribute("message", "The User is Already has two Open Projects!");
			}
		} catch (Exception ex) {

		}
		return "project_allocation";
	}

	@RequestMapping(value = "/save_project_allocation", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {

		addModelAttr(model);
		return "project_allocation";
	}

	@RequestMapping(value = "/getDocumentId", method = RequestMethod.GET)
	public @ResponseBody List<ProjectWorkDetails> getDocumentId(@RequestParam String ticket_id) {

		List<ProjectWorkDetails> listOfProjectNew = new ArrayList<ProjectWorkDetails>();
		if (!StringUtils.isEmpty(ticket_id)) {
			for (ProjectWorkDetails projectWorkDetails : projectWorkDetailsService
					.findListOfProjectWorkDetailsByTicketId(ticket_id)) {
				if (!projectWorkDetails.getAllocated()) {
					listOfProjectNew.add(projectWorkDetails);
				}
			}
		}
		return listOfProjectNew;
	}

	@RequestMapping(value = { "/review_project" }, method = RequestMethod.GET)
	public String reviewproject(ModelMap model) {
		addModelAttributeForProjectReview(model);
		return "review_project";
		// return "temp_review";
	}

	public void addModelAttributeForProjectReview(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		User userObjOfLoggedInUser = userService.getLoggedInUser();

		List<ReviewerRemark> listOfReviewerRemark = reviewerRemarkService
				.findByReviewerId(userObjOfLoggedInUser.getId());

		Map<String, ReviewerRemark> map = new HashMap<>();
		for (ReviewerRemark reviewerRemark : listOfReviewerRemark) {
			map.put(reviewerRemark.getDocument_id(), reviewerRemark);
		}
		Collection<ReviewerRemark> listOfDocumentId = map.values();

		model.addAttribute("listOfDocumentId", listOfDocumentId);
		model.addAttribute("listOfReviewerRemark", listOfReviewerRemark);
	}
}
