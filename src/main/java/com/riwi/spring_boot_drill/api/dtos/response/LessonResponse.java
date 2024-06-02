package com.riwi.spring_boot_drill.api.dtos.response;

import com.riwi.spring_boot_drill.domain.entities.Course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonResponse {
    private Long id;
    private String title;
    private String content;
    private Course courseId;
}
