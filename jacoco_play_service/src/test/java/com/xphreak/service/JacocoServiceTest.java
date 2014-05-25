package com.xphreak.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JacocoServiceTest {
	private JacocoService jacocoService;

	@Before
	public void setup() {
		jacocoService = new JacocoService();
	}

	@Test
	public void testGetMyName() {
		final String myName = jacocoService.getMyName();
		assertEquals("zsolt", myName);
	}

	@Test
	public void testGetAName() {
		final String aProvidedName = "name";
		final String returnedName = jacocoService.getAName(aProvidedName);
		assertEquals(aProvidedName, returnedName);
	}
}
