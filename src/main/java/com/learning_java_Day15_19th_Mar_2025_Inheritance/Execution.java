package com.learning_java_Day15_19th_Mar_2025_Inheritance;

public class Execution {

	public static void main(String[] args) {
		Child child = new Child();
		child.superCar();
		child.guitar();
		child.bungalow();
		child.shares();
		child.FourOOnek();
		child.trustFund();
		child.commercialStore();
		child.estateProperty();
		
		Parent parent = new Parent();
		parent.bungalow();
		parent.shares();
		parent.FourOOnek();
		parent.trustFund();
		parent.commercialStore();
		parent.estateProperty();
		
		GrandParent grandparent = new GrandParent();
		grandparent.trustFund();
		grandparent.commercialStore();
		grandparent.estateProperty();

	}

}
