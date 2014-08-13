package com.nyul.androidgroupapp3.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public abstract class ParentActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
	
	@Override
	public void onClick(View v) {
		final int id = v.getId();

		switch (id) {
		case R.id.button1:
			onClickButton1(v);
			break;
		case R.id.button2:
			onClickButton2(v);
			break;
		case R.id.button3           :
			onClickButton3(v);
			break;
		case R.id.button4:
			onClickButton4(v);
			break;
		case R.id.button5:
			onClickButton5(v);
			break;
		case R.id.button6:
			onClickButton6(v);
			break;
		case R.id.button7:
			onClickButton7(v);
			break;
		case R.id.button8:
			onClickButton8(v);
			break;
		case R.id.button9:
			onClickButton9(v);
			break;
		case R.id.button10:
			onClickButton10(v);
			break;
		case R.id.button11:
			onClickButton11(v);
			break;
		case R.id.button12:
			onClickButton12(v);
			break;
		
		
		
		}
	}

	protected abstract void onClickButton1(View v);
	protected abstract void onClickButton2(View v);
    protected abstract void onClickButton3(View v);
    protected abstract void onClickButton4(View v);
    protected abstract void onClickButton5(View v);
    protected abstract void onClickButton6(View v);
    protected abstract void onClickButton7(View v);
    protected abstract void onClickButton8(View v);
    protected abstract void onClickButton9(View v);
    protected abstract void onClickButton10(View v);
    protected abstract void onClickButton11(View v);
    protected abstract void onClickButton12(View v);
    public void log(String message){
		Log.e(this.toString(), message);
	}

}
