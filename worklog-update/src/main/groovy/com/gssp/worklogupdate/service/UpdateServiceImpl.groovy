package com.gssp.worklogupdate.service

import com.gssp.worklogupdate.model.Login
import com.gssp.worklogupdate.model.Worklog
import com.gssp.worklogupdate.repository.WorklogRepository

import groovy.util.logging.Slf4j

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Slf4j
@Service
class UpdateServiceImpl implements UpdateService {

    @Autowired
    WorklogRepository worklogRepository

    @Override
    Boolean loginDetails(Login login) {
		log.info('Inside loginDetails function in the service')
        if(login.getUserName().equals('admin') && login.getPassword().equals('admin')) {
            return true
        }
        else {
            return false
        }
    }

    @Override
    String addDetails(Worklog worklog) {
		log.info('Inside addDetails function in the service')
        worklog.setLoggedDate(new Date())
        worklogRepository.save(worklog)
        return "Log added successfully."
    }

    @Override
    List<Worklog> viewLogByName(String employeeName) {
		log.info('Inside viewLogByName function in the service')
        return worklogRepository.findByEmployeeName(employeeName)
    }
}
