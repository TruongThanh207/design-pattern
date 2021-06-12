package com.nhom7.design.patterns.BehaviorialPatterns.Mediator;

public interface IChatRoom {
	public void sendMessage(String msg, String userId);
	 
    void addUser(User user);
}
