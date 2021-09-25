package com.technus.coahelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;


import com.google.android.material.navigation.NavigationView;
import com.technus.coahelper.ui.guides.GuidesFragment;
import com.technus.coahelper.ui.lvlup.LvlUpFragment;
import com.technus.coahelper.ui.maps.MapsFragment;
import com.technus.coahelper.ui.rankup.RankUpFragment;
import com.technus.coahelper.ui.credits.CreditsFragment;
import com.technus.coahelper.ui.wiki.WikiFragment;



public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RankUpFragment rankUpFragment = new RankUpFragment();
    LvlUpFragment lvlUpFragment = new LvlUpFragment();
    MapsFragment mapsFragment = new MapsFragment();
    GuidesFragment guidesFragment = new GuidesFragment();
    WikiFragment wikiFragment = new WikiFragment();
    CreditsFragment creditsFragment = new CreditsFragment();


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
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,rankUpFragment).addToBackStack(null).commit();
        }
        else if (id==R.id.nav_lvlup){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,lvlUpFragment).addToBackStack(null).commit();
        }
        else if(id==R.id.nav_maps){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,mapsFragment).addToBackStack(null).commit();
        }
        else if(id==R.id.nav_guides){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,guidesFragment).addToBackStack(null).commit();
        }
        else if(id==R.id.nav_credits){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,creditsFragment).addToBackStack(null).commit();
        }
        else if (id == R.id.nav_disc_main) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.discord.gg/curseofaros"));
            startActivity(browserIntent);
        }
        else if (id == R.id.nav_disc_tech) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://discord.gg/mT7TPSbTry"));
            startActivity(browserIntent);
        }
        else if (id == R.id.nav_github) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/TechNus09"));
            startActivity(browserIntent);
        }
        else if (id == R.id.nav_wiki) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, wikiFragment).addToBackStack(null).commit();
        }




        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }



    @Override
    public void onBackPressed() {

        wikiFragment.canGoBack();
        if(wikiFragment.canGoBack()){
            wikiFragment.goBack();
        }else{
            super.onBackPressed();
        }




        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
}