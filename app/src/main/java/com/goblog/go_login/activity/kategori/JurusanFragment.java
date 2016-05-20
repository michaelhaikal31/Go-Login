package com.goblog.go_login.activity.kategori;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.goblog.go_login.R;
import com.goblog.go_login.activity.kategori.Sub_Jurusan.Member_Jurusan;
import com.goblog.go_login.activity.kategori.Sub_Jurusan.RVAdapter_Jurusan;

import java.util.ArrayList;
import java.util.List;


public class JurusanFragment extends Fragment {
    private RecyclerView recyclerview;
    private String[] names;
    private TypedArray profile_pics;
    private String[] emails;
    private TypedArray bookmark;
    private TypedArray share;
    private TypedArray more;
    private List<Member_Jurusan> memberList;
    private DrawerLayout mDrawerLayout;
    public JurusanFragment(){  }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_jurusan, container, false);
        recyclerview = (RecyclerView) rootView.findViewById(R.id.recyclerview_jurusan);
        final FragmentActivity c = getActivity();
        names = getResources().getStringArray(R.array.jurusan);
        profile_pics = getResources().obtainTypedArray(R.array.photo_jurusan);
        bookmark =getResources().obtainTypedArray(R.array.button_bookmark);
        share =getResources().obtainTypedArray(R.array.button_share);
        more =getResources().obtainTypedArray(R.array.button_more);
        memberList = new ArrayList<Member_Jurusan>();
        for (int i = 0; i < names.length; i++) {
            Member_Jurusan member = new Member_Jurusan(names[i], profile_pics.getResourceId(i, -1),bookmark.getResourceId(i, -1),share.getResourceId(i, -1),more.getResourceId(i, -1));
            memberList.add(member);

        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerview.setLayoutManager(layoutManager);
        RVAdapter_Jurusan adapter = new RVAdapter_Jurusan(memberList, c);
        recyclerview.setAdapter(adapter);



        /*CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout)rootView.findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Program Studi");*/
        return rootView;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
