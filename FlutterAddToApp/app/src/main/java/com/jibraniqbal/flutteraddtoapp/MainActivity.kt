package com.jibraniqbal.flutteraddtoapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startLeafModule(view: View) {
        startActivity(
                FlutterActivity
                        .withCachedEngine("flutter_engine_id")
                        .build(this)
        );
    }
}