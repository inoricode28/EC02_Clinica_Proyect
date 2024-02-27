package pe.edu.idat.clinica_proyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.idat.clinica_proyect.databinding.ActivityFrmCovidBinding

class FrmCovidViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFrmCovidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrmCovidBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}