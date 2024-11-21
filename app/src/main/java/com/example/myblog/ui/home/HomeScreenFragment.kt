package com.example.blogapp.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.blogapp.ui.home.adapter.HomeScreenAdapter
import com.example.myblog.R
import com.example.myblog.data.model.Post
import com.example.myblog.databinding.FragmentHomeScreenBinding
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration


class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding
    private lateinit var firestore: FirebaseFirestore
    private var postListener: ListenerRegistration? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeScreenBinding.bind(view)

        firestore = FirebaseFirestore.getInstance()

        val postList = mutableListOf<Post>()
        val adapter = HomeScreenAdapter(postList)
        binding.rvHome.adapter = adapter

        // Listener en tiempo real para la colección "posts"
        postListener = firestore.collection("posts")
            .addSnapshotListener { snapshots, e ->
                if (e != null) {
                    Log.w("FirestoreListener", "Error al escuchar los cambios", e)
                    return@addSnapshotListener
                }

                if (snapshots != null) {
                    postList.clear()
                    for (doc in snapshots.documents) {
                        val post = doc.toObject(Post::class.java)
                        if (post != null) {
                            postList.add(post)
                        }
                    }
                    adapter.notifyDataSetChanged()
                }
            }
    }
}
