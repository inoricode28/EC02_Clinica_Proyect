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
            Item(
                "Netter's Anatomy Flash Cards",
                "Un conjunto de tarjetas de estudio que presentan ilustraciones anatómicas detalladas de Netter.",
                "2017-11-25"
            ),
            Item(
                "Essential Clinical Anatomy",
                "Un libro que ofrece una comprensión clara de la anatomía clínica relevante para la práctica médica.",
                "2016-09-10"
            ),
            Item(
                "The Washington Manual of Medical Therapeutics",
                "Una referencia práctica para el tratamiento de enfermedades comunes, basada en las recomendaciones del Washington University School of Medicine.",
                "2022-01-05"
            ),
            Item(
                "Bates' Guide to Physical Examination and History Taking",
                "Un recurso esencial para aprender las habilidades de evaluación física y la toma de historias clínicas.",
                "2015-07-18"
            ),
            Item(
                "Pocket Medicine: The Massachusetts General Hospital Handbook of Internal Medicine",
                "Un manual de bolsillo que proporciona información concisa sobre el diagnóstico y tratamiento de enfermedades médicas.",
                "2019-12-03"
            ),
            Item(
                "Guyton and Hall Textbook of Medical Physiology",
                "Un libro clásico que aborda los principios fisiológicos fundamentales que sustentan la práctica médica.",
                "2023-02-28"
            )
        )
    }
    // fin
}
