package com.gssp.worklogupdate.service

import com.gssp.worklogupdate.model.Login
import com.gssp.worklogupdate.model.Worklog

interface UpdateService {

    Boolean loginDetails(Login login)

    String addDetails(Worklog worklog)

    List<Worklog> viewLogByName(String employeeName)

}
