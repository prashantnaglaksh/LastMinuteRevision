package com.miscelenous;

import java.util.HashMap;
import java.util.Map;

/**
 *	Table Driven Method To Handle Multiple If Else Code Block
 *	If We Follow This Approach Then In Future We Will Require No Change In Our Main Class We Just Have To Add A New Class
	If A New Condition Arrive
**/

//In Java, all methods declared in an interface are implicitly public
interface IHandleMultipleIf{
	void doAction();
}

//we can not reduce the visibility of method we are implementing from interfaces
class HandleIf1 implements IHandleMultipleIf{
	public void doAction() {
		System.out.println("From HandleIf1");
	}
}

class HandleIf2 implements IHandleMultipleIf{
	public void doAction() {
		System.out.println("From HandleIf2");
	}
}

public class TableDrivenMethod {
	public static void main(String[] args) {
		Map<String, IHandleMultipleIf> actionMap = new HashMap<>();
		actionMap.put("code1", new HandleIf1());
		actionMap.put("code2", new HandleIf2());
		
		actionMap.get("code1").doAction();
		actionMap.get("code2").doAction();
	}
}











