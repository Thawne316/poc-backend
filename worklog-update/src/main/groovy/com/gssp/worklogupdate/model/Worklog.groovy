package com.gssp.worklogupdate.model

import com.fasterxml.jackson.annotation.JsonFormat
import groovy.transform.Canonical
import org.springframework.data.mongodb.core.mapping.Document

@Canonical
@Document(collection = 'worklog')
class Worklog {

    private String employeeName
    private String projectName

    @JsonFormat(pattern = "MM-dd-yyyy")
    private Date loggedDate

    private String taskDone
    private Integer timeSpentOnProject

    String getEmployeeName() {
        return employeeName
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName
    }

    String getProjectName() {
        return projectName
    }

    void setProjectName(String projectName) {
        this.projectName = projectName
    }

    Date getLoggedDate() {
        return loggedDate
    }

    void setLoggedDate(Date loggedDate) {
        this.loggedDate = loggedDate
    }

    String getTaskDone() {
        return taskDone
    }

    void setTaskDone(String taskDone) {
        this.taskDone = taskDone
    }

    Integer getTimeSpentOnProject() {
        return timeSpentOnProject
    }

    void setTimeSpentOnProject(Integer timeSpentOnProject) {
        this.timeSpentOnProject = timeSpentOnProject
    }

}
