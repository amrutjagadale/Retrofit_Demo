package com.example.retrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitdemo.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
  

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productService = ProductService.getInstance()

        CoroutineScope(Dispatchers.IO).launch {
            val response = productService.fetchProducts()
            withContext(Dispatchers.Main){
                setupRecyclerView(response)

            Log.e("tag", response.toString())
                for( eachProduct in response){
                    Log.e("tag", eachProduct.toString())
                }
            }
        }
    }

    private fun setupRecyclerView(products: ArrayList<ApiResponse>) {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        var myadapter = ProductAdapter(this, products)
        binding.recyclerView.adapter = myadapter
    }
}