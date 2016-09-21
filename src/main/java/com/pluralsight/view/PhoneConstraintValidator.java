package com.pluralsight.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String>{

	@Override
	public void initialize(Phone constraintAnnotation) {
	}

	@Override
	public boolean isValid(String phoneField, ConstraintValidatorContext context) {
		if(phoneField == null){
			return false;
		}
		boolean result = phoneField.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}");
		return result;
	}
	
}
