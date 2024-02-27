package pe.edu.idat.clinica_proyect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.clinica_proyect.databinding.ActivityListbookBinding

class ListbookActivity : AppCompatActivity() {
    lateinit var binding: ActivityListbookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListbookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Crear una lista de elementos
        val itemList = listaElementos()

        // Configurar el RecyclerView y el AdapterItem
        binding.rvelementos.layoutManager = LinearLayoutManager(this)
        binding.rvelementos.adapter = AdapterItem(itemList)
    }

    private fun listaElementos(): List<Item> {
        val lista = ArrayList<Item>()
        var i = 0
        while (i < 20) {
            // Crear elementos de ejemplo con título, descripción y fecha de publicación
            val item = Item("Libro $i", "Descripción del libro $i", "2024-02-${i + 1}")
            lista.add(item)
            i++
        }
        return lista
    }
}
