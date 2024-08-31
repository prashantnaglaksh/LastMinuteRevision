package com.java8features.optional;

import java.util.Optional;

/**
 * https://freedium.cfd/https://medium.com/@mikael_55667/it-should-be-mandatory-to-use-optionals-in-java-7d138f7efa1d
 * My only fear is that Optional will be overused.Please focus on using it as a return type
   (from methods that perform some useful piece of functionality) Please don't use it as the field of a Java-Bean.
 *As a side note, one reason not to use it in this way is that it creates an extra object for the garbage collector.
  If used as a method return type, the extra object is typically short-lived, which causes the gc little trouble.
  But when used in a Java-Bean, the object is likely to be long-lived, with a memory/gc overhead.
 *
 */
public class Basic {
	public static void main(String[] args) {
		
		Optional<String> so = Optional.ofNullable("ok");
		Optional<String> s = Optional.ofNullable(null);
		String sss = s.orElse("Some Default Value From orElse");
		
		System.out.println("i am sss ::" + sss);
		System.out.println("i am value.ixempty ::" + s.isEmpty());
		System.out.println("i am value.get ::" + s);
		System.out.println("i am value.hashcode ::" + s.hashCode());
		
		
		Optional<String> ss = Optional.of(null);
		
		System.out.println("i am value.ixempty ::" + ss.isEmpty());
		System.out.println("i am value.get ::" + ss.get());
		System.out.println("i am value.hashcode ::" + ss.hashCode());
		
		String[] stringArr = new String[5];
		stringArr[1] = "i am index 1 string";
		
		Optional<String> value = Optional.of(stringArr[2]);
		
		System.out.println("i am value.ixempty ::" + value.isEmpty());
		System.out.println("i am value.get ::" + value.get());
		System.out.println("i am value.hashcode ::" + value.hashCode());
		
	}
}
