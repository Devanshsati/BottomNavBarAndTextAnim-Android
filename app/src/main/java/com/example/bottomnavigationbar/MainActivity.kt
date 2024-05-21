package com.example.bottomnavigationbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavigationbar.databinding.ActivityMainBinding
import render.animations.*

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.textView1.setOnClickListener {
            val render = Render(this)
            render.setAnimation(Bounce().InDown(binding.textView1))
            render.start()
        }
        binding.textView2.setOnClickListener {
            val render = Render(this)
            render.setAnimation(Attention().Flash(binding.textView2))
            render.start()
        }
        binding.textView3.setOnClickListener {
            val render = Render(this)
            render.setAnimation(Attention().Ruberband(binding.textView3))
            render.start()
        }
        binding.textView4.setOnClickListener {
            val render = Render(this)
            render.setAnimation(Attention().Wobble(binding.textView4))
            render.start()
        }
        binding.textView5.setOnClickListener {
            val render = Render(this)
            render.setAnimation(Fade().InLeft(binding.textView5))
            render.start()
        }
        binding.textView6.setOnClickListener {
            val render = Render(this)
            render.setAnimation(Flip().OutY(binding.textView6))
            render.start()
        }
        binding.textView7.setOnClickListener {
            val render = Render(this)
            render.setAnimation(Rotate().In(binding.textView7))
            render.start()
        }
        binding.textView8.setOnClickListener {
            val render = Render(this)
            render.setAnimation(Zoom().InLeft(binding.textView8))
            render.start()
        }

    }
}