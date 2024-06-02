package com.riwi.spring_boot_drill.infrastructure.abstract_services;

import com.riwi.spring_boot_drill.api.dtos.request.EnrollmentRequest;
import com.riwi.spring_boot_drill.api.dtos.response.EnrollmentResponse;

public interface IEnrollmentService
        extends ServiceBase<EnrollmentRequest, EnrollmentResponse, Long> {

}
