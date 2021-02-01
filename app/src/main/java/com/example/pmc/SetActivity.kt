package com.example.pmc

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioGroup
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_set.*

class SetActivity : MainActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set)

        Xbutton.setOnClickListener() {
            val intent = Intent(
                    this, MainActivity::class.java)        //첫번째 인자는 자기자신(this),두번째 인자는 이동할 액티비티 클래스 오브젝트
            startActivity(intent)
        }
        radioGroup.setOnCheckedChangeListener { group, checkId ->
            when (checkId) {
                R.id.radioButton1 -> text11.setText("하바")
                R.id.radioButton2 -> text11.setText("하위11")
            }
        }
        val items = arrayOf("흰색", "민트색", "분홍색")         //spinner
        val myAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        spinner.adapter = myAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when (position) {
                    0 -> {spinner.setSelection(0) }
                    1 -> { spinner.setSelection(1) }
                    2 -> { spinner.setSelection(2) }
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}

        }
    }
}