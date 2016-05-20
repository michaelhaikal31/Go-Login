package com.goblog.go_login.activity.kategori.Sub_Jurusan;

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
public class RVAdapter_Jurusan extends RecyclerView.Adapter<RVAdapter_Jurusan.MemberJurusanViewHolder> {


    private List<Member_Jurusan> members;
    private Context context;

    public RVAdapter_Jurusan(List<Member_Jurusan> members, Context context) {
        this.members = members;
        this.context = context;
    }

    public class MemberJurusanViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView name_jurusan;
        private ImageView photo_jurusan;
        public ImageView image_action_more;
        public ImageView image_action_share;
        public ImageView image_action_bookmark;

        public MemberJurusanViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv_jurusan);
            name_jurusan = (TextView) itemView.findViewById(R.id.jurusan);
            photo_jurusan = (ImageView) itemView.findViewById(R.id.photo_jurusan);
            image_action_more = (ImageView) itemView.findViewById(R.id.image_action_more);
            image_action_share = (ImageView) itemView.findViewById(R.id.image_action_share);
            image_action_bookmark = (ImageView) itemView.findViewById(R.id.image_action_bookmark);
        }
    }

    @Override
    public void onBindViewHolder(MemberJurusanViewHolder memberjurusanViewHolder, int i) {

        memberjurusanViewHolder.name_jurusan.setText(members.get(i).getNama());
        memberjurusanViewHolder.photo_jurusan.setImageResource(members.get(i).getPhotoID());
        memberjurusanViewHolder.image_action_bookmark.setImageResource(members.get(i).getBookmark());
        memberjurusanViewHolder.image_action_share.setImageResource(members.get(i).getShare());
        memberjurusanViewHolder.image_action_more.setImageResource(members.get(i).getMore());

        if (members.get(i).getNama() == members.get(0).getNama()) {
                memberjurusanViewHolder.name_jurusan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = view.getContext();
                        context.startActivity(new Intent(context, Sub_Jurusan_TKJ.class));
                    }
                });
        }
        if (members.get(i).getNama() == members.get(1).getNama()) {
            memberjurusanViewHolder.name_jurusan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Sub_Jurusan_PRL.class));
                }
            });
        }
        if (members.get(i).getNama() == members.get(2).getNama()) {
            memberjurusanViewHolder.name_jurusan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Sub_Jurusan_MM.class));
                }
            });
        }
        if (members.get(i).getNama() == members.get(3).getNama()) {
            memberjurusanViewHolder.name_jurusan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Sub_Jurusan_TOI.class));
                }
            });
        }
        if (members.get(i).getNama() == members.get(4).getNama()) {
            memberjurusanViewHolder.name_jurusan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Sub_Jurusan_TPTL.class));
                }
            });
        }
        if (members.get(i).getNama() == members.get(5).getNama()) {
            memberjurusanViewHolder.name_jurusan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, Sub_Jurusan_TEAV.class));
                }
            });
        }

            if (members.get(i).getBookmark() == members.get(i).getBookmark()) {
                memberjurusanViewHolder.image_action_bookmark.setOnClickListener(new View.OnClickListener() {
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
                memberjurusanViewHolder.image_action_share.setOnClickListener(new View.OnClickListener() {
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
    public MemberJurusanViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_of_fragment_jurusan, viewGroup, false);
        MemberJurusanViewHolder memberjurusanViewHolder = new MemberJurusanViewHolder(view);
        return memberjurusanViewHolder;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }
}