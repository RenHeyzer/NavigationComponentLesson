package com.example.navcomponents

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navcomponents.databinding.FragmentSecondBinding
import kotlinx.coroutines.delay

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null
//    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding?.textView?.text = args.text
//        binding?.textView?.setOnClickListener {
//            Toast.makeText(requireContext(), args.text, Toast.LENGTH_SHORT).show()
//            findNavController().navigateUp()
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}