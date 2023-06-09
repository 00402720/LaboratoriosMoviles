package com.example.labo05.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.labo05.R
import com.example.labo05.databinding.FragmentNewMovieBinding

class BillboardFragment : Fragment() {

    private lateinit var newMovieButton: Button
    private lateinit var binding: FragmentNewMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNewMovieBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        newMovieButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_newMovieFragment)
        }
    }

    private fun bind(){
        newMovieButton = view?.findViewById(R.id.fab) as Button
    }
}

