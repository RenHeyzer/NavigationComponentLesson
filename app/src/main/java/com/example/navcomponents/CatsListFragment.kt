package com.example.navcomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navcomponents.databinding.FragmentCatsListBinding

class CatsListFragment : Fragment(), OnItemClickListener {

    private var binding: FragmentCatsListBinding? = null
    private val catsList: ArrayList<CatsModel> = ArrayList()
    private val adapter = CatsAdapter(catsList, this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatsListBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        binding?.rvCats?.layoutManager = LinearLayoutManager(requireContext())
        catsList.addAll(CatsProvider.getListCatError())
        binding?.rvCats?.adapter = adapter
    }


    override fun onClick(catsModel: CatsModel) {
        findNavController().navigate(
            CatsListFragmentDirections.actionCatsListFragmentToCatDetailFragment(
                catsModel.name, catsModel.imageUrl
            )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}