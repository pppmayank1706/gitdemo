package com.anubhavtrainings.myclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class laptop {

	      private int length;
	      private int weight;
	      private int height;
	      private String brandName;
	      
	      @Autowired
	      private IHardDisk hdd;
	      
		  public int getLength() {
			return length;
		}
		
		
		


		public void setLength(int length) {
			this.length = length;
		}
		@Override
		public String toString() {
			hdd.powerOffHDD();
			hdd.powerOnHDD();
			return "laptop [length=" + length + ", brandName=" + brandName + "]";
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
	      
}
