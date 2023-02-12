package com.anubhavtrainings.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anubhavtrainings.entities.vendor;

@Component
public class vendorService {
	
	
    @Autowired
	IVendorPersistence vendor;
	
	
	public List<vendor> readAllVendors(){
		
		return vendor.findAll();
	}

	public vendor createVendor(vendor vendorObject) {
		return vendor.save(vendorObject);
	}
	
	public List <vendor> searchByCompanyName(String companyName){
		return vendor.findByCompanyName(companyName);
	}
	
	public List <vendor> lookUpCompanyName(String companyName){
		return vendor.lookupByCompanyName(companyName);
	}
	
	public Optional<vendor> getSingleVendor(Long id) {
		return vendor.findById(id);
	}
	
	public vendor changeVendors(vendor putBody){
		Optional<vendor> myVendor = vendor.findById(putBody.getID());
		if(!myVendor.isPresent())
		return new vendor((long)0,"","","","","","",null);
		return vendor.save(putBody);
	}
	
	public String deleteVendor(Long id) {
		vendor.deleteById(id);
		return "Deleted Successfully";
	}
//	 public vendor newlyCreate(vendor createBody) {
//		 createBody.code="newlyCreated";
//		 return createBody;
//	 }
        
	
}
