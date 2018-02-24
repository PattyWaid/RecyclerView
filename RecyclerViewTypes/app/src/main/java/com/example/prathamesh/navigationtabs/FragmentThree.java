package com.example.prathamesh.navigationtabs;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PRATHAMESH on 11-02-2018.
 */

public class FragmentThree extends Fragment {
    View v;
    private RecyclerView myRecyclerView;
    private List<Contact> lstContact;



    public FragmentThree() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v  = inflater.inflate(R.layout.fragment_three, container, false);
        myRecyclerView = (RecyclerView) v.findViewById(R.id.recyclerview_contact);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerAdapter);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Patty","9898654856",R.drawable.unnamed));
        lstContact.add(new Contact("Ash","8584875688",R.drawable.unnamed));
        lstContact.add(new Contact("Waid","485785685",R.drawable.unnamed));
        lstContact.add(new Contact("Broke","85875848698",R.drawable.unnamed));
        lstContact.add(new Contact("Misty","8875848568",R.drawable.unnamed));
        lstContact.add(new Contact("Garry","8878595868",R.drawable.unnamed));
        lstContact.add(new Contact("Jennie","8235426487",R.drawable.unnamed));
        lstContact.add(new Contact("Joy","8258695784",R.drawable.unnamed));
        lstContact.add(new Contact("Clare","8625487565",R.drawable.unnamed));
        lstContact.add(new Contact("Oak","825486526",R.drawable.unnamed));


    }


}
