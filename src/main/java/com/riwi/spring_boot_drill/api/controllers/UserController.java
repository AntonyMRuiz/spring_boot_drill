package com.riwi.spring_boot_drill.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.spring_boot_drill.api.dtos.request.UserRequest;
import com.riwi.spring_boot_drill.api.dtos.response.UserResponse;
import com.riwi.spring_boot_drill.infrastructure.abstract_services.IUserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor
public class UserController
        implements ControllerBase<UserRequest, UserResponse, Long> {

    @Autowired
    private final IUserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> create(
           @Validated @RequestBody UserRequest request) {
        return ResponseEntity.ok(this.userService.create(request));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserResponse> get(
           @PathVariable Long id) {
        return ResponseEntity.ok(this.userService.get(id));
    }

    @GetMapping
    public ResponseEntity<Page<UserResponse>> getAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(this.userService.getAll(page-1, size));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<UserResponse> update(
            @Validated @RequestBody UserRequest request,
            @PathVariable Long id) {
        return ResponseEntity.ok(this.userService.update(id, request));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id) {
        this.userService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
