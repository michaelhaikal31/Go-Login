package com.goblog.go_login.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.goblog.go_login.MapsActivity;
import com.goblog.go_login.R;
import com.goblog.go_login.activity.kategori.BantuanFragment;
import com.goblog.go_login.activity.kategori.ExkulFragment;
import com.goblog.go_login.activity.kategori.HomeFragment;
import com.goblog.go_login.activity.kategori.JurusanFragment;
import com.goblog.go_login.activity.kategori.KontakFragment;
import com.goblog.go_login.activity.kategori.PrestasiFragment;
import com.goblog.go_login.activity.kategori.ProfileFragment;
import com.goblog.go_login.activity.kategori.Sub_AboutAppFragment.DFragment;

public class HomeApp extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {
    private static String TAG = MainActivity.class.getSimpleName();
    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_app);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);
        displayView(0);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        DFragment dFragment = new DFragment();
        String title = getString(R.string.app_name);
        FragmentManager fm = getSupportFragmentManager();
        switch (position) {
            case 0:
                fragment = new HomeFragment();
                title = " ";/*getString(R.string.nav_item_Home);*/

                break;
            case 1:
                fragment = new ProfileFragment();
                title = getString(R.string.nav_item_Profile);
                break;
            case 2:
                fragment = new PrestasiFragment();
                title = getString(R.string.nav_item_Prestasi);
                break;
            case 3:
                fragment = new JurusanFragment();
                title = getString(R.string.nav_item_Jurusan);
                break;
            case 4:
                fragment = new ExkulFragment();
                title = getString(R.string.nav_item_Exkul);
                break;
            case 5:
                fragment = new MapsActivity();
                title = getString(R.string.nav_item_Peta);
                break;
            case 6:
                fragment = new KontakFragment();
                title = getString(R.string.nav_item_Kontak);
                break;
            case 7:
                fragment = new BantuanFragment();
                title = getString(R.string.nav_item_Bantuan);
                break;
            case 8:
                dFragment = new DFragment();
                dFragment.show(fm, "");
                title = getString(R.string.nav_item_About_App);
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onResume() {
        super.onResume();
        // .... other stuff in my onResume ....
        this.doubleBackToExitPressedOnce = false;
    }
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            /*finish();*/
            /*super.onBackPressed();
            return;*/
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press twice to exit", Toast.LENGTH_SHORT).show();

    }

}
