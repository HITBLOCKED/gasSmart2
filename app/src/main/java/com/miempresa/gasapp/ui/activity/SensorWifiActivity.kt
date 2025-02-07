package com.miempresa.gasapp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.miempresa.gasapp.MainActivity
import com.miempresa.gasapp.R
import com.miempresa.gasapp.ui.dialog.AyudaWifiDialogFragment
import com.miempresa.gasapp.ui.fragment.HomeFragment

class SensorWifiActivity : AppCompatActivity() {

    private lateinit var btn_wifi : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sensor_wifi)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_sensor_wifi)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val wifiConnectButton = findViewById<LinearLayout>(R.id.ll_wifi_1)
        wifiConnectButton.setOnClickListener {
            val intent = Intent(this, RegisterTankActivity::class.java)
            startActivity(intent)
        }

        val btn_wifi = findViewById<ImageView>(R.id.iv_question)

        btn_wifi.setOnClickListener {
            val dialog = AyudaWifiDialogFragment()
            dialog.show(supportFragmentManager, "dialog_wifi")
        }

    }
}