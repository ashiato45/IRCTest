package com.example.irctest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btnPost = (Button)findViewById(R.id.btnPost);
		LogTextView txtLog = (LogTextView)findViewById(R.id.txtLog);

		btnPost.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				LogTextView txtLog = (LogTextView)findViewById(R.id.txtLog);
				EditText txtMessage = (EditText)findViewById(R.id.txtMessage);
				// TODO 自動生成されたメソッド・スタブ

				txtLog.lines.add(txtMessage.getText().toString());
				txtMessage.clearComposingText();
				txtMessage.setText("");
				txtLog.Show();


			}
		});


		MyAsyncTask mat = new MyAsyncTask(txtLog);
		mat.execute(0);

/*		IRCConnection conn = new IRCConnection("irc.ircnet.ne.jp", 6667, 6669, "", "ashiato45", "ashiato45", "realname");
		conn.addIRCEventListener(new MyIRCEventListener());
		conn.setDaemon(true);
		conn.setColors(false);
		conn.setPong(true);

		try {
			conn.connect();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
*/

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
