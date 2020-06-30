package com.test.templatemethod;

abstract class AbstractClass {

	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}
	
	abstract void primitiveOperation1();
	
	abstract void primitiveOperation2();
	
	final void concreteOperation(){
		//concreteOperation() 메소드 코드
	}
	
	void hook() {
		
	}
	
}
