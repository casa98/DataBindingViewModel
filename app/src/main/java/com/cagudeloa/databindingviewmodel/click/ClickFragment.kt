package com.cagudeloa.databindingviewmodel.click

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.cagudeloa.databindingviewmodel.R
import com.cagudeloa.databindingviewmodel.databinding.FragmentClickBinding

class ClickFragment : Fragment() {

    private lateinit var binding: FragmentClickBinding
    private lateinit var viewModel: ClickViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_click, container, false)
        viewModel = ViewModelProvider(this).get(ClickViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}