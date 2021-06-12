package com.nhom7.design.patterns.BehaviorialPatterns.State;

public class Ringing implements MobileAlertState{
		@Override
		public void alert() {
			System.out.println("Phone is ringing");
		}
}
