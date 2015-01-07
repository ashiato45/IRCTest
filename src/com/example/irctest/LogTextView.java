package com.example.irctest;

import java.util.Vector;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class LogTextView extends TextView {
	public Vector<String> lines;



	public LogTextView(Context context) {
		super(context);
		// TODO 自動生成されたコンストラクター・スタブ
		lines = new Vector<String>();
	}

	public LogTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO 自動生成されたコンストラクター・スタブ
		lines = new Vector<String>();
	}

	public LogTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO 自動生成されたコンストラクター・スタブ
		lines = new Vector<String>();
	}

	public void Show(){
		String temp = "";
		for(String line: lines){
			temp += line + "\n";
		}
		this.setText(temp);
	}

/*	public void Initialize(){
		lines = new Vector<String>();;
	}*/

}
