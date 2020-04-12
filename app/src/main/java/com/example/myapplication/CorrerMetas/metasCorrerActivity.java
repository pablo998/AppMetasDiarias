package com.example.myapplication.CorrerMetas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.CorrerMetas.Tab1.Tab1Fragment;
import com.example.myapplication.CorrerMetas.Tab2.Tab2Fragment;
import com.example.myapplication.CorrerMetas.Tab3.Tab3Fragment;
import com.example.myapplication.R;
import com.example.myapplication.menuActivity;
import com.example.myapplication.nivelActivity;
import com.example.myapplication.perfilActivity;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.tabs.TabLayout;

public class metasCorrerActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    Toolbar toolbar;
    TextView tituloLayout;
    BottomAppBar bottomAppBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metascomidasdiarias);
        setUpBottomAppBar();

        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        tituloLayout = toolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        tituloLayout.setText(R.string.correrPalabra);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.viewpagerMetasPers);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabsMetasPerso);
        tabLayout.setupWithViewPager(mViewPager);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), getResources().getString(R.string.levelUpPalabra));
        adapter.addFragment(new Tab2Fragment(),  getResources().getString(R.string.correrPalabra));
        adapter.addFragment(new Tab3Fragment(),  getResources().getString(R.string.infoPalabra));
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item1) {
            Intent i = new Intent(this, perfilActivity.class);
            startActivity(i);
            return true;
        } else if (item.getItemId() == R.id.item2) {
            Intent i = new Intent(this, nivelActivity.class);
            startActivity(i);
            return true;
        } else {
            Intent i = new Intent(this, menuActivity.class);
            startActivity(i);
            return true;
        }
    }

    private void setUpBottomAppBar() {
        //find id
        bottomAppBar = findViewById(R.id.bottomAppBar);

        //set bottom bar to Action bar as it is similar like Toolbar
        bottomAppBar.replaceMenu(R.menu.menubottombar);
    }

}