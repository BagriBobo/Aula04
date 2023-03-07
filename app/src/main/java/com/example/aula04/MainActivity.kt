package com.example.aula04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNome: EditText = findViewById(R.id.editNome)
        val editTel: EditText = findViewById(R.id.editTel)
        val editEmail: EditText = findViewById(R.id.editEmail)
        val checkTelefone: CheckBox = findViewById(R.id.checkTel)
        val checkEmail: CheckBox = findViewById(R.id.checkEmail)
        val buttonReg: Button = findViewById(R.id.buttonReg)
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        var contato: String = ""

        buttonReg.setOnClickListener {
            if(!editNome.text.isBlank() && !editEmail.text.isBlank() && !editTel.text.isBlank()){

                var prefHora = ""
                if(radioGroup.checkedRadioButtonId == R.id.radioManha) {
                    prefHora = "Manhã"
                } else if(radioGroup.checkedRadioButtonId == R.id.radioTarde){
                    prefHora = "Tarde"
                } else if(radioGroup.checkedRadioButtonId == R.id.radioNoite){
                    prefHora = "Noite"
                }

                val msg ="""Nome: ${editNome.text.toString()}
                    |Telefone: ${editNome.text.toString()}
                    |Email: ${editEmail.text.toString()}
                    |Contato por telefone: ${checkTelefone.isChecked}
                    |Contato por email: ${checkEmail.isChecked}
                    |Horário de contato preferível: $prefHora
                """.trimMargin()
                    showDialog("Sucesso",msg.toString())
            } else {
                showDialog("Erro", "Preencha os campos corretamente")
            }
        }
    }
    fun showDialog(title: String, msg: String){
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show()
    }
}