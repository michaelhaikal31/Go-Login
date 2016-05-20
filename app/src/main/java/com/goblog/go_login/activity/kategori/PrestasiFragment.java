package com.goblog.go_login.activity.kategori;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goblog.go_login.R;
import com.goblog.go_login.activity.kategori.Sub_Prestasi.Adapter_Prestasi;
import com.goblog.go_login.activity.kategori.Sub_Prestasi.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haikal on 4/3/2016.
 */
public class PrestasiFragment extends Fragment {
    private List<Item> items;
    private String  name[];
    private TypedArray images;
    private RecyclerView recyclerView;
    public PrestasiFragment(){   }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_prestasi,container, false);
        final FragmentActivity c = getActivity();

        name = getResources().getStringArray(R.array.names);
        images = getResources().obtainTypedArray(R.array.profile_pics);

        items = new ArrayList<Item>();
        for(int i=0; i< name.length; i++){
            Item item = new Item(name[i], images.getResourceId(i, -1));
            items.add(item);
        }
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerview_prestasi);
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(c, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        Adapter_Prestasi adapterManager = new Adapter_Prestasi(items, c);
        recyclerView.setAdapter(adapterManager);
        /*GridView gridView = (GridView)rootView.findViewById(R.id.gridview);
        gridView.setAdapter(new MyAdapter(c));*/

        FloatingActionButton fab = (FloatingActionButton)rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://smkn4bdg.sch.id/prestasi/tingkat/akademik"));
                startActivity(myWebLink);
            }
        });
        /*gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView parent, View v, int position, long id)
            {
                // this 'mActivity' parameter is Activity object, you can send the current activity.
                Intent i = new Intent(c, Sub_Exkul_Seni_angkung.class);
                startActivity(i);
            }
        });*/
        return rootView;
    }
    /*private class MyAdapter extends BaseAdapter
    {
        private List<Item> items = new ArrayList<Item>();
        private LayoutInflater inflater;
        public MyAdapter(Context context)
        {
            inflater = LayoutInflater.from(context);
            items.add(new Item("Juara 1 Festival Paduan Angklung FPA ITB XIV 2015", R.drawable.pretasi_1));
            items.add(new Item("WINNER INTERNATIONAL STUDENT PHOTO COMPETITION", R.drawable.prestasi_2));
            items.add(new Item("Juara I dan Juara Harapan I LKS Nasional 2014 di ...", R.drawable.prestasi_3));
            items.add(new Item("Juara 1 Web Design Competition ITBH 2015", R.drawable.prestasi_4));
            items.add(new Item("Juara II, III, IV dan VII Seleksi Nasional Calon ...", R.drawable.prestasi_5));
            items.add(new Item("Juara 1 LKS Provinsi Jawa Barat Bidang Lomba Web ...", R.drawable.prestasi_6));
            items.add(new Item("Juara 2 Tingkat Nasional UNPAD Motekar 2014", R.drawable.prestasi_7));
            items.add(new Item("Upacara Peringatan HUT RI Ke 70", R.drawable.prestasi_8));
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i)
        {
            return items.get(i);
        }

        @Override
        public long getItemId(int i)
        {
            return items.get(i).drawableId;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            View v = view;
            ImageView picture;
            TextView name;

            if(v == null)
            {
                v = inflater.inflate(R.layout.gridview_item, viewGroup, false);
                v.setTag(R.id.picture, v.findViewById(R.id.picture));
                v.setTag(R.id.text, v.findViewById(R.id.text));
            }

            picture = (ImageView)v.getTag(R.id.picture);
            name = (TextView)v.getTag(R.id.text);

            Item item = (Item)getItem(i);

            picture.setImageResource(item.drawableId);
            name.setText(item.name);

            return v;
        }

        private class Item
        {
            final String name;
            final int drawableId;

            Item(String name, int drawableId)
            {
                this.name = name;
                this.drawableId = drawableId;
            }
        }

    }*/


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
