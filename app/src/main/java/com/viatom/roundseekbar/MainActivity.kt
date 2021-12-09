package com.viatom.roundseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import me.tankery.lib.circularseekbar.CircularSeekBar

class MainActivity : AppCompatActivity() {
    lateinit var text:TextView
    lateinit var fuck:CircularSeekBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text=findViewById(R.id.baba)
        fuck=findViewById(R.id.ga)
        fuck.setOnSeekBarChangeListener(object:CircularSeekBar.OnCircularSeekBarChangeListener{
            override fun onProgressChanged(
                circularSeekBar: CircularSeekBar?,
                progress: Float,
                fromUser: Boolean
            ) {
               text.text=progress.toInt().toString()
            }

            override fun onStopTrackingTouch(seekBar: CircularSeekBar?) {

            }

            override fun onStartTrackingTouch(seekBar: CircularSeekBar?) {

            }

        })

    }
}