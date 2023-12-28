package com.example.androidbasicslearning

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
//import kotlinx.android.synthetic.main.activity_main.btnOpenMenu

/**
 * Opening a Floating bar menu in Android
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        Log.d("Usman",findViewById<Button>(R.id.btnOpenMenu).text.toString() )

        // This is to register the button for the menu
        registerForContextMenu(findViewById<Button>(R.id.btnOpenMenu))


    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        // The menuInflater is a tool that takes the floating_context_menu and puts it in a format that we can actually insert in our app
        menuInflater.inflate(R.menu.floating_context_menu, menu)
    }


    /**
     * This method is used to define an action when the menu item is clicked
     */
    override fun onContextItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.item1 -> Toast.makeText(this,"Item 1", Toast.LENGTH_LONG).show()
            R.id.item2 -> Toast.makeText(this,"Item 2", Toast.LENGTH_LONG).show()
            R.id.item3 -> Toast.makeText(this,"Item 3", Toast.LENGTH_LONG).show()
            R.id.item4 -> Toast.makeText(this,"Item 4", Toast.LENGTH_LONG).show()

        }
        return super.onContextItemSelected(item)
    }
}