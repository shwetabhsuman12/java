package com.practice.factory;

import com.practice.api.Shape;
import com.practice.shapes.Circle;
import com.practice.shapes.Rectangle;

public class FactoryClass {
	 public Shape getInstance(String type)
	 {
		 if ( type==null)
			 return null;
		 if(type.equalsIgnoreCase("CIRCLE"))
		 {
			 return new Circle();
		 }
		 if(type.equalsIgnoreCase("RECTANGLE"))
		 {
			 return new Rectangle();
		 }
		 return null;
	 }
}
