package com.isrdc.utils;


import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AppSchedulerComponent {
     
	//@Scheduled(fixedRate=1000)
	//@Scheduled(fixedDelay=1000)
	@Scheduled(cron = "0 0 */2 * * *")
	public void showTime() {
	System.out.println("-------"+LocalDateTime.now());


}}
