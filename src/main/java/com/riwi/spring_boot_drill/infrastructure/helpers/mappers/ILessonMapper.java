package com.riwi.spring_boot_drill.infrastructure.helpers.mappers;

import com.riwi.spring_boot_drill.api.dtos.request.LessonRequest;
import com.riwi.spring_boot_drill.api.dtos.response.LessonResponse;
import com.riwi.spring_boot_drill.domain.entities.Lesson;

public interface ILessonMapper
        extends MapperBase<LessonRequest, Lesson, LessonResponse> {

}
