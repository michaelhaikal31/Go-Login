package com.goblog.go_login.activity.kategori;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goblog.go_login.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Fragment_Maps extends Fragment{
    private SupportMapFragment fragment;
    private GoogleMap map;
    public Fragment_Maps(){
        //Require empty Public Constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // View rootView = inflater.inflate(R.layout.fragment_peta,container, false);
        return inflater.inflate(R.layout.fragment_peta, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        FragmentManager fm = getChildFragmentManager();
        fragment = (SupportMapFragment)fm.findFragmentById(R.id.map);
        if(fragment == null){
            fragment = SupportMapFragment.newInstance();
            fm.beginTransaction().replace(R.id.map, fragment).commit();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if(map == null){
            map = fragment.getMap();
            map.addMarker(new MarkerOptions().position(new LatLng(0,0)));
        }
    }
}
