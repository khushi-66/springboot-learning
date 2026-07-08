package com.isrdc.configs;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.Step;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.infrastructure.item.ItemProcessor;
import org.springframework.batch.infrastructure.item.data.RepositoryItemWriter;
import org.springframework.batch.infrastructure.item.file.FlatFileItemReader;
import org.springframework.batch.infrastructure.item.file.LineMapper;
import org.springframework.batch.infrastructure.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.infrastructure.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.infrastructure.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.isrdc.entites.Employees;
import com.isrdc.repos.EmployeeRepo;
import com.isrdc.utils.EmployeeProcessor;

@Configuration
@EnableBatchProcessing
public class CsvToDb {
@Autowired
    private EmployeeRepo repo;

     // reader
	@Bean
	public FlatFileItemReader<Employees> employeeReader(){
		FlatFileItemReader<Employees> itemreader=new FlatFileItemReader<Employees>(lineMapper());
		itemreader.setResource(new FileSystemResource("src/main/resources/records.csv"));
		
		itemreader.setName("item-reader");
		itemreader.setLinesToSkip(1);
		return itemreader;
	}
	
	public LineMapper<Employees>lineMapper(){
		DefaultLineMapper<Employees>dlm=new DefaultLineMapper<>();
		DelimitedLineTokenizer dlt=new DelimitedLineTokenizer();
		dlt.setDelimiter(",");
		dlt.setNames("empId","name","email","password","phone","city","salary");
		dlt.setStrict(false);
		BeanWrapperFieldSetMapper<Employees>bwfsm=new BeanWrapperFieldSetMapper<>();
		bwfsm.setTargetType(Employees.class);
		dlm.setLineTokenizer(dlt);
		dlm.setFieldSetMapper(bwfsm);
		return dlm;
	}
	
		// processor
	   @Bean
	   public  EmployeeProcessor employeeprocessor() {
		return new EmployeeProcessor();
	 }
	
		// writer
	@Bean
	public RepositoryItemWriter<Employees> itemwriter(){
		RepositoryItemWriter<Employees>itemwriter=new RepositoryItemWriter<>(repo);
		itemwriter.setMethodName("save");
		return itemwriter;
	}
	
	    // creating Step
	@Bean
	public Step step(JobRepository jobrepo) {
		
		return new StepBuilder("step1",jobrepo)
				.<Employees,Employees>chunk(1)
				.reader(employeeReader())
				.processor(employeeprocessor())
				.writer(itemwriter())
				.build();
	}
	
	
	
	  //create job
      @Bean
      public Job job(JobRepository jobrepo,Step step) {
    	  
    	   return new JobBuilder("job",jobrepo)
    			   .flow(step)
    			   .end()
    			   .build();
      }
}
