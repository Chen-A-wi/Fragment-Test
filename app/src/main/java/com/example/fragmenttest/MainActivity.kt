package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttest.utils.replaceFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonEvent()
    }

    private fun buttonEvent() {
        button.setOnClickListener {
            replaceFragment(HelloFragment(), R.id.mainFrame)
        }
    }
}
