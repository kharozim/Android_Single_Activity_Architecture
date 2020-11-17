package id.kharozim.androidsingleactivityarchitecture.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.kharozim.androidsingleactivityarchitecture.R
import id.kharozim.androidsingleactivityarchitecture.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false).apply {


            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when(item.itemId) {
                    R.id.btNavList -> {

                        true
                    }
                    R.id.btNavHome -> {
                        // Respond to navigation item 1 click
                        true
                    }
                    R.id.btNavProfile -> {
                        // Respond to navigation item 1 click
                        true
                    }
                    else -> false
                }
            }
        }
        return binding.root
    }
}