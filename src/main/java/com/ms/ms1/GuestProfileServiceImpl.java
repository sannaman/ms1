package com.ms.ms1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestProfileServiceImpl {

	@Autowired
	private MS2FeignClient client;

	public GuestProfileDTO getGuestProfile(String id) {

		GuestAddressDTO guestAddress = client.getGuestAddress(id);

		GuestProfileDTO dto = new GuestProfileDTO();
		dto.setAddressDTO(guestAddress);
		dto.setName(id);
		dto.setOccupation("Army");

		return dto;
	}

}
