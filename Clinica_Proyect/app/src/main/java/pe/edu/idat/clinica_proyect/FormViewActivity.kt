package pe.edu.idat.clinica_proyect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.idat.clinica_proyect.databinding.ActivityFormViewBinding

class FormViewActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityFormViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dni = intent.getStringExtra("dni")
        val nombre = intent.getStringExtra("nombre")
        val apellidos = intent.getStringExtra("apellidos")
        val correo = intent.getStringExtra("correo")
        val genero = intent.getStringExtra("genero")
        val hobbies = intent.getStringExtra("hobbies")
        val btnregresar = binding.btnretrocederView

        val resultado = "DNI: $dni\nNombres: $nombre\nApellidos: $apellidos\nCorreo: $correo\nGénero: $genero\nHobbies: $hobbies"
        binding.edtdatos.text = resultado

        btnregresar.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }
    }
}