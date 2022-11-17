package com.example.navcomponents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navcomponents.databinding.ItemCatBinding

class CatsAdapter(
    private val catsList: ArrayList<CatsModel>,
    private val listener: OnItemClickListener
) : RecyclerView.Adapter<CatsAdapter.CatViewHolder>(), View.OnClickListener {

    inner class CatViewHolder(private val binding: ItemCatBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(catsModel: CatsModel) {
            Glide.with(binding.imageCat.context)
                .load(catsModel.imageUrl)
                .into(binding.imageCat)
            binding.errorTitle.text = catsModel.name
            binding.root.tag = catsModel
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val binding = ItemCatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        binding.root.setOnClickListener(this)
        return CatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.onBind(catsList[position])
    }

    override fun getItemCount(): Int {
        return catsList.size
    }

    override fun onClick(view: View?) {
        listener.onClick(view?.tag as CatsModel)
    }
}