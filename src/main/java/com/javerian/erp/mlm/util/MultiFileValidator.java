package com.javerian.erp.mlm.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;

@Component
public class MultiFileValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return ProjectWorkDetails.class.isAssignableFrom(clazz);
	}

	public void validate(Object obj, Errors errors) {
		ProjectWorkDetails projectWorkDetails = (ProjectWorkDetails) obj;

		int index = 0;

		for (MultipartFile file : projectWorkDetails.getFile()) {

			if (file.getSize() == 0) {
				errors.rejectValue("files[" + index + "].file", "missing.file");
			}

			index++;
		}
	}
}
