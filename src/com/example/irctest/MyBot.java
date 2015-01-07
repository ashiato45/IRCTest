package com.example.irctest;

import org.jibble.pircbot.PircBot;

public class MyBot extends PircBot {
	LogTextView ltv;

	public MyBot(LogTextView ltv_) {
		// TODO 自動生成されたコンストラクター・スタブ
		ltv = ltv_;
		this.setName("MyBot");
	}

	@Override
	protected void onMessage(String channel, String sender, String login,
			String hostname, String message) {
		// TODO 自動生成されたメソッド・スタブ
		ltv.lines.add(String.format("%s:「%s」", sender, message));
		super.onMessage(channel, sender, login, hostname, message);
	}


}
