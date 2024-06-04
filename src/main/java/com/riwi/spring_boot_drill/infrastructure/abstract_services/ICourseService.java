package com.riwi.spring_boot_drill.infrastructure.abstract_services;

import com.riwi.spring_boot_drill.api.dtos.request.CourseRequest;
import com.riwi.spring_boot_drill.api.dtos.request.update.CourseUpdateRequest;
import com.riwi.spring_boot_drill.api.dtos.response.CourseReponse;
import com.riwi.spring_boot_drill.api.dtos.response.get_all.LessonsByCourseResponse;

public interface ICourseService
        extends ServiceBase<CourseRequest, CourseReponse, Long> {
        
        CourseReponse updateInfo(Long id, CourseUpdateRequest request);

        LessonsByCourseResponse getLessons(int page, int size, Long id);
}
