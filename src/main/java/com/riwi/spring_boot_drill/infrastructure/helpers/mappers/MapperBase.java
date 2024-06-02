package com.riwi.spring_boot_drill.infrastructure.helpers.mappers;

public interface MapperBase <RequestDTO, Entity ,ResponseDTO>{
    
    Entity requestToEntity(RequestDTO request);

    ResponseDTO entityToResponse(Entity entity);
}
