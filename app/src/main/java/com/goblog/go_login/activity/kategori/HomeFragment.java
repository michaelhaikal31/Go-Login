package com.goblog.go_login.activity.kategori;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goblog.go_login.R;
import com.goblog.go_login.activity.kategori.Sub_Home.Member_Home;

import java.util.List;

/**
 * Created by haikal on 4/3/2016.
 */
public class HomeFragment extends Fragment {
    private RecyclerView recyclerview;
    private String[] names;
    private TypedArray profile_pics;
    private List<Member_Home> memberList;
    private DrawerLayout mDrawerLayout;
    public HomeFragment(){  }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        /*recyclerview = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        final FragmentActivity c = getActivity();
        names = getResources().getStringArray(R.array.home);
        profile_pics = getResources().obtainTypedArray(R.array.photo_home);
        memberList = new ArrayList<Member_Home>();
        for (int i = 0; i < names.length; i++) {
            Member_Home member = new Member_Home(names[i], profile_pics.getResourceId(i, -1));
            memberList.add(member);

        }
        GridLayoutManager layoutManager = new GridLayoutManager(c, 2);
        recyclerview.setLayoutManager(layoutManager);
        RVAdapter_Home adapter = new RVAdapter_Home(memberList, c);
        recyclerview.setAdapter(adapter);*/
        return rootView;

    }


}
