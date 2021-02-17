package com.practice.execute;

import com.practice.api.Shape;
import com.practice.factory.FactoryClass;

public class DisplayShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryClass fc=new FactoryClass();
		Shape rc=fc.getShapeInstance("rectangle");
		rc.getShapeDetails();
		Shape ci=fc.getShapeInstance("circle");
		ci.getShapeDetails();
	}

}
