package com.example.navcomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcomponents.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickListener()
    }

    private fun initClickListener() {
//        binding?.btnSend?.setOnClickListener {
//            val textFromEditText = binding?.editText?.text.toString()
//            findNavController().navigate(
//                FirstFragmentDirections.actionFirstFragmentToSecondFragment(
//                    textFromEditText
//                )
//            )
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}