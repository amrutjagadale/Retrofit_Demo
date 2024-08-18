package com.example.retrofitdemo

import android.icu.text.CaseMap.Title
import com.google.gson.annotations.SerializedName

data class ApiResponse(
//var products : ArrayList<Product>
    var id : Int,
    var title: String,
    var price : Double,
    var description : String,
    var category : String,
    var image : String,
    var rating : Rating
)

//data class  Product(
//    var id : Int,
//    var title: String,
//    var price : Double,
//    var description : String,
//    var category : String,
//    var image : Int,
//    var rating : Rating
//)

data class Rating(
    var rate : Double,
    var count : Int
)
