package com.practice.executor;

import com.practice.api.Shape;
import com.practice.factory.FactoryClass;

public class DisplayShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryClass fc= new FactoryClass();
        Shape ci=fc.getInstance("circle");
        ci.getShapeDetails();
        ci.finish();
	}

}
