package com.example.navcomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.navcomponents.databinding.FragmentCatDetailBinding

class CatDetailFragment : Fragment() {

    private var binding: FragmentCatDetailBinding? = null
    private val args by navArgs<CatDetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatDetailBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.detailTitle?.text = args.errorTitle
        binding?.detailImage?.let {
            Glide.with(it)
                .load(args.imageUrl)
                .into(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}