package com.riwi.spring_boot_drill.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.spring_boot_drill.api.dtos.request.LessonRequest;
import com.riwi.spring_boot_drill.api.dtos.response.LessonResponse;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.ILessonService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/lessons")
@AllArgsConstructor
@Tag(name = "Lessons")
public class LessonController 
        implements ControllerBase<LessonRequest, LessonResponse, Long> {

    @Autowired
    private final ILessonService lessonService;

    @Override
    public ResponseEntity<LessonResponse> create(LessonRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ResponseEntity<LessonResponse> get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public ResponseEntity<Page<LessonResponse>> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public ResponseEntity<LessonResponse> update(LessonRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
