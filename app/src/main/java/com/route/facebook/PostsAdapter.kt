package com.route.facebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class PostsAdapter(var posts: ArrayList<PostDM>) : Adapter<PostsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profilePic: ImageView = itemView.findViewById(R.id.profileImage)
        val postPic: ImageView = itemView.findViewById(R.id.postImage)
        val profileName: TextView = itemView.findViewById(R.id.profileNameTv)
        val timer: TextView = itemView.findViewById(R.id.timerTv)
        val postDescription: TextView = itemView.findViewById(R.id.postDescriptionTV)
        val likeCounter: TextView = itemView.findViewById(R.id.likeCounter)
        val shareCounter: TextView = itemView.findViewById(R.id.shareCounter)
        val likeBtn: Button = itemView.findViewById(R.id.likeBtn)
        val shareBtn: Button = itemView.findViewById(R.id.ShareBtn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.post_design, parent, false)
        )
    }

    override fun getItemCount(): Int = posts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = posts[position]

        holder.profilePic.setImageResource(post.profilePic)
        holder.postPic.setImageResource(post.postImage)
        holder.profileName.text = post.profileName
        holder.timer.text = post.time
        holder.postDescription.text = post.postDescription
        holder.likeCounter.text = post.likeCounter.toString()
        holder.shareCounter.text = post.shareCounter.toString()

        holder.likeBtn.setOnClickListener {
            if (post.likeCounter == 0)
                post.likeCounter++
            else
                post.likeCounter--

            holder.likeCounter.text = post.likeCounter.toString()
        }

        holder.shareBtn.setOnClickListener {
            post.shareCounter++
            holder.shareCounter.text = post.shareCounter.toString()
        }

    }
}