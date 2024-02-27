package pe.edu.idat.clinica_proyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import pe.edu.idat.clinica_proyect.databinding.ActivityFormularioBinding

class FormActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFormularioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormularioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnacceder = binding.btnAcceder
        btnacceder.setOnClickListener {
            if (validarDatos()){
                mostrarDatos()
            } else{
                Toast.makeText(this, "Ingresar todos los datos", Toast.LENGTH_SHORT).show()
            }
        }

        binding.cbxotro.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                binding.edtIngresarHobbie.visibility = EditText.VISIBLE
            } else{
                binding.edtIngresarHobbie.visibility = EditText.GONE
            }
        }

    }

    private fun mostrarDatos(): Boolean {
        return binding.edtDNI.text.isNotEmpty() &&
                binding.edtNOMBRE.text.isNotEmpty()&&
                binding.edtAPELLIDOS.text.isNotEmpty()&&
                binding.edtCORREO.text.isNotEmpty()&&
                binding.edtCONTRASENA.text.isNotEmpty()&&
                (binding.rbHombre.isChecked || binding.rbMujer.isChecked) &&
                (binding.cbxDeporte.isChecked || binding.cbxPintura.isChecked || binding.cbxotro.isChecked)

    }

    private fun validarDatos(): Boolean {
        val dni = binding.edtDNI.text.toString()
        val nombre = binding.edtNOMBRE.text.toString()
        val apellidos = binding.edtAPELLIDOS.text.toString()
        val correo = binding.edtCORREO.text.toString()
        val contraseña = binding.edtCONTRASENA.text.toString()

        if (dni.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() ||
            correo.isEmpty() || contraseña.isEmpty()) {
            Toast.makeText(this, "Ingresar todos los datos", Toast.LENGTH_SHORT).show()
            return false
        }

        if (!binding.rbHombre.isChecked && !binding.rbMujer.isChecked) {
            Toast.makeText(this, "Seleccionar género", Toast.LENGTH_SHORT).show()
            return false
        }

        if (!binding.cbxDeporte.isChecked && !binding.cbxPintura.isChecked && !binding.cbxotro.isChecked) {
            Toast.makeText(this, "Seleccionar al menos un pasatiempo", Toast.LENGTH_SHORT).show()
            return false
        }

        if (binding.cbxotro.isChecked && binding.edtIngresarHobbie.text.isEmpty()) {
            Toast.makeText(this, "Ingresar un pasatiempo válido", Toast.LENGTH_SHORT).show()
            return false
        }

        val intent = Intent(this, FormViewActivity::class.java).apply {
            putExtra("dni", dni)
            putExtra("nombre", nombre)
            putExtra("apellidos", apellidos)
            putExtra("correo", correo)
            putExtra("contraseña", contraseña)
            putExtra("genero", if (binding.rbHombre.isChecked) "Hombre" else "Mujer")
            val hobbies = mutableListOf<String>()
            if (binding.cbxDeporte.isChecked) hobbies.add("Deporte")
            if (binding.cbxPintura.isChecked) hobbies.add("Pintura")
            if (binding.cbxotro.isChecked) hobbies.add(binding.edtIngresarHobbie.text.toString())
            putExtra("hobbies", hobbies.joinToString(", "))
        }
        startActivity(intent)

        return true
    }

}