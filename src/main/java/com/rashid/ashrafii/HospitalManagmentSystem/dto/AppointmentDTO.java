package com.rashid.ashrafii.HospitalManagmentSystem.dto;

import com.rashid.ashrafii.HospitalManagmentSystem.annotation.AppointmentStatusValidation;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Future;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDTO {
    private BigInteger id;

    @Future(message="Date of Appointment should be in future")
    private LocalDateTime appointmentTime;

    @Nullable
    private String reason;

    @AppointmentStatusValidation
    private String status;


}
