package com.anubhavtrainings.myclasses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SamsungHDD implements IHardDisk {

	@Override
	public void powerOnHDD() {
		// TODO Auto-generated method stub
		System.out.println("My samsung HDD is power ON");

	}

	@Override
	public void powerOffHDD() {
		// TODO Auto-generated method stub
		System.out.println("My samsung HDD is power OFF");
	}

	@Override
	public void readHDD() {
		// TODO Auto-generated method stub
		System.out.println("Reading from Samsung 500gb @200 mbps");
	}

}
