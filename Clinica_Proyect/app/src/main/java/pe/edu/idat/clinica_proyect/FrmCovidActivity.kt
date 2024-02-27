package pe.edu.idat.clinica_proyect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import pe.edu.idat.clinica_proyect.databinding.ActivityFrmCovidBinding

class FrmCovidActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFrmCovidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrmCovidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnRegistro = binding.btnRegistro
        btnRegistro.setOnClickListener {
            if (validarDatos()){
                mostrarDatos()
            }else{
                Toast.makeText(this, "Completar todos los datos", Toast.LENGTH_SHORT).show()
            }
        }

        val btn_volver_vie = binding.btnCodVolver

        btn_volver_vie.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }



    private fun mostrarDatos() : Boolean {
        return (binding.chk1.isChecked || binding.chk2.isChecked || binding.chk3.isChecked || binding.chk4.isChecked || binding.chk5.isChecked  || binding.chk6.isChecked) &&
                (binding.yes1.isChecked || binding.no1.isChecked) &&
                (binding.yes2.isChecked || binding.no2.isChecked) &&
                (binding.yes3.isChecked || binding.no3.isChecked) &&
                (binding.chk7.isChecked || binding.chk8.isChecked || binding.chk9.isChecked || binding.chk10.isChecked)
    }

    private fun validarDatos(): Boolean {

        if(!binding.chk1.isChecked || binding.chk2.isChecked || binding.chk3.isChecked || binding.chk4.isChecked || binding.chk5.isChecked || binding.chk6.isChecked){
            Toast.makeText(this, "Selecciona una de las opciones de la pregunta 1", Toast.LENGTH_SHORT).show()
            return false
        }

        if(!binding.yes1.isChecked || binding.no1.isChecked){
            Toast.makeText(this, "Responde la pregunta 2", Toast.LENGTH_SHORT).show()
            return false
        }

        if(!binding.yes2.isChecked || binding.no2.isChecked){
            Toast.makeText(this, "Responde la pregunta 3", Toast.LENGTH_SHORT).show()
            return false
        }

        if(!binding.yes3.isChecked || binding.no3.isChecked){
            Toast.makeText(this, "SResponde la pregunta 4", Toast.LENGTH_SHORT).show()
            return false
        }

        if(!binding.chk7.isChecked || binding.chk8.isChecked || binding.chk9.isChecked || binding.chk10.isChecked){
            Toast.makeText(this, "Selecciona una opcion de la pregunta 5", Toast.LENGTH_SHORT).show()
            return false
        }

        val sintomasList = mutableListOf<String>()
        if(binding.chk1.isChecked) sintomasList.add("Disminución de gusto y olfato")
        if(binding.chk2.isChecked) sintomasList.add("Tos")
        if(binding.chk3.isChecked) sintomasList.add("Dolor de garganta")
        if(binding.chk4.isChecked) sintomasList.add("Congestión nasal")
        if(binding.chk5.isChecked) sintomasList.add("Fiebre")
        if(binding.chk6.isChecked) sintomasList.add("Ninguno")

        val serviciosList = mutableListOf<String>()
        if(binding.chk7.isChecked) serviciosList.add("Luz")
        if(binding.chk8.isChecked) serviciosList.add("Agua")
        if(binding.chk9.isChecked) serviciosList.add("Internet")
        if(binding.chk10.isChecked) serviciosList.add("Cable")

        val intent = Intent(this, FrmCovidViewActivity::class.java).apply {
            putExtra("Datos", sintomasList.joinToString(","))
            putExtra("p2", if (binding.yes1.isChecked) "yes" else "no")
            putExtra("p3", if (binding.yes2.isChecked) "yes" else "no")
            putExtra("p4", if (binding.yes3.isChecked) "yes" else "no")
            putExtra("Service", serviciosList.joinToString(","))
        }
        startActivity(intent)

        return true
    }
}