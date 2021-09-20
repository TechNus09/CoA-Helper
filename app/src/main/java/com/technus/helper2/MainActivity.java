package com.technus.helper2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.technus.helper2.ui.guides.GuidesFragment;
import com.technus.helper2.ui.lvlup.LvlUpFragment;
import com.technus.helper2.ui.maps.MapsFragment;
import com.technus.helper2.ui.rankup.RankUpFragment;
import com.technus.helper2.ui.credits.CreditsFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        
        drawerLayout =findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);




        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new RankUpFragment()).addToBackStack(null).commit();
        }



    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_rankup){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,new RankUpFragment()).addToBackStack(null).commit();
        }
        else if (id==R.id.nav_lvlup){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,new LvlUpFragment()).addToBackStack(null).commit();
        }
        else if(id==R.id.nav_maps){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,new MapsFragment()).addToBackStack(null).commit();
        }
        else if(id==R.id.nav_guides){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,new GuidesFragment()).addToBackStack(null).commit();
        }
        else if(id==R.id.nav_credits){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,new CreditsFragment()).addToBackStack(null).commit();
        }
        else if (id == R.id.nav_disc_main) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.discord.gg/curseofaros"));
            startActivity(browserIntent);
        }
        else if (id == R.id.nav_disc_tech) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
            startActivity(browserIntent);
        }
        else if (id == R.id.nav_github) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/TechNus09"));
            startActivity(browserIntent);
        }
        else if (id == R.id.nav_wiki) {
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WikiFragment()).addToBackStack(null).commit();
           Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.curseofaros.wiki/wiki/Main_Page"));
            browserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            browserIntent.setPackage("com.android.chrome");
            Context context = getApplicationContext() ;
            try {
                context.startActivity(browserIntent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(context, "unable to open chrome", Toast.LENGTH_SHORT).show();
                browserIntent.setPackage(null);
                context.startActivity(browserIntent);
            }

           //startActivity(browserIntent);
        }




        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
}