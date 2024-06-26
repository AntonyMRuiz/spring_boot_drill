package com.riwi.spring_boot_drill.infrastructure.abstract_services;

import com.riwi.spring_boot_drill.api.dtos.request.AssignmentRequest;
import com.riwi.spring_boot_drill.api.dtos.response.AssignmentResponse;

public interface IAssignmentService
        extends ServiceBase<AssignmentRequest, AssignmentResponse, Long> {

}
