package com.rashid.ashrafii.HospitalManagmentSystem.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy={PatientGenderValidater.class})
public @interface PatientGenderValidation {
    String message() default "Gender of patient can be either MALE, FEMALE or OTHERS";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
