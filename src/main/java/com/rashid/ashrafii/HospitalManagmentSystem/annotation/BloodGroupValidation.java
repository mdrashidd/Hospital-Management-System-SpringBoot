package com.rashid.ashrafii.HospitalManagmentSystem.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy={BloodGroupValidater.class})
public @interface BloodGroupValidation {
    String message() default "BloodGroup can be only be A+,A-,B+,B-,O+,O-,AB+,AB- ";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
