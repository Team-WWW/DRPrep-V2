package in.drprep.navigationdrawer;

import in.drprep.navigationdrawer.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MenuFragment extends Fragment{
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
		// Retrieving the currently selected item number
		int position = getArguments().getInt("position");
		
		// List of rivers
		String[] menu = getResources().getStringArray(R.array.menu);
		
		// Creating view corresponding to the fragment
		View v = inflater.inflate(R.layout.fragment_layout, container, false);
		
		// Getting reference to the TextView of the Fragment
		TextView tv = (TextView) v.findViewById(R.id.tv_content);
		
		// Setting currently selected river name in the TextView
		tv.setText(menu[position]);		
		
		// Updating the action bar title
		getActivity().getActionBar().setTitle(menu[position]);
		
		return v;
	}
}