package com.cashfree.paymenticonsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cashfree.paymenticons.Icon
import com.cashfree.paymenticonsample.databinding.ImageItemRowBinding

class ImageAdapter(private val icons: List<Icon>) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ImageItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val icon = icons[position]
        holder.bind(icon)
    }

    override fun getItemCount(): Int {
        return icons.size
    }

    class ViewHolder(private val binding: ImageItemRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(icon: Icon) {
            Glide
                .with(binding.root.context)
                .load(icon.iconUrl)
                .placeholder(R.mipmap.ic_launcher)
                .into(binding.imageview);
        }
    }


}