package com.example.myblog.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myblog.R
import com.example.myblog.data.model.Post
import com.example.myblog.databinding.FragmentHomeScreenBinding
import com.example.myblog.ui.home.adapter.HomeScreenAdapter

class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeScreenBinding.bind(view)
        val postList = listOf(
            Post(
                "https://cdn-icons-png.freepik.com/256/16429/16429645.png",
                "Jonathan", java.sql.Timestamp(System.currentTimeMillis()),
                "https://www.post-it.com.mx/wps/wcm/connect/e8c3a978-4e86-4ac9-98b4- ee8dcdb0cfbe / SOSD_Post -it_Thumbnails_02_515x350.jpg? MOD = AJPERES & CACHEID = ROOTWORKSPACE -e8c3a978 -4e86 - 4 ac9 -98 b4 -ee8dcdb0cfbe - otMRPkq"),
            Post ("https://cdn-icons-png.freepik.com/256/16429/16429645.png",
                "Jonathan", java.sql.Timestamp(System.currentTimeMillis()),
                "https://www.post-it.com.mx/wps/wcm/connect/e8c3a978-4e86-4ac9-98b4- ee8dcdb0cfbe / SOSD_Post -it_Thumbnails_02_515x350.jpg? MOD = AJPERES & CACHEID = ROOTWORKSPACE -e8c3a978 -4e86 - 4 ac9 -98 b4 -ee8dcdb0cfbe - otMRPkq"),
            Post(
                "https://cdn-icons-png.freepik.com/256/16429/16429645.png",
                "Jonathan", java.sql.Timestamp(System.currentTimeMillis()),
                "https://www.post-it.com.mx/wps/wcm/connect/e8c3a978-4e86-4ac9-98b4- ee8dcdb0cfbe / SOSD_Post -it_Thumbnails_02_515x350.jpg? MOD = AJPERES & CACHEID = ROOTWORKSPACE -e8c3a978 -4e86 - 4 ac9 -98 b4 -ee8dcdb0cfbe - otMRPkq")
        )
        binding.rvHome.adapter = HomeScreenAdapter(postList)
    }
}