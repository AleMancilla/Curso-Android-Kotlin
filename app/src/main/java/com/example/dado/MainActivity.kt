package com.example.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TextWatcher {


    private var EditName : EditText? = null // en Kotlin no se permiten objetos nulos por lo que lo forzamos con esta linea
    // en kotlin no es necesario utilizar punto y coma
    private var EditAge : EditText? = null
    private var TextViewName : TextView? = null
    private var TextViewAge : TextView?=null

    private var name : String? = null
    private var age = 0
    // en kotlin no es necesario que deblare el tipo de variable... basta con ponerle el dato y kotlin interpretara que tipo de dato es
    // la unica diferencia es que se pone = para poner el dato , caso contrario se pone :

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditName = findViewById(R.id.editText_nombre) as EditText
        EditAge = findViewById(R.id.editText_edad) as EditText
        TextViewName = findViewById(R.id.textView_Name) as TextView
        TextViewAge = findViewById(R.id.textView_Age) as TextView


        // evento interface Text Wacher.. textChangedListener .. captura datos de donde lo asignemos
        EditName!!.addTextChangedListener(this) // con la doble admiracion se asegura que esa variable no contiene nulo, caso contrario da error
        EditAge?.addTextChangedListener(this) // con la interrogacion dice que podra recibir un dato nulo pero no necesariamente

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    override fun afterTextChanged(s: Editable?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        //Toast.makeText(this, s.toString()+"_"+start.toString()+"_"+before.toString()+"_"+count.toString() , Toast.LENGTH_SHORT).show()
        name = EditName?.text.toString()
        age = Integer.valueOf(EditAge?.text.toString())

        textView_Name?.text = name// podemos obtener datos o asignar datos
        textView_Age?.text = age.toString()

    }
}
