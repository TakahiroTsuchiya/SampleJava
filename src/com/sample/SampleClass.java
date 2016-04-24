package com.sample;

/**
 * TODO
 * 
 * @author Takahiro Tsuchiya.
 *
 */
public class SampleClass {

	public boolean method0001(int a, int b) {

		boolean flag;

		if (a == b) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

	public boolean method0002(int a, int b) {

		boolean flag = false;

		if (a == b) {
			flag = true;
		}

		return flag;
	}

	public int method0003(int a) {

		int b = 1;

		return b + a;
	}

	public int method0004(int a, int b) {

		return a + b;
	}

	public int method0005(int a) {

		int b = Integer.MAX_VALUE;

		return b + a;
	}
}
