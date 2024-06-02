package com.riwi.spring_boot_drill.infrastructure.abstract_service;

import com.riwi.spring_boot_drill.api.dtos.request.AssignmentRequest;
import com.riwi.spring_boot_drill.api.dtos.response.AssignmetResponse;

public interface IAssignmentService
        extends ServiceBase<AssignmentRequest, AssignmetResponse, Long> {

}
