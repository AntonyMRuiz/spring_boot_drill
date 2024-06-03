package com.riwi.spring_boot_drill.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.spring_boot_drill.api.dtos.request.MessageRequest;
import com.riwi.spring_boot_drill.api.dtos.response.MessageResponse;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.IMessageService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/messages")
@AllArgsConstructor
@Tag(name = "Messages")
public class MessageController implements
        ControllerBase<MessageRequest, MessageResponse, Long> {

        @Autowired
        private final IMessageService messsageService;

        @Override
        public ResponseEntity<MessageResponse> create(MessageRequest request) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'create'");
        }

        @Override
        public ResponseEntity<MessageResponse> get(Long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'get'");
        }

        @Override
        public ResponseEntity<Page<MessageResponse>> getAll(int page, int size) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getAll'");
        }

        @Override
        public ResponseEntity<MessageResponse> update(MessageRequest request, Long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'update'");
        }

        @Override
        public ResponseEntity<Void> delete(Long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'delete'");
        }
}
