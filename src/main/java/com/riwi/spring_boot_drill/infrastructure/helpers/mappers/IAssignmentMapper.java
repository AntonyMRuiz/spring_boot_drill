package com.riwi.spring_boot_drill.infrastructure.helpers.mappers;

import com.riwi.spring_boot_drill.api.dtos.request.AssignmentRequest;
import com.riwi.spring_boot_drill.api.dtos.response.AssignmetResponse;
import com.riwi.spring_boot_drill.domain.entities.Assignment;

public interface IAssignmentMapper
        extends MapperBase<AssignmentRequest, Assignment, AssignmetResponse> {

}
