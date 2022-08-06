package com.example.schedule.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.example.schedule.model.ScheduleModel;

@Repository
public class ScheduleConf {
    
    private static ScheduleModel conf = new ScheduleModel(true);    

    @Bean
    public ScheduleModel getConf() {
        return conf;
    }
}
