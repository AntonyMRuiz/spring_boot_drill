package com.riwi.spring_boot_drill.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.spring_boot_drill.api.dtos.request.EnrollmentRequest;
import com.riwi.spring_boot_drill.api.dtos.response.EnrollmentResponse;
import com.riwi.spring_boot_drill.domain.repositories.EnrollmentRepository;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.IEnrollmentService;
import com.riwi.spring_boot_drill.infrastructure.helpers.ServiceHelper;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.IEnrollmentMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EnrollmentService implements IEnrollmentService{
    
    @Autowired
    private final EnrollmentRepository enrollmentRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final IEnrollmentMapper enrollmentMapper;

    @Override
    public EnrollmentResponse create(EnrollmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public EnrollmentResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Page<EnrollmentResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public EnrollmentResponse update(Long id, EnrollmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
