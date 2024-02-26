package pe.edu.idat.clinica_proyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.idat.clinica_proyect.databinding.ActivityFormularioBinding

class FormActivity : AppCompatActivity() {

    private lateinit var binding:ActivityFormularioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormularioBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_formulario)

    }
}