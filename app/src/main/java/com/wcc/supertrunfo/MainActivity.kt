package com.wcc.supertrunfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startGameButton.setOnClickListener {
            val intent = Intent(this, CardsActivity::class.java)
            intent.putExtra("player_one", inputPlayerOne.text)
            intent.putExtra("player_two", inputPlayerTwo.text)
            startActivity(intent)
        }
    }
}