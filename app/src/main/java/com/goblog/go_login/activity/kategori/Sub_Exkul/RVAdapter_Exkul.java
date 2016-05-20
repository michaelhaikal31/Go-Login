package com.goblog.go_login.activity.kategori.Sub_Exkul;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.goblog.go_login.R;

import java.util.List;

/**
 * Created by haikal on 4/16/2016.
 */
public class RVAdapter_Exkul extends RecyclerView.Adapter<RVAdapter_Exkul.MemberExkulViewHolder> {

    private List<Member_Exkul> members;
    private Context context;

    public RVAdapter_Exkul(List<Member_Exkul> members, Context context) {
        this.members = members;
        this.context = context;
    }

    public class MemberExkulViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView name_exkul;
        private ImageView photo_exkul;

        public ImageView image_action_more;
        public ImageView image_action_share;
        public ImageView image_action_bookmark;

        public MemberExkulViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv_exkul);
            name_exkul = (TextView) itemView.findViewById(R.id.exkul);
            photo_exkul = (ImageView) itemView.findViewById(R.id.photo_exkul);

            image_action_more = (ImageView) itemView.findViewById(R.id.image_action_more_exkul);
            image_action_share = (ImageView) itemView.findViewById(R.id.image_action_share_exkul);
            image_action_bookmark = (ImageView) itemView.findViewById(R.id.image_action_bookmark_exkul);
        }
    }

    @Override
    public void onBindViewHolder(MemberExkulViewHolder memberexkulViewHolder, int i) {
        memberexkulViewHolder.name_exkul.setText(members.get(i).getNama());
        memberexkulViewHolder.photo_exkul.setImageResource(members.get(i).getPhotoID());

        memberexkulViewHolder.image_action_bookmark.setImageResource(members.get(i).getBookmark());
        memberexkulViewHolder.image_action_share.setImageResource(members.get(i).getShare());
        memberexkulViewHolder.image_action_more.setImageResource(members.get(i).getMore());
        if (members.get(i).getNama() == members.get(0).getNama())
        {
            memberexkulViewHolder.name_exkul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Sub_Exkul_Seni_angkung.class));
                }
            });
        }
        else if (members.get(i).getNama() == members.get(1).getNama())
        {
            memberexkulViewHolder.name_exkul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Sub_Exkul_Tenologi.class));
                }
            });
        }else if (members.get(i).getNama() == members.get(2).getNama())
        {
            memberexkulViewHolder.name_exkul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Sub_Exkul_Olahraga_Futsal.class));
                }
            });
        }

        if (members.get(i).getBookmark() == members.get(i).getBookmark()) {
            memberexkulViewHolder.image_action_bookmark.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar snackbar = Snackbar.make(view, "The Article will Save", Snackbar.LENGTH_LONG).setAction("DELETE", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Snackbar Snackbar1 = Snackbar.make(v, "The Article has been Deleted!", Snackbar.LENGTH_INDEFINITE);
                            Snackbar1.show();
                        }
                    });
                    snackbar.setActionTextColor(Color.RED);
                    // Changing action button text color
                    View sbView = snackbar.getView();
                    TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.WHITE);

                    snackbar.show();
                }
            });
        }
        if (members.get(i).getShare() == members.get(i).getShare()) {
            memberexkulViewHolder.image_action_share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                    sharingIntent.setType("text/html");
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<p>This is the text that will be shared.</p>"));
                    context.startActivity(Intent.createChooser(sharingIntent, "Share using"));
                }
            });
        }
    }

    @Override
    public MemberExkulViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_of_fragment_exkul, viewGroup, false);
        MemberExkulViewHolder memberexkulViewHolder = new MemberExkulViewHolder(view);
        return memberexkulViewHolder;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }
}