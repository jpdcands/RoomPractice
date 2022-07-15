package com.ebookfrenzy.roompractice

import Database.VerticalTractionRoomDatabase
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ebookfrenzy.roompractice.databinding.FragmentVerticalTractionBinding

class VerticalTractionFragment : Fragment() {
    private var _binding: FragmentVerticalTractionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVerticalTractionBinding.inflate(inflater, container, false)
        val view = binding.root

        val application = requireNotNull(this.activity).application
        val dao = VerticalTractionRoomDatabase.getInstance(application).verticalTractionDao
        val viewModelFactory = VerticalTractionViewModelFactory (dao)
        val viewModel = ViewModelProvider(
            this, viewModelFactory. get(VerticalTractionViewModel::class.java)
        binding.viewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner
        return view
        }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}