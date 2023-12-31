package com.route.facebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    var posts: ArrayList<PostDM> = ArrayList()
    lateinit var postsAdapter: PostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        makeVirtualPosts()
        recyclerView = findViewById(R.id.recyclerView)
        postsAdapter = PostsAdapter(posts)
        recyclerView.adapter = postsAdapter
    }

    private fun makeVirtualPosts() {
        for (x in 0..10) {
            posts.add(
                PostDM(
                    R.drawable.profile,
                    "Free Palestine",
                    "just now",
                    "Free Palestine and will be always free insha' allah",
                    R.drawable.post,
                    0, 0
                )
            )
        }
    }

}