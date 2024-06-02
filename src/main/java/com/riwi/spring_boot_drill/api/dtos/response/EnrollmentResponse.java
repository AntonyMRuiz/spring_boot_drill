package com.riwi.spring_boot_drill.api.dtos.response;

import java.time.LocalDate;

import com.riwi.spring_boot_drill.domain.entities.Course;
import com.riwi.spring_boot_drill.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentResponse {
    private Long id;
    private UserEntity userId;
    private Course courseId;
    private LocalDate date;
}
