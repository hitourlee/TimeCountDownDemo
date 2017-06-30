package com.example.timecounterdemo;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private CountDownTimerUtils mCountDownTimerUtils;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv_get_code = (TextView) findViewById(R.id.tv_get_code);
		mCountDownTimerUtils = new CountDownTimerUtils(tv_get_code, 5000, 1000);
		mCountDownTimerUtils.setmCountDownTimerListener(new CountDownTimerListener() {
			@Override
			public void onFinishedTimerCount(boolean success) {
				Toast.makeText(MainActivity.this, "计时完毕", 2000).show();
			}
		});

		tv_get_code.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mCountDownTimerUtils.start();
			}
		});
	}
}
