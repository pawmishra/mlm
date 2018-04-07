package com.javerian.erp.mlm.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;

@Component
public class FileValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return ProjectWorkDetails.class.isAssignableFrom(clazz);
	}

	public void validate(Object obj, Errors errors) {
		ProjectWorkDetails file = (ProjectWorkDetails) obj;

		if (file.getFile() != null) {
			if (file.getFile().getSize() == 0) {
				errors.rejectValue("file", "missing.file");
			}
		}
	}
}