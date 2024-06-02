package com.riwi.spring_boot_drill.infrastructure.abstract_service;

import com.riwi.spring_boot_drill.api.dtos.request.CourseRequest;
import com.riwi.spring_boot_drill.api.dtos.response.CourseReponse;

public interface ICourseService
        extends ServiceBase<CourseRequest, CourseReponse, Long> {

}
