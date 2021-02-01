//package com.example.pmc
//
//import android.content.Intent
//import android.graphics.BitmapFactory
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.Menu
//import android.view.MenuItem
//import android.widget.*
//import androidx.appcompat.app.AlertDialog
//import com.example.memo.Location_List_Activity
//import kotlinx.android.synthetic.main.activity_main.*
//import java.text.SimpleDateFormat
//import java.util.*
//
//class MainActivity2 : AppCompatActivity() {
//
//
//    companion object{
//        internal var memolist = arrayListOf<memo>()
//        internal var removecheck = true
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//
//        menuInflater.inflate(R.menu.menu,menu)
//
//
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.location -> {
//                val intent = Intent(this,Location_List_Activity::class.java)
//                startActivity(intent)
//            }
//            R.id.setting -> {
//
//            }
//            R.id.alram ->{
//
//            }
//        }
//
//        return true
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        val adapter = memoadapter(this,memolist)
//        listview.adapter = adapter
//
//        listview.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            if(removecheck) {
//                val intent = Intent(this, viewmemo::class.java)
//                intent.putExtra("memonum", position)
//                startActivity(intent)
//            }
//            else{
//                memolist.removeAt(position)
//                adapter.notifyDataSetChanged()
//            }
//        }
//
//        adapter.notifyDataSetChanged()
//
//        floatingActionButton.setOnClickListener {
//            val builder = AlertDialog.Builder(this)
//            val dialogView = layoutInflater.inflate(R.layout.dialog, null)
//            val dialogtitle = dialogView.findViewById<EditText>(R.id.editmemotitle)
//            val dialogcontent = dialogView.findViewById<EditText>(R.id.editmemocontent)
//            val dialogarlam = dialogView.findViewById<TimePicker>(R.id.edittimeset)
//            val dialogcheck = dialogView.findViewById<CheckBox>(R.id.arlamcheck)
//
//            builder.setView(dialogView)
//                .setPositiveButton("확인") { dialogInterface, i ->
//                    val now = System.currentTimeMillis()
//                    val date = Date(now)
//                    val time : SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
//                    val gettime = time.format(date)
//                    val memo = memo(dialogtitle.text.toString(), dialogcontent.text.toString(), gettime )
//
//
//                    memolist.add(memo)
//                    adapter.notifyDataSetChanged()
//                    var title = dialogtitle.text.toString()
//                    var content = dialogcontent.text.toString()
//                }
//                .setNegativeButton("취소") { dialogInterface, i ->
//                    /* 취소일 때 아무 액션이 없으므로 빈칸 */
//                }
//                .show()
//
//        }
//
//    }
//
//
//}