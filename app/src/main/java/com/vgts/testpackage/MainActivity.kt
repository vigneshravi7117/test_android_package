package com.vgts.testpackage

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.vgts.addtwonum.Numbers

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity);

        Log.i("Print", "Added : "+Numbers(1.0,2.0).addTwoNum())
    }
}
