package edu.temple


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*


class ImageAdapter(private val activity: ImageActivity, var players: Array<ImageObject>): RecyclerView.Adapter<ImageAdapter.Viewholder>() {
    class Viewholder(itemView: View): ViewHolder(itemView){
        var imageView: ImageView = itemView.findViewById(R.id.playerPic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.grid_layout, parent,false))
    }
    override fun getItemCount(): Int {
        return players.size
    }
    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.imageView.setImageResource(players[position].imageId)

        holder.itemView.setOnClickListener{
            val name = activity.findViewById<TextView>(R.id.name)
            val player = activity.findViewById<ImageView>(R.id.player)
            player.setImageResource(players[position].imageId)
            name.text = players[position].text
        }
    }




}
