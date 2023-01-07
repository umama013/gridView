package com.uk.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView = findViewById(R.id.gridView)
        fillArrays()
        val adapter = AnimalsAdapter(this,nameList,imageList)
        gridView.adapter = adapter
        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext,"you have selected ${nameList[position]}",Toast.LENGTH_LONG).show()
        }
    }
     fun fillArrays ()
     {
         nameList.add("Balbasaur")
         nameList.add("Squirtle")
         nameList.add("Psyduck")
         nameList.add("Togepi")
         nameList.add("Mewtwo")
         nameList.add("Snorlax")
         nameList.add("Ditto")
         nameList.add("Sylveon")
         nameList.add("Gorchomp")

         imageList.add(R.drawable.bulbasaur)
         imageList.add(R.drawable.squitlee)
         imageList.add(R.drawable.psyduck)
         imageList.add(R.drawable.togepii)
         imageList.add(R.drawable.mewtwo)
         imageList.add(R.drawable.snorlax)
         imageList.add(R.drawable.ditto)
         imageList.add(R.drawable.sylveon)
         imageList.add(R.drawable.garchomp)




     }



}

