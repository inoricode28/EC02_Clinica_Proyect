package pe.edu.idat.clinica_proyect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import pe.edu.idat.clinica_proyect.databinding.ActivityFrmCovidViewBinding

class FrmCovidViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFrmCovidViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrmCovidViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datosTextView: TextView = findViewById(R.id.edtdatos)

        val sintomas = intent.getStringExtra("Datos")
        val p2 = intent.getStringExtra("p2")
        val p3 = intent.getStringExtra("p3")
        val p4 = intent.getStringExtra("p4")
        val servicios = intent.getStringExtra("Service")
        val btnregresar_cod = binding.btnRegresaCovid

        datosTextView.text = "Síntomas: $sintomas\n" +
                "Pregunta 2: $p2\n" +
                "Pregunta 3: $p3\n" +
                "Pregunta 4: $p4\n" +
                "Servicios: $servicios"

        btnregresar_cod.setOnClickListener {
            val intent = Intent(this, FrmCovidActivity::class.java)
            startActivity(intent)
        }

    }
}