package com.rashid.ashrafii.HospitalManagmentSystem.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
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
public class InsuranceDTO {
    private BigInteger id;

    @NotEmpty
    private String policyNumber;

    @NotEmpty
    private String provider;

    @FutureOrPresent
    private Date validUntill;

    @CurrentTimestamp
    private LocalDateTime createdAt;
}
