package com.amoorasolutions.speedmechanic

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.text.Layout
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_splash_screen.*
import java.util.jar.Manifest

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val mechImage = findViewById<FrameLayout>(R.id.logo)
        mechImage.setOnClickListener{
            val intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
//        setupPermissions()
//    }
//
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
//       if (requestCode == 42){
//           if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)){
//               callPhone()
//           }
//            else {}
//           return
//       }
//    }
//    fun callPhone(){

//        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "08066926583"))
//        startActivity(intent)
    }
}