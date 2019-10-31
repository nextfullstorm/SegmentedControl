package com.dld.segmentedcontrol;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.dld.view.SegmentedControlItem;
import com.dld.view.SegmentedControlView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author husong
 * github: https://github.com/danledian/SegmentedControl
 */
public class MainActivity extends AppCompatActivity
{
	private static final String TAG = "MainActivity";

	private SegmentedControlView mScv1;
	private SegmentedControlView mScv2;
	private SegmentedControlView mScv3;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mScv1 = findViewById(R.id.scv1);
		mScv2 = findViewById(R.id.scv2);
		mScv3 = findViewById(R.id.scv3);

		List<SegmentedControlItem> items1 = new ArrayList<>();
		items1.add(new SegmentedControlItem("Yesterday"));
		items1.add(new SegmentedControlItem("Today", false));
		items1.add(new SegmentedControlItem("Tomorrow"));
		items1.add(new SegmentedControlItem("Never"));
		mScv1.addItems(items1);

		List<SegmentedControlItem> items2 = new ArrayList<>();
		items2.add(new SegmentedControlItem("One"));
		items2.add(new SegmentedControlItem("Two"));
		items2.add(new SegmentedControlItem("Three"));
		items2.add(new SegmentedControlItem("Four"));
		mScv2.addItems(items2);

		mScv1.setItemEnabled(3, false);
		mScv2.setItemEnabled(0, false);

		// mScv3 filled from xml, see android:entries="@array/sc3Array"

		mScv1.setOnSegItemClickListener((item, position) ->
		{
			String msg = String.format(Locale.getDefault(), "selected:%d", position);
			Log.d(TAG, msg);
		});

		mScv3.setOnSegItemClickListener((item, position) ->
		{
			// getSelectedItem can get selected item index anytime, not just in OnSegItemClickListener
			String msg = String.format(Locale.getDefault(), "selected:%d", mScv3.getSelectedItem());
			Log.d(TAG, msg);
		});
	}
}
