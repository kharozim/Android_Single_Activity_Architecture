package id.kharozim.androidsingleactivityarchitecture.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.kharozim.androidsingleactivityarchitecture.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
  private lateinit var binding : FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false).apply {






        }
        return binding.root
    }

}