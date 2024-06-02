package com.riwi.spring_boot_drill.infrastructure.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class FindEntity<Entity, ID> {
    @Autowired
    private final JpaRepository<Entity, ID> repository;

    @Autowired
    private final Entity entity;

    public Entity find(ID id){
        return repository.findById(id)
                    .orElseThrow(() -> new RuntimeException(entity.getClass().getName() + " ID not found"));
    }
}
