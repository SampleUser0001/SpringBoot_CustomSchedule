package com.example.schedule.component;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.schedule.model.ScheduleModel;

@Component
public class RandomStopTask {

    private static Random random = new Random();
    private static final Logger log = LoggerFactory.getLogger(RandomStopTask.class);

    @Autowired
    ScheduleModel conf;

    @Scheduled(fixedRate = 10000)
    public void statusChange(){
        int tmp = random.nextInt(10);
        boolean isRunning = tmp > 4;
        log.info("{}:{}", tmp, isRunning);
        if( isRunning ) {
            log.info("run");
        } else {
            log.info("stop");
        }
        conf.setRunning(isRunning);
    }
}
