package com.goblog.go_login.activity.kategori.Sub_AboutAppFragment;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goblog.go_login.R;

/**
 * Created by haikal on 4/30/2016.
 */
public class DFragment extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        /** Inflating layout for the dialog */
        View v = inflater.inflate(R.layout.fragment_app_dfragment, null);
        getDialog().setTitle("About App");
        /** Getting the arguments passed to this fragment. Here we expects the selected item's position as argument */
        //Bundle b = getArguments();

        /** Setting the title for the dialog window *//*
        getDialog().setTitle("Time @ " + Country.name[b.getInt("position")] );
*/
        /** Getting the reference to the TextView object of the layout */
        //TextView tv = (TextView) v.findViewById(R.id.tv_current_time);

  /*      *//** Setting the current time to the TextView object of the layout *//*
        tv.setText(getCurTime(b.getInt("position")));
*/
        /** Returns the View object */
        return v;
    }
}
