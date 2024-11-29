package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AddressDto;
import com.app.entity.Address;
import com.app.service.impl.AddressServiceImpl;

@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	private AddressServiceImpl serviceImpl;
	
	@PostMapping("/add")
	public ResponseEntity<?> createAddress(@RequestBody AddressDto address)
	{
		Address add = serviceImpl.addAddress(address);
		if(add != null)
			return new ResponseEntity(HttpStatus.OK).ok(add);
		else
			return new ResponseEntity(HttpStatus.OK).ok("Address insertion failed");
		
	}
	
	// Get all address
	@GetMapping("/all")
	public ResponseEntity<?> getAllAddress()
	{
		List<Address> allAddress;
		allAddress = serviceImpl.viewAllAddress();
		if(allAddress != null && !allAddress.isEmpty())
			return new ResponseEntity(HttpStatus.OK).ok(allAddress);
		else
			return new ResponseEntity(HttpStatus.OK).ok("Cannot fetch all address");
	
	}
	
	// Get address by ID
	@GetMapping("/{aid}")
	public ResponseEntity<?> getAddress(@PathVariable int aid)
	{
		Address addressById;
		addressById = serviceImpl.viewAddress(aid);
		if(addressById != null)
			return new ResponseEntity(HttpStatus.OK).ok(addressById);
		else
			return new ResponseEntity(HttpStatus.OK).ok("Cannot fetch the address id" + aid);
	
	}
	
	
	// Delete address by ID
	@DeleteMapping("/delete/{aid}")
	public String deleteAddress(@PathVariable int aid)
	{
		
		boolean isDeleted = serviceImpl.deleteAddress(aid); 
		
		if(isDeleted)
		{
			return "Address deleted Sucessfully";
		}
		else
			return "Address not deleted";
		
	}
}
