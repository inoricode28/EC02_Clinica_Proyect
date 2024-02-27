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
        return listOf(
            Item(
                "Harrison's Principles of Internal Medicine",
                "Este libro es una referencia fundamental para los médicos que buscan información detallada sobre la medicina interna.",
                "2020-10-15"
            ),
            Item(
                "Gray's Anatomy for Students",
                "Una versión simplificada del clásico de la anatomía humana, diseñada específicamente para estudiantes de medicina.",
                "2019-08-20"
            ),
            Item(
                "Robbins Basic Pathology",
                "Un libro esencial para comprender las bases patológicas de las enfermedades.",
                "2018-05-12"
            ),
            Item(
                "Current Medical Diagnosis and Treatment",
                "Una guía clínica actualizada que aborda el diagnóstico y tratamiento de una amplia gama de enfermedades.",
                "2021-03-30"
            ),

        )
    }
}
