package com.iwalnexus.tsn.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDos extends Fragment {


    public FragmentDos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_fragment_dos, container, false);
    }

    @Override
    public void onPause() {

        Toast.makeText(getContext(),"Pausando",Toast.LENGTH_LONG).show();
        super.onPause();
    }
}
