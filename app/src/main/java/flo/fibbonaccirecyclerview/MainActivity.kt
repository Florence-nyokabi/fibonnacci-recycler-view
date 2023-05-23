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

    fun getFibonacciNumbers(limit: Int): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)
        for (i in 2 until limit) {
            fibonacciNumbers.add(fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2])
        }
        return fibonacciNumbers
    }
}