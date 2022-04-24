package com.example.tictactoespele

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivityCPU : AppCompatActivity() {

    private var move: Boolean = true
    private var canCpuMove: Boolean = true

    private var moveCounter : Int = 0

    private var player1 = ArrayList<Int>()
    private var player2 = ArrayList<Int>()

    private var gameResult : Int = 0

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var btn9 : Button
    lateinit var btnReset : Button
    lateinit var resultText : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide() // lai pasleptu title bar

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btnReset = findViewById(R.id.btnReset)
        resultText = findViewById(R.id.gameText)


        btnReset.visibility = View.INVISIBLE
        resultText.visibility = View.INVISIBLE

        btn1.setOnClickListener {
            if(move) {
                btn1.text = "X"
                player1.add(1)
            }
            else {
                btn1.text = "O"
                player2.add(1)
            }
            move = !move
            btn1.isClickable=false
            checkResult()
        }
        btn2.setOnClickListener {
            if(move){
                btn2.text="X"
                player1.add(2)
            }
            else{
                btn2.text="O"
                player2.add(2)
            }
            move = !move
            btn2.isClickable=false
            checkResult()
        }
        btn3.setOnClickListener {
            if(move){
                btn3.text="X"
                player1.add(3)
            }
            else{
                btn3.text="O"
                player2.add(3)
            }
            move = !move
            btn3.isClickable=false
            checkResult()
        }
        btn4.setOnClickListener {
            if(move){
                btn4.text="X"
                player1.add(4)
            }
            else{
                btn4.text="O"
                player2.add(4)
            }

            move = !move
            btn4.isClickable=false
            checkResult()
        }
        btn5.setOnClickListener {
            if(move){
                btn5.text="X"
                player1.add(5)
            }
            else{
                btn5.text="O"
                player2.add(5)
            }

            move = !move
            btn5.isClickable=false
            checkResult()
        }
        btn6.setOnClickListener {
            if(move){
                btn6.text="X"
                player1.add(6)
            }
            else{
                btn6.text="O"
                player2.add(6)
            }

            move = !move
            btn6.isClickable=false
            checkResult()
        }
        btn7.setOnClickListener {
            if(move){
                btn7.text="X"
                player1.add(7)
            }
            else{
                btn7.text="O"
                player2.add(7)
            }

            move = !move
            btn7.isClickable=false
            checkResult()
        }
        btn8.setOnClickListener {
            if(move){
                btn8.text="X"
                player1.add(8)
            }
            else{
                btn8.text="O"
                player2.add(8)
            }

            move = !move
            btn8.isClickable=false
            checkResult()
        }
        btn9.setOnClickListener {
            if(move){
                btn9.text="X"
                player1.add(9)
            }
            else{
                btn9.text="O"
                player2.add(9)
            }

            move = !move
            btn9.isClickable=false
            checkResult()
        }
        btnReset.setOnClickListener{
            finish()
            val intentcpu = Intent(this,MainMenu::class.java)
            startActivity(intentcpu)
        }

        cpuMove()

    }

    private fun checkResult() {

        moveCounter++

        if (player1.contains(1) && player1.contains(2) && player1.contains(3))
            gameResult=1
        if (player1.contains(4) && player1.contains(5) && player1.contains(6))
            gameResult=1
        if (player1.contains(7) && player1.contains(8) && player1.contains(9))
            gameResult=1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7))
            gameResult=1
        if (player1.contains(2) && player1.contains(5) && player1.contains(8))
            gameResult=1
        if (player1.contains(3) && player1.contains(6) && player1.contains(9))
            gameResult=1
        if (player1.contains(1) && player1.contains(5) && player1.contains(9))
            gameResult=1
        if (player1.contains(3) && player1.contains(5) && player1.contains(7))
            gameResult=1

        if (player2.contains(1) && player2.contains(2) && player2.contains(3))
            gameResult=2
        if (player2.contains(4) && player2.contains(5) && player2.contains(6))
            gameResult=2
        if (player2.contains(7) && player2.contains(8) && player2.contains(9))
            gameResult=2
        if (player2.contains(1) && player2.contains(4) && player2.contains(7))
            gameResult=2
        if (player2.contains(2) && player2.contains(5) && player2.contains(8))
            gameResult=2
        if (player2.contains(3) && player2.contains(6) && player2.contains(9))
            gameResult=2
        if (player2.contains(1) && player2.contains(5) && player2.contains(9))
            gameResult=2
        if (player2.contains(3) && player2.contains(5) && player2.contains(7))
            gameResult=2

        if (gameResult==1) {
            //player 1 uzvareja
            btn1.isClickable=false
            btn2.isClickable=false
            btn3.isClickable=false
            btn4.isClickable=false
            btn5.isClickable=false
            btn6.isClickable=false
            btn7.isClickable=false
            btn8.isClickable=false
            btn9.isClickable=false

            btnReset.visibility = View.VISIBLE
            resultText.text = "CPU Won!"
            resultText.visibility = View.VISIBLE
            canCpuMove=false
        }
        if (gameResult==2){
            btn1.isClickable=false
            btn2.isClickable=false
            btn3.isClickable=false
            btn4.isClickable=false
            btn5.isClickable=false
            btn6.isClickable=false
            btn7.isClickable=false
            btn8.isClickable=false
            btn9.isClickable=false
            btnReset.visibility = View.VISIBLE
            resultText.text = "Player Won!"
            resultText.visibility = View.VISIBLE
            canCpuMove=false
        }

        if (gameResult == 0 && player1.size==5 && player2.size==4){
            btnReset.visibility = View.VISIBLE
            resultText.text = "Draw!"
            resultText.visibility = View.VISIBLE
            canCpuMove=false
        }
        if (gameResult == 0 && player1.size==4 && player2.size==5) {
            btnReset.visibility = View.VISIBLE
            resultText.text = "Draw!"
            resultText.visibility = View.VISIBLE
            canCpuMove=false
        }

        if(canCpuMove)
            cpuMove()



    }

    private fun checkResultWithoutMove(){
        if (player1.contains(1) && player1.contains(2) && player1.contains(3))
            gameResult=1
        if (player1.contains(4) && player1.contains(5) && player1.contains(6))
            gameResult=1
        if (player1.contains(7) && player1.contains(8) && player1.contains(9))
            gameResult=1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7))
            gameResult=1
        if (player1.contains(2) && player1.contains(5) && player1.contains(8))
            gameResult=1
        if (player1.contains(3) && player1.contains(6) && player1.contains(9))
            gameResult=1
        if (player1.contains(1) && player1.contains(5) && player1.contains(9))
            gameResult=1
        if (player1.contains(3) && player1.contains(5) && player1.contains(7))
            gameResult=1

        if (player2.contains(1) && player2.contains(2) && player2.contains(3))
            gameResult=2
        if (player2.contains(4) && player2.contains(5) && player2.contains(6))
            gameResult=2
        if (player2.contains(7) && player2.contains(8) && player2.contains(9))
            gameResult=2
        if (player2.contains(1) && player2.contains(4) && player2.contains(7))
            gameResult=2
        if (player2.contains(2) && player2.contains(5) && player2.contains(8))
            gameResult=2
        if (player2.contains(3) && player2.contains(6) && player2.contains(9))
            gameResult=2
        if (player2.contains(1) && player2.contains(5) && player2.contains(9))
            gameResult=2
        if (player2.contains(3) && player2.contains(5) && player2.contains(7))
            gameResult=2

        if (gameResult==1) {
            //player 1 uzvareja
            btn1.isClickable=false
            btn2.isClickable=false
            btn3.isClickable=false
            btn4.isClickable=false
            btn5.isClickable=false
            btn6.isClickable=false
            btn7.isClickable=false
            btn8.isClickable=false
            btn9.isClickable=false

            btnReset.visibility = View.VISIBLE
            resultText.text = "CPU Won!"
            resultText.visibility = View.VISIBLE
            canCpuMove=false
        }
        if (gameResult==2){
            btn1.isClickable=false
            btn2.isClickable=false
            btn3.isClickable=false
            btn4.isClickable=false
            btn5.isClickable=false
            btn6.isClickable=false
            btn7.isClickable=false
            btn8.isClickable=false
            btn9.isClickable=false
            btnReset.visibility = View.VISIBLE
            resultText.text = "Player Won!"
            resultText.visibility = View.VISIBLE
            canCpuMove=false
        }

        if (gameResult == 0 && player1.size==5 && player2.size==4){
            btnReset.visibility = View.VISIBLE
            resultText.text = "Draw!"
            resultText.visibility = View.VISIBLE
            canCpuMove=false
        }
        if (gameResult == 0 && player1.size==4 && player2.size==5) {
            btnReset.visibility = View.VISIBLE
            resultText.text = "Draw!"
            resultText.visibility = View.VISIBLE
            canCpuMove=false
        }
    }

    fun cpuMove() {

        var flag = true

        if (moveCounter==0){
            player1.add(5)
            btn5.isClickable=false
            btn5.text="X"
            move = !move
            moveCounter++
        }
        if (moveCounter==2 ||moveCounter==4 ||moveCounter==6||moveCounter==8 ){

            while (flag){
                when (val rnd = Random.nextInt(0,9)) {
                    1 ->
                        if(btn1.text==""){
                            player1.add(1)
                            btn1.isClickable=false
                            btn1.text="X"
                            move = !move
                            moveCounter++
                            flag=false
                        }
                        else {
                            continue
                        }

                    2 ->
                        if(btn2.text==""){
                            player1.add(2)
                            btn2.isClickable=false
                            btn2.text="X"
                            move = !move
                            moveCounter++
                            flag=false
                        }
                        else {
                            continue
                        }

                    3 ->
                        if(btn3.text==""){
                            player1.add(3)
                            btn3.isClickable=false
                            btn3.text="X"
                            move = !move
                            moveCounter++
                            flag=false
                        }
                        else {
                            continue
                        }

                    4 ->
                        if(btn4.text==""){
                            player1.add(4)
                            btn4.isClickable=false
                            btn4.text="X"
                            move = !move
                            moveCounter++
                            flag=false
                        }
                        else {
                            continue
                        }
                    5 ->
                        continue

                    6 ->
                        if(btn6.text==""){
                            player1.add(6)
                            btn6.isClickable=false
                            btn6.text="X"
                            move = !move
                            moveCounter++
                            flag=false
                        }
                        else {
                            continue
                        }

                    7 ->
                        if(btn7.text==""){
                            player1.add(7)
                            btn7.isClickable=false
                            btn7.text="X"
                            move = !move
                            moveCounter++
                            flag=false
                        }
                        else {
                            continue
                        }

                    8 ->
                        if(btn8.text==""){
                            player1.add(8)
                            btn8.isClickable=false
                            btn8.text="X"
                            move = !move
                            moveCounter++
                            flag=false
                        }
                        else {
                            continue
                        }

                    9 ->
                        if(btn9.text==""){
                            player1.add(9)
                            btn9.isClickable=false
                            btn9.text="X"
                            move = !move
                            moveCounter++
                            flag=false
                        }
                        else {
                            continue
                        }
                    else ->
                        continue

                }
            }


        }

        checkResultWithoutMove()
    }
}








