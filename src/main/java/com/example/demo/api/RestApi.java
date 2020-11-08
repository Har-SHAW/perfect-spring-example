package com.example.demo.api;

import com.example.demo.DTO.ProjectDto;
import com.example.demo.exception.ShawException;
import com.example.demo.service.ProjectAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class RestApi {

    @Autowired
    private ProjectAllocationService projectAllocationService;

    @Autowired
    private Environment environment;

    @PostMapping("/project")
    private ResponseEntity<String> allocateProject(@Valid @RequestBody ProjectDto project) throws ShawException {
        Integer id = projectAllocationService.allocateProject(project);
        String successMessage = environment.getProperty("API.ALLOCATION_SUCCESS") + id;
        return new ResponseEntity<>(successMessage, HttpStatus.OK);
    }
}
