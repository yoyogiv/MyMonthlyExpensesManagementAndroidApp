package com.mymonthlyexpenses.management_system.view;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Button;
import android.widget.EditText;

public class AddFilterDialogFragment extends DialogFragment {
	EditText txtAddFilterDate;
	Button btn;
	static String dialogTitle;

	// ---Interface containing methods to be implemented
	// by calling activity---
	public interface AddFilterDialogListener {
		void onFinishFilterDialog(String filterDate);
	}

	public AddFilterDialogFragment() {
		// ---empty constructor required---
	}

	// ---set the title of the dialog window---
	public void setDialogTitle(String title) {
		dialogTitle = title;
	}

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		// Use the current date as the default date in the picker
		final Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);

		// Create a new instance of DatePickerDialog and return it
		return new DatePickerDialog(getActivity(),
				(OnDateSetListener) getActivity(), year, month, day);
	}

}
