
package com.example.schedule.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.schedule.model.ScheduleModel;
import com.example.schedule.service.PrintLogInfoService;

@Component
public class ScheduledTask {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    @Autowired
    PrintLogInfoService service;

    @Autowired
    ScheduleModel conf;

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
        if(conf.isRunning()){
            service.printLog();
        } else {
            log.info("service is stopped.");
        }
	}
}