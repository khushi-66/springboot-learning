package com.isrdc.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="M9-B")
public interface Afeign {

	@GetMapping("/info")
	public String M9_B();

}
