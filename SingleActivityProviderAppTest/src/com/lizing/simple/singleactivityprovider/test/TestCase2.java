package com.lizing.simple.singleactivityprovider.test;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.lizing.simple.singleactivityprovider.MyContentProvider;
import com.lizing.simple.singleactivityprovider.SingleActivityProviderAppActivity;

public class TestCase2 extends ActivityProviderInstrumentationTestCase2<SingleActivityProviderAppActivity, MyContentProvider> {

	Activity mTestActivity;
	EditText mText;
	Button mAddButton;
	Button mDelAllButton;
	Button mMoveButton;
	
	public TestCase2(){
		super(SingleActivityProviderAppActivity.class, MyContentProvider.class, "com.lizing.simple.singleactivityprovider");
	}
	
	public void setUp() throws Exception{
		super.setUp();
		mTestActivity = startActivity();
		assertNotNull(mTestActivity);
		mText = (EditText) mTestActivity.findViewById(com.lizing.simple.singleactivityprovider.R.id.editText1);
		assertNotNull(mText);
		mAddButton = (Button) mTestActivity.findViewById(com.lizing.simple.singleactivityprovider.R.id.btn_add);
		assertNotNull(mAddButton);
		mDelAllButton = (Button) mTestActivity.findViewById(com.lizing.simple.singleactivityprovider.R.id.btn_del_all);
		assertNotNull(mDelAllButton);
		mMoveButton = (Button) mTestActivity.findViewById(com.lizing.simple.singleactivityprovider.R.id.btn_move);
	}
	
	public void testAddButton(){
		mText.setText("Hello Test!!");
		
		mAddButton.performClick();
	}
	
	public void testMoveButton(){
		mMoveButton.performClick();
	}
}
