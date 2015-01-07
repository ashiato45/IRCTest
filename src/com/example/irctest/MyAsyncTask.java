package com.example.irctest;

import java.io.IOException;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

import android.os.AsyncTask;
import android.util.Log;

public class MyAsyncTask extends AsyncTask<Integer, Integer, Integer> {
	protected LogTextView logTextView;

	public MyAsyncTask(LogTextView ltv_) {
		// TODO 自動生成されたコンストラクター・スタブ
		logTextView = ltv_;
	}

	@Override
	protected Integer doInBackground(Integer... params) {
		Log.d("TAG", "Start");
		// TODO 自動生成されたメソッド・スタブ
		MyBot bot = new MyBot(logTextView);
		bot.setVerbose(true);
		try {
			bot.connect("irc.ircnet.ne.jp");
		} catch (NickAlreadyInUseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IrcException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		bot.joinChannel("#pricbot");

		Log.d("TAG", "End");
		return null;
	}


}
