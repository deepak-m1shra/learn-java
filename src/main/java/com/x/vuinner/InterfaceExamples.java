package com.x.vuinner;

interface InterfaceConcept{
	
	int initialSpeed =  10;
	long name = System.currentTimeMillis();
	
	
	public void doRun();
	public int reduceSpeed(int arg);
	default void legacySupport() {
		System.out.println("From the Interface: This is for legacy support: default method");
	}
	
	static void staticSomething() {
		System.out.println("From the Interface: In static method.. let's show some static..");
	}
	
}

class InterfaceExamples implements InterfaceConcept{

	@Override
	public void doRun() {
		System.out.println("Example from doRun() of InterfaceExamples class");
		
	}

	@Override
	public int reduceSpeed(int arg) {
		System.out.println("Example from reduceSpeed() of InterfaceExamples class, reducing speed by " + arg);
		return (InterfaceConcept.initialSpeed - arg);
	}
	
	public static void main(String[] args) {
		InterfaceConcept Ic1 = new InterfaceExamples();
		Ic1.doRun();
		System.out.println(Ic1.reduceSpeed(5));
		Ic1.legacySupport();
		InterfaceConcept.staticSomething();
	}
	
}