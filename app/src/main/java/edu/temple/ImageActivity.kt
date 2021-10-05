package edu.temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridManager = GridLayoutManager(this, 2)
        val recyclerview= findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.layoutManager=gridManager
        recyclerview.adapter= ImageAdapter(this, getPlayers())
    }

    private fun getPlayers() : Array<ImageObject> {
        val imageObjectList = arrayOf(ImageObject("Lebron James", R.drawable.lebron)
            ,ImageObject("Anthony Davis",R.drawable.ad)
            ,ImageObject("Allen Iverson", R.drawable.ai)
            ,ImageObject("Damian Lillard", R.drawable.dame)
            ,ImageObject("James Harden", R.drawable.harden)
            ,ImageObject("Joel Embiid", R.drawable.joel)
            ,ImageObject("Stephen Curry", R.drawable.steph)
            ,ImageObject("Michael Jordan", R.drawable.jordan)
            ,ImageObject("Kevin Durant", R.drawable.kd)
            ,ImageObject("Kobe Bryant", R.drawable.kobe)
            ,ImageObject("Shaquille O'neal", R.drawable.shaq)
            ,ImageObject("Dwayne Wade", R.drawable.wade));
        return imageObjectList
    }
}