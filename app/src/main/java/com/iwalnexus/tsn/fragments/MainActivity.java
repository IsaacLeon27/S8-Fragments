package com.iwalnexus.tsn.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    boolean cual = false;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewerPagerAdpater adapter;

    public static final int TABMAIN = 0;
    public static final int TABDOS = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new FragmentUno()).commit();
        cual = true;*/

        setToolbar();
        setTablayout();
        setViewerPager();
        setListerTabLayout(viewPager);

        Button cambio = findViewById(R.id.changeFragment);

        cambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cual == false ){
                    getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new FragmentUno()).commit();
                    cual = true;
                } else{
                    getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new FragmentDos()).commit();
                    cual = false;
                }


            }
        });
    }

    private void setViewerPager() {

        viewPager = findViewById(R.id.contenedor);
        adapter = new ViewerPagerAdpater(getSupportFragmentManager(), this, tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    private void setTablayout() {
     tabLayout = findViewById(R.id.tablayout);
     tabLayout.addTab(tabLayout.newTab().setText("Uno"));
     tabLayout.addTab(tabLayout.newTab().setText("Dos"));

    }

    private void setToolbar() {

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Toolbar");
        setSupportActionBar(toolbar);
    }

    private void setListerTabLayout(final ViewPager viewPager){
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){


            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
