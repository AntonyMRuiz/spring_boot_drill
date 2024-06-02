package com.riwi.spring_boot_drill.api.dtos.response;

import java.time.LocalDate;

import com.riwi.spring_boot_drill.domain.entities.Lesson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssignmetResponse {
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private Lesson lessonId;
}
