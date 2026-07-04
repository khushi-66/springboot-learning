package com.isrdc.runners;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner  implements ApplicationRunner
{
    public void run(ApplicationArguments args) {
    	System.out.println("AppRunner is running......");
     Set<String>opt=args.getOptionNames();
     for(String next:opt) {
    	 System.out.println(" option name  "+next+"   Option Value"+ args.getOptionValues(next));
     }
     
     List<String>nopt=args.getNonOptionArgs();
     for(String next:nopt) {
    	 System.out.println(next+"   -------Non option ---------");
     }
    }
}
