package com.rashid.ashrafii.HospitalManagmentSystem.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class AppointmentStatusValidater implements ConstraintValidator<AppointmentStatusValidation,String> {
    @Override
    public boolean isValid(String status, ConstraintValidatorContext context) {
        if(status==null) return false;
        List<String> statuses = List.of("Scheduled", "Completed", "Cancelled", "Expired");
        return statuses.contains(status);
    }
}
