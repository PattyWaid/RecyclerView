package com.example.prathamesh.navigationtabs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by PRATHAMESH on 24-02-2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] profile_name_card = {
            "Card 1","Card 2", "Card 3", "card 4", "Card 5"
    };

    private String[] profile_timestamp_card = {
            "1","2", "3", "4", "5"
    };

    private String[] titles_card = {
            "Card 1","Card 2", "Card 3", "card 4", "Card 5"
    };

    private int[] images_card = {
            R.drawable.background_card,R.drawable.background_card,R.drawable.background_card,R.drawable.background_card,R.drawable.background_card
    };

    private int[] images_profile_card = {
            R.drawable.unnamed,R.drawable.unnamed,R.drawable.unnamed,R.drawable.unnamed,R.drawable.unnamed
    };

    class ViewHolder extends RecyclerView.ViewHolder{


        public TextView profile_name_item;
        public TextView profile_timestamp_item;
        public TextView titles_card_item;
        public ImageView image_card_item;
        public ImageView image_profile_item;

        public ViewHolder(View itemView) {
            super(itemView);

            profile_name_item = (TextView) itemView.findViewById(R.id.txt_profile_name);
            profile_timestamp_item = (TextView) itemView.findViewById(R.id.txt_timestamp_profile);
            titles_card_item = (TextView) itemView.findViewById(R.id.txt_card);
            image_card_item = (ImageView) itemView.findViewById(R.id.img_card);
            image_profile_item = (ImageView) itemView.findViewById(R.id.img_card_profile);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_view,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.image_profile_item.setImageResource(images_profile_card[position]);
        viewHolder.profile_name_item.setText(profile_name_card[position]);
        viewHolder.profile_timestamp_item.setText(profile_timestamp_card[position]);
        viewHolder.titles_card_item.setText(titles_card[position]);
        viewHolder.image_card_item.setImageResource(images_card[position]);
    }

    @Override
    public int getItemCount() {
        return titles_card.length;
    }
}
