package com.anubhavtrainings.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anubhavtrainings.entities.address;

public interface IAddressPersistence extends JpaRepository<address, String> {

}