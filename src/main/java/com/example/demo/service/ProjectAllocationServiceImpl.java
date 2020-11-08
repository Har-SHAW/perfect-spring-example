package com.example.demo.service;

import com.example.demo.DTO.MentorDto;
import com.example.demo.DTO.ProjectDto;
import com.example.demo.entity.Mentor;
import com.example.demo.entity.Project;
import com.example.demo.exception.ShawException;
import com.example.demo.repository.MentorRepository;
import com.example.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service(value = "projectAllocationService")
@Transactional
public class ProjectAllocationServiceImpl implements ProjectAllocationService {

    @Autowired
    MentorRepository mentorRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Integer allocateProject(ProjectDto projectAllocation) throws ShawException {
        Optional<Mentor> optional = mentorRepository.findById(projectAllocation.getMentorDTO().getMentorId());
        Mentor mentor = optional.orElseThrow(() -> new ShawException("Service.MENTOR_NOT_FOUND"));
        if(mentor.getNumberOfProjectsMentored() >= 3){
            throw new ShawException("Service.CANNOT_ALLOCATE_PROJECT");
        }else{
            Project project = new Project();
            project.setIdeaOwner(projectAllocation.getIdeaOwner());
            project.setProjectName(projectAllocation.getProjectName());
            mentor.setNumberOfProjectsMentored(mentor.getNumberOfProjectsMentored() + 1);
            project.setModelEntity(mentor);
            Project pro = projectRepository.save(project);
            return pro.getProjectId();
        }
    }

    @Override
    public List<MentorDto> getMentors(Integer numberOfProjectsMentored) throws ShawException {
        return null;
    }

    @Override
    public void updateProjectMentor(Integer projectId, Integer mentorId) throws ShawException {

    }

    @Override
    public void deleteProject(Integer projectId) throws ShawException {

    }
}
