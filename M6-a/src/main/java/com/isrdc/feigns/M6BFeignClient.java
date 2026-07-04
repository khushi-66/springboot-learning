package com.isrdc.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="M6-b")
public interface M6BFeignClient {
	@GetMapping("/info")
   public String callM6BEndpoint() ;
   
}
