package com.java.practice;

public class UseOfAbs {

	public static void main(String[] args) {
		
		AbsOne cred = new ChildAbs();
		AbsOne upi = new UpiClass();
		
		PaymentGateWay gateWay = new PaymentGateWay();
		gateWay.payementGateWay(cred);
	}
}
