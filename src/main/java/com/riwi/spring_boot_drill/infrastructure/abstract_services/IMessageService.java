package com.riwi.spring_boot_drill.infrastructure.abstract_services;

import com.riwi.spring_boot_drill.api.dtos.request.MessageRequest;
import com.riwi.spring_boot_drill.api.dtos.response.MessageResponse;

public interface IMessageService
        extends ServiceBase<MessageRequest, MessageResponse, Long> {

}
