package com.example.prathamesh.navigationtabs;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by PRATHAMESH on 24-02-2018.
 */

public class RecyclerViewAdapterButton extends RecyclerView.Adapter<RecyclerViewAdapterButton.MyViewHolder> {

    Context vContext;
    List<ButtonItems> lstbtn;
    private onItemClickListener myListener;



    public RecyclerViewAdapterButton(Context vContext, List<ButtonItems> lstbtn) {
        this.vContext = vContext;
        this.lstbtn = lstbtn;
    }

    public interface onItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        myListener =listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;

        v = LayoutInflater.from(vContext).inflate(R.layout.item_button,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v, myListener);


        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.txtname.setText(lstbtn.get(position).getNamebutton());
        holder.imgbtn.setImageResource(lstbtn.get(position).getImg());
        holder.txtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowAlertDialog();
            }
        });

    }


    private void ShowAlertDialog(){

        AlertDialog.Builder myBuilder = new AlertDialog.Builder(vContext);
        myBuilder.setTitle("Do you want to add this User?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(vContext, "Added", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(vContext, "Not Added", Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog alert = myBuilder.create();
        alert.show();
    }




    @Override
    public int getItemCount() {
        return lstbtn.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView txtname;
        private Button txtbtn;
        private ImageView imgbtn;

        public MyViewHolder(View itemView, final onItemClickListener listener) {
            super(itemView);

            txtname = (TextView) itemView.findViewById(R.id.name_bv_text);
            imgbtn = (ImageView) itemView.findViewById(R.id.image_bv);
            txtbtn = (Button) itemView.findViewById(R.id.button);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });



        }
    }

}
