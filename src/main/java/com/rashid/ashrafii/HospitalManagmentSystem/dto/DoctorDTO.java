package com.rashid.ashrafii.HospitalManagmentSystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CurrentTimestamp;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {
    private BigInteger id;

    @NotEmpty(message="Name of Doctor is required")
    @Size(min=3, max=20, message = "Provide complete name")
    private String name;

    @NotEmpty(message = "Specialization of Doctor is required")
    private String specializations;

    @Email(message = "Provide valid Doctor email")
    private String email;

    @CurrentTimestamp
    private LocalDateTime createdAt;
}
