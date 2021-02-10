package com.gssp.worklogdisplay.controller

import com.gssp.worklogdisplay.model.Employees
import com.gssp.worklogdisplay.model.Worklog
import com.gssp.worklogdisplay.service.DisplayService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RefreshScope
@RestController
class DisplayController {

    @Autowired
    DisplayService displayService

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/viewEmployees")
    List<Employees> getEmployeeDetails() {
		log.info('Inside getEmployeeDetails function in the controller')
        return displayService.getEmployeeDetails()
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/viewDetails/{employee_name}")
    List<Worklog> getByName(@PathVariable("employee_name") String employeeName){
		log.info('Inside getByName function in the controller')
        return displayService.viewLogByName(employeeName)
    }

}
