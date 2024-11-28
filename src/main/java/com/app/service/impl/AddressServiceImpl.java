package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.AddressDto;
import com.app.entity.Address;
import com.app.repo.AddressRepo;
import com.app.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepo addressImpl;
	
	@Override
	public Address addAddress(AddressDto address) {
		// TODO Auto-generated method stub
		
		Address ad = new Address();
		BeanUtils.copyProperties(address, ad);
		
		ad.setStatus("Active");
		Address saveAdd = addressImpl.save(ad);
		return saveAdd;
		
	}

	@Override
	public List<Address> viewAllAddress() {
		return addressImpl.findAll();
	}

	@Override
	public Address viewAddress(int aid) {
		// TODO Auto-generated method stub
		Optional <Address> addressById = addressImpl.findById(aid);
		Address address = null;
		if (addressById.isPresent())
		{
			address = addressById.get();
		}
			
		return address;
	}

	@Override
	public boolean deleteAddress(int aid) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Address address;
		address = addressImpl.findById(aid).get();
		
		if(address != null)
		{
			address.setStatus("INACTIVE");
			addressImpl.deleteById(address.getAid());
			flag = true;
			
		}
		return flag;
	}

}
