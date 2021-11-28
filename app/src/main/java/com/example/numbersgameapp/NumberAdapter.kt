package com.example.numbersgameapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class NumberAdapter(val context: Context, val numbers:  ArrayList<String>):
    RecyclerView.Adapter<NumberAdapter.NumberViewHolder>() {
    class NumberViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val number = numbers[position]

        holder.itemView.apply {
            tvMessage.text = number
        }
    }

    override fun getItemCount() = numbers.size
}