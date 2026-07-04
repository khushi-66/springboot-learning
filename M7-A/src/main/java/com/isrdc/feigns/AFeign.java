package com.isrdc.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="M7-B")
public interface AFeign {
    @GetMapping("/act")
    public String M7b() ;
    	
    
}
