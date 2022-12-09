package com.demo.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnit_Prime {
	public static  boolean checkPrime(int num) {
		if(num<2) {
			return false;
		}else {
		for(int i=2;i<num;i++) {
			if(num%i!= 0) {
				return true;
			}
			return false;
		}
		return false;
	}
}}

