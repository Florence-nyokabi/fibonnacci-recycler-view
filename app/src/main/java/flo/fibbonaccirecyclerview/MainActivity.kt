package flo.fibbonaccirecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = RecyclerViewAdapter(getFibonacciNumbers(100))

        recyclerView.adapter = adapter
    }

    fun getFibonacciNumbers(end: Int): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)
        for (n in 2 until end) {
            fibonacciNumbers.add(fibonacciNumbers[n - 1] + fibonacciNumbers[n - 2])
        }
        return fibonacciNumbers
    }
}