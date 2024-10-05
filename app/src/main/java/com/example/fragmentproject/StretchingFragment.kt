package com.example.fragmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentproject.databinding.FragmentStretchingBinding

class StretchingFragment : Fragment() {
    private var _binding: FragmentStretchingBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout usando View Binding
        _binding = FragmentStretchingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var btnInit = binding.viewInitButton
        var btnRoutine = binding.viewRoutineButton

        btnInit.setOnClickListener{
            findNavController().navigate(R.id.action_stretchingFragment_to_initFragment)
        }

        btnRoutine.setOnClickListener{
            findNavController().navigate(R.id.action_stretchingFragment_to_routineFragment)
        }
    }
}