package com.jdc.hhs.test;

import org.junit.jupiter.api.Test;

import com.jdc.hhs.handler.Handler;

public class HandlerTest {
	
	@Test
	void testName() {
		Handler handle = new Handler();
		handle.useName();
	}
}
