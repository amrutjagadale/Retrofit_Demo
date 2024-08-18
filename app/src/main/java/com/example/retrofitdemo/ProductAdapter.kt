package com.example.retrofitdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ProductAdapter(context: Context, private var products : ArrayList<ApiResponse>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
   inner  class ProductViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
           var txtId = itemView.findViewById<TextView>(R.id.txtId)
           var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
           var txtPrice = itemView.findViewById<TextView>(R.id.txtPrice)
           var txtDesc  = itemView.findViewById<TextView>(R.id.txtDesc)
           var txtCategory = itemView.findViewById<TextView>(R.id.txtCategory)
           var imgView = itemView.findViewById<ImageView>(R.id.imgView)
           var txtRate = itemView.findViewById<TextView>(R.id.txtRate)
           var txtCount = itemView.findViewById<TextView>(R.id.txtCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ProductViewHolder {
          val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
          return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {
            holder.txtId.text = products[position].toString()
            holder.txtTitle.text = products[position].toString()
            holder.txtDesc.text = products[position].toString()
            holder.txtCategory.text = products[position].toString()
            holder.txtCount.text = products[position].toString()
            holder.txtPrice.text = products[position].toString()
            holder.txtRate.text = products[position].toString()

    }

    override fun getItemCount(): Int {
        return products.size
    }
}