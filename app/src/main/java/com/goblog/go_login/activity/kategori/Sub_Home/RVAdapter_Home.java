package com.goblog.go_login.activity.kategori.Sub_Home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.goblog.go_login.R;
import com.goblog.go_login.activity.HomeApp;

import java.util.List;

/**
 * Created by haikal on 4/16/2016.
 */
public class RVAdapter_Home extends RecyclerView.Adapter<RVAdapter_Home.MemberHomeViewHolder> {
    View option1;
    private List<com.goblog.go_login.activity.kategori.Sub_Home.Member_Home> members;
    private Context context;

    public RVAdapter_Home(List<Member_Home> members, Context context) {
        this.members = members;
        this.context = context;
    }

    public class MemberHomeViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView name_home;
        private ImageView photo_home;

        public MemberHomeViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv_home);
            name_home = (TextView) itemView.findViewById(R.id.home);
            photo_home = (ImageView) itemView.findViewById(R.id.photo_home);
        }
    }

    @Override
    public void onBindViewHolder(MemberHomeViewHolder memberhomeViewHolder, int i) {

        memberhomeViewHolder.name_home.setText(members.get(i).getNama());
        memberhomeViewHolder.photo_home.setImageResource(members.get(i).getPhotoID());
        if (members.get(i).getNama() == members.get(0).getNama()) {
            memberhomeViewHolder.name_home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, HomeApp.class));
                }
            });
        }



    }

    @Override
    public MemberHomeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_of_fragment_home, viewGroup, false);
        MemberHomeViewHolder memberhomeViewHolder = new MemberHomeViewHolder(view);
        return memberhomeViewHolder;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }
}