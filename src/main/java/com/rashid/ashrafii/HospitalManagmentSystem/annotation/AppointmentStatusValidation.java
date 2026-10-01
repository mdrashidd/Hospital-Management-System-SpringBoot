package com.rashid.ashrafii.HospitalManagmentSystem.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Constraint(validatedBy={AppointmentStatusValidater.class})
public @interface AppointmentStatusValidation {
    String message() default "Valid appointment statuses are Scheduled, Completed, Cancelled, Expired";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
