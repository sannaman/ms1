package com.ms.ms1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class GuestProfileWebservice {

	@Autowired
	private GuestProfileServiceImpl service;

	@GetMapping("/guest/profile/{id}")
	public GuestProfileDTO getProfile(@PathVariable("id") String id) {

		GuestProfileDTO guestProfile = service.getGuestProfile(id);

		return guestProfile;
	}

}
