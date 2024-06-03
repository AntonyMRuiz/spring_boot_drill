package com.riwi.spring_boot_drill.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.spring_boot_drill.api.dtos.request.SubmissionRequest;
import com.riwi.spring_boot_drill.api.dtos.response.SubmissionResponse;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.ISubmissionService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/submissions")
@AllArgsConstructor
@Tag(name = "Submissions")
public class SubmissionController
        implements ControllerBase<SubmissionRequest, SubmissionResponse, Long> {

    @Autowired
    private final ISubmissionService submissionService;

    @Override
    public ResponseEntity<SubmissionResponse> create(SubmissionRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ResponseEntity<SubmissionResponse> get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public ResponseEntity<Page<SubmissionResponse>> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public ResponseEntity<SubmissionResponse> update(SubmissionRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
