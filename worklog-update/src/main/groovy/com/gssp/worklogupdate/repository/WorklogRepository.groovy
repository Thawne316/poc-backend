package com.gssp.worklogupdate.repository

import com.gssp.worklogupdate.model.Worklog
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface WorklogRepository extends  MongoRepository<Worklog, String> {

    List<Worklog> findByEmployeeName(String employeeName)

}
