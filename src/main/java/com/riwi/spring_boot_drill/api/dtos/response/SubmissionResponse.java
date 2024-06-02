package com.riwi.spring_boot_drill.api.dtos.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.riwi.spring_boot_drill.domain.entities.Assignment;
import com.riwi.spring_boot_drill.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionResponse {
    private Long id;
    private String content;
    private LocalDateTime date;
    private BigDecimal grade;
    private UserEntity userId;
    private Assignment assignmentId;
}
