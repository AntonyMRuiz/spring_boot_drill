package com.riwi.spring_boot_drill.infrastructure.abstract_services;

import com.riwi.spring_boot_drill.api.dtos.request.SubmissionRequest;
import com.riwi.spring_boot_drill.api.dtos.response.SubmissionResponse;

public interface ISubmissionService
        extends ServiceBase<SubmissionRequest, SubmissionResponse, Long> {

}
