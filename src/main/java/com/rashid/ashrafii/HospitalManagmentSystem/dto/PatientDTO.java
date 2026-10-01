package com.rashid.ashrafii.HospitalManagmentSystem.dto;

import com.rashid.ashrafii.HospitalManagmentSystem.annotation.BloodGroupValidation;
import com.rashid.ashrafii.HospitalManagmentSystem.annotation.PatientGenderValidation;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CurrentTimestamp;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {

    private BigInteger id;

    @NotEmpty(message= "Name is required")
    private String name;

    @PatientGenderValidation
    private String gender;

    @PastOrPresent(message="Date of birth can not be in future")
    private Date dob;

    @Email
    @Nullable
    private String emale;

    @BloodGroupValidation
    private String bloodGroup;

    @CurrentTimestamp
    private LocalDateTime createdAt;

}
