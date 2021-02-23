package com.adrian.briefcase.adriansbriefcase.ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.adrian.briefcase.adriansbriefcase.R
import com.adrian.briefcase.adriansbriefcase.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        binding.root.apply {
            val introAnimation = AnimationUtils.loadAnimation(this@SplashActivity, R.anim.object_introduction)
            animation = introAnimation
            animation.setAnimationListener(object: AnimationListener {
                override fun onAnimationRepeat(animation: Animation?) {
                    // Do nothing
                }

                override fun onAnimationEnd(animation: Animation?) {
                    //  Start loading
                }

                override fun onAnimationStart(animation: Animation?) {
                    //Do nothing
                }

            })
            animation.start()
        }
    }

}
