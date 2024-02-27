package pe.edu.idat.clinica_proyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.clinica_proyect.databinding.ActivityListbookBinding

class ListbookActivity : AppCompatActivity() {
    lateinit var binding: ActivityListbookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListbookBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvelementos.layoutManager = LinearLayoutManager(applicationContext)
        binding.rvelementos.adapter = AdapterItem(listaElementos())
    }

    private fun listaElementos(): List<String>{
        val lista = ArrayList<String>()
        var i = 0
        while(i < 20){
            lista.add("Libro $i")
            i++;
        }
        return lista
    }
}