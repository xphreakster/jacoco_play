package com.xphreak.web;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JacocoControllerTest {
	private JacocoController jacocoController;

	@Before
	public void setup() {
		this.jacocoController = new JacocoController();
	}

	@Test
	public void controllerMethod() {
		final String hello = this.jacocoController.controllerMethod();
		assertEquals("hello", hello);
	}
}
