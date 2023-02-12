package com.anubhavtrainings.myclasses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SonyHDD implements IHardDisk {

	@Override
	public void powerOnHDD() {
		// TODO Auto-generated method stub
		System.out.println("My Sony HDD is power ON");

	}

	@Override
	public void powerOffHDD() {
		// TODO Auto-generated method stub
		System.out.println("My Sony HDD is power OFF");
	}

	@Override
	public void readHDD() {
		// TODO Auto-generated method stub
		System.out.println("Reading from Samsung 1tb @500 mbps");
	}

}
