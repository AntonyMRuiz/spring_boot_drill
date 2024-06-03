package com.riwi.spring_boot_drill.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.spring_boot_drill.api.dtos.request.MessageRequest;
import com.riwi.spring_boot_drill.api.dtos.response.MessageResponse;
import com.riwi.spring_boot_drill.domain.repositories.MessageRepository;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.IMessageService;
import com.riwi.spring_boot_drill.infrastructure.helpers.ServiceHelper;
import com.riwi.spring_boot_drill.infrastructure.helpers.abstract_mappers.IMessageMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MessageService implements IMessageService {
    
    @Autowired
    private final MessageRepository messageRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final IMessageMapper messageMapper;

    @Override
    public MessageResponse create(MessageRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public MessageResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Page<MessageResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public MessageResponse update(Long id, MessageRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
