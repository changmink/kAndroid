package dev.changmin.android.kotlin.simplepuzzle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    //커스텀 클래스 만들어서 하고 싶은데 방법을 모르니 ㅠ
    var one = listOf(R.drawable.eevee01, R.drawable.flareon01, R.drawable.vaporeon01, R.drawable.jolteon01)
    var two = listOf(R.drawable.eevee02, R.drawable.flareon02, R.drawable.vaporeon02, R.drawable.jolteon02)
    var three = listOf(R.drawable.eevee03, R.drawable.flareon03, R.drawable.vaporeon03, R.drawable.jolteon03)

    var oneState = 0
    var twoState = 0
    var threeState = 0

    lateinit var imageButtonOne: ImageButton
    lateinit var imageButtonTwo: ImageButton
    lateinit var imageButtonThree: ImageButton
    lateinit var shuffleButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageButtonOne = findViewById(R.id.piece1)
        imageButtonTwo = findViewById(R.id.piece2)
        imageButtonThree = findViewById(R.id.piece3)

        imageButtonOne.setOnClickListener {
            oneState = (oneState + 1) % one.size
            imageButtonOne.setImageResource(one[oneState])
        }

        imageButtonTwo.setOnClickListener {
            twoState = (twoState + 1) % two.size
            imageButtonTwo.setImageResource(two[twoState])
        }

        imageButtonThree.setOnClickListener {
            threeState = (threeState + 1) % three.size
            imageButtonThree.setImageResource(three[threeState])
        }

        shuffleButton = findViewById(R.id.shuffle_button)
        shuffleButton.setOnClickListener { shuffle() }

        shuffle()
    }

    private fun shuffle() {
        one = one.shuffled()
        two = two.shuffled()
        three = three.shuffled()

        imageButtonOne.setImageResource(one[oneState])
        imageButtonTwo.setImageResource(two[twoState])
        imageButtonThree.setImageResource(three[threeState])
    }
}
