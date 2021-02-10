package com.gssp.worklogdisplay.service

import com.gssp.worklogdisplay.model.Employees
import com.gssp.worklogdisplay.model.Worklog

interface DisplayService {

    List<Employees> getEmployeeDetails()

    List<Worklog> viewLogByName(String employeeName)

}
