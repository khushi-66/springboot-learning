package com.isrdc.rests;

import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.parameters.JobParameters;
import org.springframework.batch.core.job.parameters.JobParametersBuilder;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@Autowired
	private Job job;
	
	@Autowired
	private JobOperator joboperator;
	@GetMapping("/pro")
	public String process() throws Exception{
		//job launcher-->Job
		JobParameters jobparams=new JobParametersBuilder().addLong("start-At", System.currentTimeMillis())
				.toJobParameters();
		joboperator.start(job, jobparams);
		return "Done....";
	}

}
