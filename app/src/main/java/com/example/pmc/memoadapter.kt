package com.example.pmc

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context, val memo: List<MemoEntity>) :
    RecyclerView.Adapter<MyAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_memo, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return 2// 2개만 뛰울 예정
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(memo[position])
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView?.findViewById<TextView>(R.id.itemtitle)
        val place = itemView?.findViewById<TextView>(R.id.itemplace)
        val content = itemView?.findViewById<TextView>(R.id.itemcontent)
        val time = itemView?.findViewById<TextView>(R.id.itemtime)

        fun bind(memo: MemoEntity) {
            title?.text = memo.title
            content?.text = memo.content
            place?.text = memo.locate
            time?.text=memo.time
        }
    }
}