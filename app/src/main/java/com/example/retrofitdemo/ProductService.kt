package com.example.retrofitdemo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductService {
   @GET("products")
   suspend fun fetchProducts() : ArrayList<ApiResponse>

   companion object{
      fun getInstance() :ProductService{
          val retrofit = Retrofit.Builder()
          val productsService = retrofit.baseUrl("https://fakestoreapi.com/")
              .addConverterFactory(GsonConverterFactory.create())
              .build()
              .create(ProductService::class.java)

          return productsService

      }
   }
}