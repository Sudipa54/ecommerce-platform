package com.app.service;

import java.util.List;

import com.app.dto.AddressDto;
import com.app.entity.Address;

public interface AddressService {
	Address addAddress(AddressDto address);
	
	List<Address> viewAllAddress();
	
	Address viewAddress(int aid);
	
	boolean deleteAddress(int aid);
	

}
