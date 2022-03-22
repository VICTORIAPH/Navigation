package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.navigation.databinding.ActivityMainBinding
import com.example.navigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container, false)
        binding.buttonHomeToInside.setOnClickListener {
            Toast.makeText(context, "prueba", Toast.LENGTH_SHORT).show()
        }
      return  binding.root

    }
}