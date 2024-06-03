package com.riwi.spring_boot_drill.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.spring_boot_drill.api.dtos.request.LessonRequest;
import com.riwi.spring_boot_drill.api.dtos.response.LessonResponse;
import com.riwi.spring_boot_drill.domain.repositories.LessonRepository;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.ILessonService;
import com.riwi.spring_boot_drill.infrastructure.helpers.ServiceHelper;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.ILessonMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LessonService implements ILessonService{
    
    @Autowired
    private final LessonRepository lessonRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final ILessonMapper lessonMapper;

    @Override
    public LessonResponse create(LessonRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public LessonResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Page<LessonResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public LessonResponse update(Long id, LessonRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
