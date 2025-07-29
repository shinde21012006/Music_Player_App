package com.androidInnovators.musicPlayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidInnovators.musicPlayer.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{

        return "Welcome to Music Player App,The Ultimate Music Player Design " +
                "to Elevate Your Listing experience." +
                "whether you are a casual listener or an audiophile,Over Player Combines" +
                "powerful features  with a clean,intuitive interface......!!!!!" +
                "\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDeveloped By: Android Innovators."


    }
}