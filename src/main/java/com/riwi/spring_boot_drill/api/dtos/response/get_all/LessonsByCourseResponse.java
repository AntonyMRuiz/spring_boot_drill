package com.riwi.spring_boot_drill.api.dtos.response.get_all;

import org.springframework.data.domain.Page;

import com.riwi.spring_boot_drill.api.dtos.response.CourseReponse;
import com.riwi.spring_boot_drill.api.dtos.response.LessonResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LessonsByCourseResponse extends CourseReponse {
    private Page<LessonResponse> lessons;
}
