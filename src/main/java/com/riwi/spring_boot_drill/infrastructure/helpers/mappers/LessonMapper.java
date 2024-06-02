package com.riwi.spring_boot_drill.infrastructure.helpers.mappers;

import org.springframework.stereotype.Component;

import com.riwi.spring_boot_drill.api.dtos.request.LessonRequest;
import com.riwi.spring_boot_drill.api.dtos.response.LessonResponse;
import com.riwi.spring_boot_drill.domain.entities.Lesson;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.ILessonMapper;

@Component
public class LessonMapper implements ILessonMapper{

    @Override
    public Lesson requestToEntity(LessonRequest request) {
        return Lesson.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .courseId(null)
                .build();
    }

    @Override
    public LessonResponse entityToResponse(Lesson entity) {
        return LessonResponse.builder()
                .id(null)
                .title(entity.getTitle())
                .content(entity.getContent())
                .courseId(null)
                .build();
    }
    
}
