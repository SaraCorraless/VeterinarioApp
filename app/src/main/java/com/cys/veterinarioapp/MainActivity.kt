package com.cys.veterinarioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toolbar: ActionBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = supportActionBar!!


        val bottonNavigation: BottomNavigationView = findViewById(R.id.botton_nav)

        bottonNavigation.setOnItemSelectedListener{
                item ->
            when(item.itemId){
                R.id.home->{
                    toolbar.title = "Home"
                    val homeFragment = HomeFragment.newInstance()
                    changeFragment(homeFragment)
                    return@setOnItemSelectedListener true
                }

                R.id.profile->{
                    toolbar.title = "Profile"
                    val profileFragment = ProfileFragment.newInstance()
                    changeFragment(profileFragment)
                    return@setOnItemSelectedListener true
                }

                R.id.shot->{

                    toolbar.title = "Shot"
                    val shotFragment = ShotFragment.newInstance()
                    changeFragment(shotFragment)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }



    }


    private fun changeFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment).commit()
    }
}











