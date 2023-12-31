package com.route.facebook

data class PostDM(
    val profilePic: Int, val profileName: String, val time: String = "Just now",
    val postDescription: String = "", val postImage: Int, var likeCounter: Int = 0,
    var shareCounter: Int = 0
)
