package com.qingke.fsx;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressTest {

	@Test
	public void testGetDistance() {
		Address fs = Address.FS;
		Address rc = Address.RC;
		assertEquals("����ȣ�Ԥ��Ϊ100",100, fs.getDistance(),0);
		assertEquals("����ȣ�Ԥ��Ϊ300",301, rc.getDistance(),0);
	}

}
