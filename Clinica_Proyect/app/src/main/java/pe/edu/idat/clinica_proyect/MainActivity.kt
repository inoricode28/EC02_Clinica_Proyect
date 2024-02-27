package pe.edu.idat.clinica_proyect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.idat.clinica_proyect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el listener de clic para cada botón
        binding.btnRegistro.setOnClickListener(this)
        binding.btnformulario.setOnClickListener(this)
        binding.btnlistado.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // Determinar qué botón fue clickeado y lanzar la actividad correspondiente
        when (v?.id) {
            R.id.btn_registro -> startActivity(Intent(this, FormActivity::class.java))
            R.id.btnformulario -> startActivity(Intent(this, FrmCovidActivity::class.java))
            R.id.btnlistado -> startActivity(Intent(this, ListbookActivity::class.java))
        }
    }
}
