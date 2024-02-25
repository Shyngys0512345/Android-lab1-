package com.example.lab1.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.databinding.ItemPizzaBinding
import com.example.lab1.model.Pizza

class PizzaAdapter (
    private val onPizzaClick: (Pizza) -> Unit
): RecyclerView.Adapter<PizzaAdapter.ViewHolder>() {

    companion object {
        private const val PIZZA_ADAPTER_TAG = "PizzaAdapter"
    }

    private val pizzaList: ArrayList<Pizza> = ArrayList()

    fun setData(movies: ArrayList<Pizza>) {
        pizzaList.clear()
        pizzaList.addAll(movies)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(PIZZA_ADAPTER_TAG, "onCreateViewHolder")
        return ViewHolder(
            ItemPizzaBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount() = pizzaList.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(PIZZA_ADAPTER_TAG, "onBindViewHolder: $position")
        holder.bind(pizzaList[position])
    }

    inner class ViewHolder(
        private val binding: ItemPizzaBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pizza: Pizza) {
            with(binding) {
                pizzaImage.setImageResource(pizza.image)
                pizzaTitle.text = pizza.title
                pizzaDescription.text = pizza.description
                pizzaCost.text = pizza.cost

                root.setOnClickListener {
                    onPizzaClick(pizza)
                }

            }
        }
    }
}