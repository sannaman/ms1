package com.ms.ms1;

public class GuestProfileDTO {

	private String name;
	private String occupation;
	private GuestAddressDTO addressDTO;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public GuestAddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(GuestAddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

}
