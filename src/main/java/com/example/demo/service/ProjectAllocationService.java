package com.example.demo.service;

import com.example.demo.DTO.MentorDto;
import com.example.demo.DTO.ProjectDto;
import com.example.demo.exception.ShawException;

import java.util.List;

public interface ProjectAllocationService {
    public Integer allocateProject(ProjectDto projectAllocation) throws ShawException;

    public List<MentorDto> getMentors(Integer numberOfProjectsMentored) throws ShawException;

    public void updateProjectMentor(Integer projectId, Integer mentorId) throws ShawException;

    public void deleteProject(Integer projectId) throws ShawException;
}
