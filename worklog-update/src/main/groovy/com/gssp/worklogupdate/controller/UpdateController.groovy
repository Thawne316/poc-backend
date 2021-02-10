package com.gssp.worklogupdate.controller

import com.gssp.worklogupdate.model.Login
import com.gssp.worklogupdate.model.Worklog
import com.gssp.worklogupdate.service.UpdateService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RefreshScope
@RestController
class UpdateController {

    @Autowired
    UpdateService updateService

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    Boolean checkLogin(@RequestBody Login login)  {
		log.info('Inside checklogin function in the controller')
        return updateService.loginDetails(login)
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addDetails")
    String addEmployeeDetails(@RequestBody Worklog worklog)  {
		log.info('Inside addEmployeeDetails function in the controller')
        String message = updateService.addDetails(worklog)
        return message
    }

    @GetMapping("/viewDetails/{employee_name}")
    List<Worklog> viewLogByName(@PathVariable("employee_name") String employeeName){
		log.info('Inside viewLogByName function in the controller')
        return updateService.viewLogByName(employeeName)
    }

}
