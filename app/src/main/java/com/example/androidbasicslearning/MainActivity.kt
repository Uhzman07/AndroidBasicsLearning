package com.example.androidbasicslearning

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * AIM
 * How to add a Floating Action Button to a Bottom Navigation
 * Note that the Coordinator layout in the activity_main.xml file is perfect for the floating action button
 * It allows the floating action button to stick to the menu bar
 * It is therefore, better than the constraint layout
 * Note that for an AppCompatActivity, you should use the onCreate method without PersistableBundle:
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Toast.makeText(this,"usman",Toast.LENGTH_LONG).show()

        // In order to remove the shade of background in the bottom navigation view
        findViewById<BottomNavigationView>(R.id.bottomNavigationView).background = null

        // To disable the middle item from clicking
        findViewById<BottomNavigationView>(R.id.bottomNavigationView).menu.getItem(2).isEnabled = false

    }
}