package com.example.lifecycle.ui

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycle.R
import com.example.lifecycle.util.logError


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        "onCreate".logError()

    }

    override fun onStart() {
        "onStart".logError()
        super.onStart()
    }

    override fun onRestart() {
        "onRestart".logError()
        super.onRestart()
    }

    override fun onResume() {
        "onResume".logError()
        super.onResume()
    }

    override fun onPause() {
        "onPause".logError()
        super.onPause()
    }

    override fun onDestroy() {
        "onDestroy".logError()
        super.onDestroy()
    }

    override fun onStop() {
        "onStop".logError()
        super.onStop()
    }

    override fun onContentChanged() {
        "onContentChanged".logError()
        super.onContentChanged()
    }

    override fun onBackPressed() {
        "onBackPressed".logError()
        super.onBackPressed()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        "onOptionsItemSelected".logError()
        return super.onOptionsItemSelected(item)
    }

    override fun onOptionsMenuClosed(menu: Menu?) {
        "onOptionsMenuClosed".logError()
        super.onOptionsMenuClosed(menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        "onCreateOptionsMenu".logError()
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        "onPrepareOptionsMenu".logError()
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        "onRestoreInstanceState".logError()
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        "onSaveInstanceState".logError()
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        "onConfigurationChanged".logError()
        super.onConfigurationChanged(newConfig)
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        "startActivityForResult".logError()
        super.startActivityForResult(intent, requestCode)
    }

    override fun onUserInteraction() {
        "onUserInteraction".logError()
        super.onUserInteraction()
    }

}
