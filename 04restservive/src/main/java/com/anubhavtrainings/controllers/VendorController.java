package com.anubhavtrainings.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anubhavtrainings.entities.vendor;
import com.anubhavtrainings.services.vendorService;

@Component
@RestController
@RequestMapping("/")
public class VendorController {
	
	@Autowired
	vendorService vendorService;
	
	
	
	@RequestMapping("/vendor")
	public List<vendor> getVendors(){
		return vendorService.readAllVendors();
	}
	
	@RequestMapping("/vendor/search")
	public List<vendor> searchByCompany(@RequestParam String company)
	{
		return vendorService.searchByCompanyName(company);
	}
	
	@RequestMapping("/vendor/companyName")
	public List<vendor> searchCompany(@RequestParam String company){
		return vendorService.lookUpCompanyName(company);
	}
	
	
	@RequestMapping("/vendor/{vendorCode}")
	public vendor getVendorById(@PathVariable("vendorCode") Long code) {
			
		Optional<vendor> searchResult = vendorService.getSingleVendor(code);
		if(!searchResult.isPresent())
			return new vendor((long)0,"","","","","","",null);
			return searchResult.get();
		
	}
	
	
	@PutMapping("/changeVendor")
	public vendor updateVendor(@RequestBody vendor myUpdateBody) {
		return vendorService.changeVendors(myUpdateBody);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/deletevendor/{id}")
	public String deleteVendor(@PathVariable("id") Long id){
		return vendorService.deleteVendor(id);
	}
	
	
	
	
	
	
	@PostMapping("/vendor")
	public vendor createVendor(@RequestBody vendor myPostBody) {
		
		return vendorService.createVendor(myPostBody);
	}

	
}
