package pe.edu.idat.clinica_proyect

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.clinica_proyect.databinding.ItemValorBinding

class AdapterItem(private var lista: List<String>) : RecyclerView.Adapter<AdapterItem.ViewHolder>(){
    inner class ViewHolder(val binding: ItemValorBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}