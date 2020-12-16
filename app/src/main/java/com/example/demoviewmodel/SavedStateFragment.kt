package com.example.demoviewmodel

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.example.demoviewmodel.viewmodel.SavedStateViewModel
import kotlinx.android.synthetic.main.fragment_saved_state.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SavedStateFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SavedStateFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var viewModel: SavedStateViewModel

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = SavedStateFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_PARAM1, param1)
                putString(ARG_PARAM2, param2)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved_state, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("abba", "onViewCreated: saved state fragment")

        viewModel = ViewModelProvider(this, SavedStateViewModelFactory(requireActivity().application, this)).get(SavedStateViewModel::class.java)

        tv_saved_content.text = viewModel.text

        btn_add_text.setOnClickListener {
            if (edittext.text.isNotEmpty()) {
                viewModel.addText(edittext.text.toString())
                tv_saved_content.text = viewModel.text
            }
        }

    }


}