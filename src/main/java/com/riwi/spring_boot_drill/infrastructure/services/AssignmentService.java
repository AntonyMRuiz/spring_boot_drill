package com.riwi.spring_boot_drill.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.spring_boot_drill.api.dtos.request.AssignmentRequest;
import com.riwi.spring_boot_drill.api.dtos.response.AssignmentResponse;
import com.riwi.spring_boot_drill.domain.repositories.AssignmentRepository;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.IAssignmentService;
import com.riwi.spring_boot_drill.infrastructure.helpers.ServiceHelper;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.IAssignmentMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AssignmentService implements IAssignmentService{
    
    @Autowired
    private final AssignmentRepository assignmentRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final IAssignmentMapper assignmentMapper;

    @Override
    public AssignmentResponse create(AssignmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public AssignmentResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Page<AssignmentResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public AssignmentResponse update(Long id, AssignmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
