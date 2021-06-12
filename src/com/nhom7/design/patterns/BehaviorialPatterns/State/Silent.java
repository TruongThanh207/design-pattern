package com.nhom7.design.patterns.BehaviorialPatterns.State;

public class Silent implements MobileAlertState{
		@Override
		public void alert() {
			System.out.println("Phone is in silent mode");
		}
}
