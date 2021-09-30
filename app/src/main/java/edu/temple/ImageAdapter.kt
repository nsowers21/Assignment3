package edu.temple

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class ImageAdapter(val _context: Context, _imageObjects: Array<ImageObject>) : BaseAdapter() {

    val imageObjects = _imageObjects;
    val inflater = LayoutInflater.from(_context)

    override fun getCount(): Int {
        return imageObjects.size
    }

    override fun getItem(position: Int): Any {
        return imageObjects.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        var layout : View
        //var descriptionTextView: TextView
        var imageView: ImageView


        // The Recycle Pattern: If a previously used View is provided then reuse it
        // Otherwise create (or inflate) a new one
        if (convertView is ConstraintLayout)
            layout = convertView
        else
            layout = inflater.inflate(R.layout.grid_layout, null)

        // Regardless of if the layout is created or reused, we need to access the views
        // found inside
        imageView = layout.findViewById(R.id.imageView)
        //descriptionTextView = layout.findViewById(R.id.descriptionTextView)

        // And now we can set the views based on the ImageObject specified
        // by the 'position' parameter
        imageView.setImageResource(imageObjects[position].resourceId)
        //descriptionTextView.text = imageObjects[position].description

        // Dim the view slightly
        return layout.apply { alpha = .2f };
    }
