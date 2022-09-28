package com.example.jobsheet13
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    private lateinit var namaEdit: EditText
    private lateinit var NISEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var submitBtn: Button
    private val NAME_KEY: String = "Nama"
    private val NIS_KEY: String = "NIS"
    private val Kelas_KEY: String = "Kelas"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        namaEdit = findViewById(R.id.namaEdit)
        NISEdit = findViewById(R.id.NISEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        submitBtn = findViewById(R.id.submitBtn)
        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(NIS_KEY,NISEdit.text.toString())
            intent.putExtra(Kelas_KEY,kelasEdit.text.toString())
            startActivity(intent)
        }
    }
}

