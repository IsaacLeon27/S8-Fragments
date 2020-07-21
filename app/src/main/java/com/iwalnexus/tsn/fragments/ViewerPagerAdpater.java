package com.iwalnexus.tsn.fragments;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static com.iwalnexus.tsn.fragments.MainActivity.TABDOS;
import static com.iwalnexus.tsn.fragments.MainActivity.TABMAIN;

public class ViewerPagerAdpater extends FragmentPagerAdapter {

    private int numeroTabs;

    public ViewerPagerAdpater(@NonNull FragmentManager fm, Context context, int numeroTabs) {
        super(fm);
        this.numeroTabs = numeroTabs;
    }


    @Override
    public Fragment getItem(int position) {

        switch(position){
            case TABMAIN:
            return new FragmentUno();
            case TABDOS:
                return new FragmentDos();
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return numeroTabs;
    }
}
