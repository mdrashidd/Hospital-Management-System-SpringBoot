package com.rashid.ashrafii.HospitalManagmentSystem.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class PatientGenderValidater implements ConstraintValidator<PatientGenderValidation,String> {

    @Override
    public boolean isValid(String gender, ConstraintValidatorContext context) {
        if(gender==null) return false;
        List<String> genderList = List.of("MALE","FEMALE","OTHERS");
        return genderList.contains(gender);
    }
}
