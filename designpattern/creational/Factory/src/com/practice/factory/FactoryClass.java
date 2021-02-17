package com.practice.factory;

import com.practice.api.Shape;
import com.practice.shapes.Circle;
import com.practice.shapes.Rectangle;

public class FactoryClass {
      public Shape getShapeInstance(String type)
      {
    	  if (type==null)
    		  return null;
    	  
    	  if(type.toUpperCase().equals("RECTANGLE"))
    	  {
    		  return new Circle();
    	  }
    	  if(type.toUpperCase().equals("CIRCLE"))
    	  {
    		  return new Rectangle();
    	  }
    	  return null;
      }
}
