package com.example.pmc

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService

object alarm : AppCompatActivity(){
    var sound:Int =1
    var count:Int =1

    var vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    @RequiresApi(Build.VERSION_CODES.O)
    public fun ring():Unit{
        if(alarm.sound==1){
            vibrator.vibrate(VibrationEffect.createOneShot(1000, 50))
//            vibrator.vibrate(VibrationEffect.)
        }
    }
}
//알람 구현 시 값만 넘겨서 가능
//이렇게 하면 알람마다 다르게도 가능하지 않나?


//set(value){
//    this.sound=value
//}
//
//set(value){this.count=value}