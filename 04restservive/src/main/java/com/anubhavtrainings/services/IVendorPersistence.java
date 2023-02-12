package com.anubhavtrainings.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anubhavtrainings.entities.vendor;

public interface IVendorPersistence extends JpaRepository<vendor, Long>{
          
	List <vendor>  findByCompanyName(String companyName);
	
	@Query(nativeQuery=true, value = "select * from public.vendor where lower(COMPANY_NAME) like %?1%")
	 List <vendor> lookupByCompanyName(String companyName);
}
