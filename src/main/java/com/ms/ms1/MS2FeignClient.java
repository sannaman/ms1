package com.ms.ms1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms2", url = "http://ms2:9092")
public interface MS2FeignClient {

	@GetMapping("/ms2/guest/address/{id}")
	public GuestAddressDTO getGuestAddress(@PathVariable("id") String id);

}
