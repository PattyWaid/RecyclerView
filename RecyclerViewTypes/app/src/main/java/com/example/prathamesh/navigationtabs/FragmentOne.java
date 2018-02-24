package com.example.prathamesh.navigationtabs;

/**
 * Created by PRATHAMESH on 17-02-2018.
 */

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by PRATHAMESH on 11-02-2018.
 */

public class FragmentOne extends Fragment {

    View v;
    private RecyclerView recyclerViewButton;
    private List<ButtonItems> lstbtn;

    public FragmentOne() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_one,container,false);
        recyclerViewButton = (RecyclerView) v.findViewById(R.id.recyclerview_button);
        RecyclerViewAdapterButton recyclerViewAdapterButton = new RecyclerViewAdapterButton(getContext(),lstbtn);
        recyclerViewButton.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewButton.setAdapter(recyclerViewAdapterButton);

        recyclerViewAdapterButton.setOnItemClickListener(new RecyclerViewAdapterButton.onItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String msg = lstbtn.get(position).getNamebutton();
                Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
            }
        });

        return v;





    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstbtn = new ArrayList<>();
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Patty"));
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Ash"));
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Misty"));
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Broke"));
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Garry"));
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Jeenie"));
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Joy"));
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Claire"));
        lstbtn.add(new ButtonItems(R.drawable.unnamed,"Oak"));
    }

 /*   @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn = (Button) getActivity().findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowAlertDialog();

            }
        });




    }

    private void ShowAlertDialog(){

        AlertDialog.Builder myBuilder = new AlertDialog.Builder(getContext());
        myBuilder.setTitle("My Dialog Box")
                .setPositiveButton("Positive", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Positive", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Negative", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Negative", Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog alert = myBuilder.create();
        alert.show();
    }*/
}

