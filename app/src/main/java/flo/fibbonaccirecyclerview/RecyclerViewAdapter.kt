package flo.fibbonaccirecyclerview

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(var fibonnacci: List<Int>):
    RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        holder.numberTextView.text = fibonacciNumbers[position].toString()

    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

class RecyclerViewHolder(recyclerView: View): RecyclerView.ViewHolder(recyclerView){
    var tvRecyclerView = recyclerView.findViewById<TextView>(R.id.tvNumber)
}

