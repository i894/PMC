package com.example.pmc

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

open class MainActivity : AppCompatActivity() {
    private var memodb:MemoDB?=null
    private var memolist=listOf<MemoEntity>()
    lateinit var mAdapter : MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        memodb=MemoDB.getInstance(this)
        mAdapter=MyAdapter(this,memolist)
        val r =Runnable{
            try{
                memolist=memodb?.memodao()?.getTwo()!!
                mAdapter = MyAdapter(this, memolist)
                mAdapter.notifyDataSetChanged()
                recyclerview.adapter=mAdapter
                recyclerview.layoutManager=LinearLayoutManager(this)
                recyclerview.setHasFixedSize(true)
            } catch(e:Exception){
                Log.d("tag","Error - $e")
            }
        }

        val thread= Thread(r)
        thread.start()

        btn.setOnClickListener(){
            val intent= Intent(this,SetActivity::class.java)        //첫번째 인자는 자기자신(this),두번째 인자는 이동할 액티비티 클래스 오브젝트
            startActivity(intent)
        }
        button6.setOnClickListener() {
            val intent= Intent(this, WriteNote::class.java)        //첫번째 인자는 자기자신(this),두번째 인자는 이동할 액티비티 클래스 오브젝트
            startActivity(intent)
        }

    }
    override fun onDestroy() {
        MemoDB.destroyInstance()
        memodb = null
        super.onDestroy()
    }
}
