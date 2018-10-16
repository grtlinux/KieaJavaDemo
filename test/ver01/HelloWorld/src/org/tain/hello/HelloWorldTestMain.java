package org.tain.hello;

public class HelloWorldTestMain {

	private static final boolean flag;
	private static final String className;
	
	static {
		flag = true;
		className = new Object(){}.getClass().getEnclosingClass().getName();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws Exception {
		if (flag) System.out.println(">>>>> " + className);
	}
}
