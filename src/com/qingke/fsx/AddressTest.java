package com.qingke.fsx;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressTest {

	@Test
	public void testGetDistance() {
		Address fs = Address.FS;
		Address rc = Address.RC;
		assertEquals("不相等，预期为100",100, fs.getDistance(),0);
		assertEquals("不相等，预期为300",301, rc.getDistance(),0);
	}

}
