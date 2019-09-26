package com.tregz.mvvm.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.util.Log
import com.tregz.mvvm.R
import com.tregz.mvvm.list.ListApple
import com.tregz.mvvm.view.ViewApple
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    companion object {
        private val TAG: String = MainActivity::class.java.simpleName
    }
}
