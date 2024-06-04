package com.riwi.spring_boot_drill.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.spring_boot_drill.api.dtos.request.SubmissionRequest;
import com.riwi.spring_boot_drill.api.dtos.response.SubmissionResponse;
import com.riwi.spring_boot_drill.domain.entities.Submission;
import com.riwi.spring_boot_drill.domain.repositories.SubmissionRepository;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.ISubmissionService;
import com.riwi.spring_boot_drill.infrastructure.helpers.ServiceHelper;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.ISubmissionMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubmissionService implements ISubmissionService{
    
    @Autowired
    private final SubmissionRepository submissionRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final ISubmissionMapper submissionMapper;

    @Override
    public SubmissionResponse create(SubmissionRequest request) {
        Submission submission = this.submissionMapper.requestToEntity(request);
        return this.submissionMapper.entityToResponse(this.submissionRepository.save(submission));
    }

    @Override
    public SubmissionResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Page<SubmissionResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public SubmissionResponse update(Long id, SubmissionRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
