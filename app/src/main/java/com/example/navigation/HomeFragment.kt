package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.ActivityMainBinding
import com.example.navigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

    //action_homeFregment
        val navController =findNavController()
        binding.buttonHomeToRecibir.setOnClickListener {
          navController.navigate(R.id.action_homeFragment_to_insideHome)
           val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome()
             navController.navigate(directions)
            binding.etName.toString()
        }
      return  binding.root
    }



}