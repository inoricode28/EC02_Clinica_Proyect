package pe.edu.idat.clinica_proyect

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.clinica_proyect.databinding.ItemValorBinding

data class Item(
    val title: String,
    val description: String,
    val publicationDate: String
)

class AdapterItem(private var lista: List<Item>) : RecyclerView.Adapter<AdapterItem.ViewHolder>() {

    inner class ViewHolder(val binding: ItemValorBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemValorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = lista[position]
        holder.binding.tvTitle.text = currentItem.title
        holder.binding.tvDescription.text = currentItem.description
        holder.binding.tvPublicationDate.text = currentItem.publicationDate
    }
}

// Uso del adapter:
// val itemList = listOf(
//     Item("Title 1", "Description 1", "2024-02-27"),
//     Item("Title 2", "Description 2", "2024-02-28"),
//     // Agregar más elementos según sea necesario
// )
//
// val adapter = AdapterItem(itemList)
// recyclerView.adapter = adapter
