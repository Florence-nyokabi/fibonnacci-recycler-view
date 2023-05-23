package flo.fibbonaccirecyclerview

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(var fibonnacci: List<Int>):
    RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.
        layout.activity_main, parent, false)
        return RecyclerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.tvNumber.text = fibonnacci.get(position)
    }

    override fun getItemCount(): Int {
        return fibonnacci.size
    }
}

class RecyclerViewHolder(recyclerView: View): RecyclerView.ViewHolder(recyclerView){
    var tvRecyclerView = recyclerView.findViewById<TextView>(R.id.tvNumber)
}

