package com.riwi.spring_boot_drill.infrastructure.helpers.mappers;

import org.springframework.stereotype.Component;

import com.riwi.spring_boot_drill.api.dtos.request.CourseRequest;
import com.riwi.spring_boot_drill.api.dtos.response.CourseReponse;
import com.riwi.spring_boot_drill.domain.entities.Course;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.ICourseMapper;

@Component
public class CourseMapper implements ICourseMapper {

    @Override
    public Course requestToEntity(CourseRequest request) {
        return Course.builder()
                .name(request.getName())
                .description(request.getDescription())
                .instructorId(null)
                .build();
    }

    @Override
    public CourseReponse entityToResponse(Course entity) {
        return CourseReponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .instructorId(null)
                .build();
    }

}
