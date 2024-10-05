package com.example.fragmentproject

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentproject.databinding.FragmentInitBinding

class InitFragment : Fragment() {

    private var _binding: FragmentInitBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout usando View Binding
        _binding = FragmentInitBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var btnStretching = binding.viewStretchingButton
        var btnRoutine = binding.viewRoutineButton

        btnStretching.setOnClickListener{
            findNavController().navigate(R.id.action_initFragment_to_stretchingFragment)
        }

        btnRoutine.setOnClickListener{
            findNavController().navigate(R.id.action_initFragment_to_routineFragment)
        }
    }


}