package com.example.demo.DTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ProjectDto {
    private Integer projectId;

    @NotNull(message = "{project.projectname.absent}")
    private String projectName;

    @NotNull(message = "{project.ideaowner.absent}")
    private Integer ideaOwner;

    @NotNull(message = "{project.mentor.absent}")
    @Valid
    private MentorDto mentorDTO;

    public ProjectDto() {
        super();
    }

    public ProjectDto(Integer projectId, @NotNull(message = "{project.projectname.absent}") String projectName, @NotNull(message = "{project.ideaowner.absent}") Integer ideaOwner, @NotNull(message = "{project.mentor.absent}") @Valid MentorDto mentorDto) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.ideaOwner = ideaOwner;
        this.mentorDTO = mentorDto;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public Integer getIdeaOwner() {
        return ideaOwner;
    }

    public MentorDto getMentorDTO() {
        return mentorDTO;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setIdeaOwner(Integer ideaOwner) {
        this.ideaOwner = ideaOwner;
    }

    public void setMentorDTO(MentorDto mentorDTO) {
        this.mentorDTO = mentorDTO;
    }
}
