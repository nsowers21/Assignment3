package edu.temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ImageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview= findViewById<RecyclerView>(R.id.recyclerView)
        val descriptionTextView = findViewById<TextView>(R.id.name)
        val displayImageView = findViewById<ImageView>(R.id.player)

        // Creating an instance of our custom adapter and passing in context, along with a
        // collection of data elements
        recyclerview.adapter = ImageAdapter(this, getTestData())

        

    }
    fun getTestData() : Array<ImageObject> {
        val imageObject = arrayOf(ImageObject("Lebron James", R.drawable.lebron)
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
        return imageObject
    }
}