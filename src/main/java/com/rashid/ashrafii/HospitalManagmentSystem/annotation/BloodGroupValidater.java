package com.rashid.ashrafii.HospitalManagmentSystem.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class BloodGroupValidater implements ConstraintValidator<BloodGroupValidation,String> {
    @Override
    public boolean isValid(String bloodGroup, ConstraintValidatorContext context) {
        if(bloodGroup==null) return false;
        List<String> bloodGroupList = List.of("A+","A-","B+","B-","O+","O-","AB+","AB-");
        return bloodGroupList.contains(bloodGroup);
    }
}
