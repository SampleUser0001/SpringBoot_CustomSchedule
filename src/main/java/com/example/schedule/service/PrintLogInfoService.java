package com.example.schedule.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintLogInfoService {
    private static final Logger log = LoggerFactory.getLogger(PrintLogInfoService.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public void printLog() {
		log.info("The time is now {}", dateFormat.format(new Date()));
    }

}
