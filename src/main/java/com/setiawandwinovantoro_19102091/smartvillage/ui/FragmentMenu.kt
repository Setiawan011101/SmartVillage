package com.setiawandwinovantoro_19102091.smartvillage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.setiawandwinovantoro_19102091.smartvillage.databinding.FragmentMenuBinding

class FragmentMenu : Fragment() {
    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_menu, container, false)
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tombol1.setOnClickListener {
            activity?.let {
                val intent = Intent(it, BeritaActivity::class.java)
                it.startActivity(intent)
            }
        }
        binding.tombol2.setOnClickListener {
            activity?.let {
                val intent = Intent(it, PengaduanActivity::class.java)
                it.startActivity(intent)
            }
        }
        binding.tombol3.setOnClickListener {
            activity?.let {
                val intent = Intent(it, StatistikActivity::class.java)
                it.startActivity(intent)
            }
        }
    }
}