package com.amoorasolutions.speedmechanic

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val autoParts = findViewById<Button>(R.id.autoPart)
        autoParts.setOnClickListener{
            val intent = Intent(applicationContext, SpareParts::class.java)
            startActivity(intent)
        }


        val regularService = findViewById<Button>(R.id.regularService)
        regularService.setOnClickListener{
            val i = Intent(applicationContext, ServiceDetails::class.java)
            startActivity(i)
        }
        val callUs = findViewById<FloatingActionButton>(R.id.fab)
        callUs.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:2348039685696")
            startActivity(intent)
        }

        val findUs = findViewById<Button>(R.id.findUs)
        findUs.setOnClickListener{
            val intent = Intent(applicationContext, FindUs::class.java)
            startActivity(intent)
        }



        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }
//    fun setupPermissions() {
//        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) !=
//                PackageManager.PERMISSION_GRANTED) {
//            if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.CALL_PHONE)) {
//            }
//            else {
//                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), 42)
//            }
//        }
//        else {
//            callPhone()
//        }
//    }
//
//    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//        if (requestCode == 42){
//            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)){
//                callPhone()
//            }
//            else {}
//            return
//        }
//    }
//    fun callPhone(){
//        val intent =  Intent(this, MainActivity::class.java)
//        startActivity(intent)
////        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "08066926583"))
////        startActivity(intent)
//    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }

            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true

    }

}
