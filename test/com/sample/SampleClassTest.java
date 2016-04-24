package com.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.sample.SampleClass;

import junit.framework.TestCase;

/**
 * TODO
 * 
 * @author Takahiro Tsuchiya.
 *
 */
@RunWith(JUnit4.class)
public class SampleClassTest extends TestCase {

	SampleClass testClass = new SampleClass();

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();

		System.err.println("[Integer.MIN_VALUE]" + Integer.MIN_VALUE);
		System.err.println("[Integer.MAX_VALUE]" + Integer.MAX_VALUE);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	@Test
	public void method0001Test0001() {

		assertEquals("Error ", true, testClass.method0001(1, 1));
	}

	@Test
	public void method0001Test0002() {

		assertEquals("Error ", false, testClass.method0001(1, 2));
	}

	@Test
	public void method0002Test0001() {

		assertEquals("Error ", true, testClass.method0002(1, 1));
	}

	@Test
	public void method0002Test0002() {

		assertEquals("Error ", false, testClass.method0002(1, 2));
	}

	@Test
	public void method0003Test0001() {

		assertEquals("Error ", Integer.MIN_VALUE + 1, testClass.method0003(Integer.MIN_VALUE));
	}

	@Test
	public void method0003Test0002() {

		assertEquals("Error ", 1, testClass.method0003(0));
	}

	@Test
	public void method0003Test0003() {

		assertEquals("Error ", Integer.MIN_VALUE, testClass.method0003(Integer.MAX_VALUE));
	}

	@Test
	public void method0004Test0001() {

		assertEquals("Error ", 0, testClass.method0004(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}

	@Test
	public void method0004Test0002() {

		assertEquals("Error ", -1, testClass.method0004(Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	@Test
	public void method0004Test0003() {

		assertEquals("Error ", -1, testClass.method0004(Integer.MAX_VALUE, Integer.MIN_VALUE));
	}

	@Test
	public void method0004Test0004() {

		assertEquals("Error ", -2, testClass.method0004(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}

	@Test
	public void method0005Test0001() {

		assertEquals("Error ", -1, testClass.method0005(Integer.MIN_VALUE));
	}

	@Test
	public void method0005Test0002() {

		assertEquals("Error ", -2, testClass.method0005(Integer.MAX_VALUE));
	}

}
