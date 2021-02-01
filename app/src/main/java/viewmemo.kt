//package com.example.pmc
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.TextView
//import com.example.pmc.MainActivity2.Companion.memolist
//
//class viewmemo : AppCompatActivity() {
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_viewmemo)
//        val nowmemo = memolist[intent.getIntExtra("memonum",0)]
//        val textview = findViewById<TextView>(R.id.textView)
//        val textview2 = findViewById<TextView>(R.id.textView2)
//
//        textview.text = nowmemo.title
//        textview2.text = nowmemo.content
//
//
//    }
//}