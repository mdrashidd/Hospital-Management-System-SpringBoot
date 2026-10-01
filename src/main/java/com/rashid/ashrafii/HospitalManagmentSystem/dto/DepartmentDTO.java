package com.rashid.ashrafii.HospitalManagmentSystem.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CurrentTimestamp;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    private BigInteger id;

    @NotEmpty
    private String name;

    @CurrentTimestamp
    private LocalDateTime createdAt;

    @NotNull
    private BigInteger headDoctorId;
}
