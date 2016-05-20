package com.goblog.go_login.activity.kategori;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goblog.go_login.R;
import com.goblog.go_login.activity.kategori.Sub_Profile.SambutanProfile;
import com.goblog.go_login.activity.kategori.Sub_Profile.SejarahProfile;
import com.goblog.go_login.activity.kategori.Sub_Profile.Tentang_SekolahProfile;
import com.goblog.go_login.activity.kategori.Sub_Profile.Visi_MisiProfile;


/**
 * Created by haikal on 4/3/2016.
 */
public class ProfileFragment extends Fragment {

    public static int int_items = 4 ;
    private TabLayout tabLayout;
    private ViewPager viewPager ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);

        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return rootView;
    }

        class MyAdapter extends FragmentPagerAdapter{
        public MyAdapter(FragmentManager fm){
            super(fm);
        }
        public Fragment getItem(int position){
            switch (position){
                case 0 : return new SambutanProfile();
                case 1 :return new Tentang_SekolahProfile();
                case 2 :return new SejarahProfile();
                case 3 :return new Visi_MisiProfile();
            }
            return null;
        }
        public int getCount(){
            return  int_items;
        }
        public CharSequence getPageTitle(int position){
            switch (position){
                case 0 : return "Sambutan";
                case 1 :return "TentangSekolah";
                case 2 : return "SejarahSekolah";
                case 3 :return "Visi&Misi";
            }
            return null;
        }
    }
}
