package com.v15h4l.userbook.ui.addedituser

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.v15h4l.userbook.databinding.FragmentAddEditUserBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Fragment to show add/edit User form
 */
@AndroidEntryPoint
class AddEditUserFragment : Fragment() {

    private var _binding: FragmentAddEditUserBinding? = null
    private val binding get() = _binding!!

    private val viewModel: AddEditUserViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddEditUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}