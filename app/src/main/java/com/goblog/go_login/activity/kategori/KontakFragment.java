package com.goblog.go_login.activity.kategori;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.goblog.go_login.R;


public class KontakFragment extends Fragment {
    private ImageButton call;
    private ImageButton email;
    private ImageButton web;
    private ImageButton facebook;
    private ImageButton twitter;
    public KontakFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kontak,container, false);
        ImageButton call = (ImageButton)rootView.findViewById(R.id.call);
        ImageButton email = (ImageButton)rootView.findViewById(R.id.email);
        ImageButton web = (ImageButton)rootView.findViewById(R.id.web);
        ImageButton facebook = (ImageButton)rootView.findViewById(R.id.facebook);
        ImageButton twitter = (ImageButton)rootView.findViewById(R.id.twitter);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String var2 = "tel:" + "+62222506637".trim();
                Intent var3 = new Intent("android.intent.action.CALL");
                var3.setData(Uri.parse(var2));
                startActivity(var3);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] recipients = new String[]{"info@smkn4bdg.sch.id", " "};
                Intent send = new Intent(Intent.ACTION_SEND);
                send.setType("text/plain");
                send.putExtra(Intent.EXTRA_EMAIL, recipients);
                startActivity(send);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://smkn4bdg.sch.id"));
                startActivity(myWebLink);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWebLink = new Intent("android.intent.action.VIEW");
                myWebLink.setData(Uri.parse("https://www.facebook.com/smkn4bandung"));
                startActivity(myWebLink);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWebLink = new Intent("android.intent.action.VIEW");
                myWebLink.setData(Uri.parse("https://twitter.com/smkn4bdg"));
                startActivity(myWebLink);
            }
        });
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
