package com.example.myapplication.MetasPersonalizadas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.MetasPersonalizadas.Tab1.Tab1Fragment;
import com.example.myapplication.MetasPersonalizadas.Tab2.Tab2Fragment;
import com.example.myapplication.MetasPersonalizadas.Tab3.Tab3Fragment;
import com.example.myapplication.R;
import com.example.myapplication.menuActivity;
import com.google.android.material.tabs.TabLayout;

public class metasPersonalizadasResultsActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metaspersonalizadasresultados);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.viewpagerMetasPers);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabsMetasPerso);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), getResources().getString(R.string.tab1MetasPerso));
        adapter.addFragment(new Tab2Fragment(),  getResources().getString(R.string.tab2MetasPerso));
        adapter.addFragment(new Tab3Fragment(),  getResources().getString(R.string.tab3MetasPerso));
        viewPager.setAdapter(adapter);
    }

    public void onClickAppLogo(View view){
        Intent intent = new Intent(this, menuActivity.class);
        startActivity(intent);
    }
}