package com.example.pmc
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_writenote.*
class WriteNote : AppCompatActivity() {

    private var memodb : MemoDB? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writenote)
        var size:Long=0
        var memodb = MemoDB.getInstance(this)
        val addRunnable = Runnable {
            val newmemo = MemoEntity(size)
            newmemo.title  = sentence.text.toString()
            newmemo.content = content.text.toString()
            newmemo.time="11.24"
            newmemo.locate="Daegu"
            memodb?.memodao()?.insert(newmemo)
            size++
        }

        off.setOnClickListener {
            val addThread = Thread(addRunnable)
            addThread.start()

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }

    override fun onDestroy() {
        MemoDB.destroyInstance()
        super.onDestroy()
    }
}