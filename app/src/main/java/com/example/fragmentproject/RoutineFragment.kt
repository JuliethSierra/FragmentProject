package com.example.fragmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentproject.databinding.FragmentRoutineBinding

class RoutineFragment : Fragment() {
    private var _binding: FragmentRoutineBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRoutineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var btnInit = binding.viewInitButton
        var btnStretching = binding.viewStretchingButton

        btnInit.setOnClickListener{
            findNavController().navigate(R.id.action_routineFragment_to_initFragment)
        }

        btnStretching.setOnClickListener{
            findNavController().navigate(R.id.action_routineFragment_to_stretchingFragment)
        }
    }

}