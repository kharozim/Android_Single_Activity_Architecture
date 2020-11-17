package id.kharozim.androidsingleactivityarchitecture.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import id.kharozim.androidsingleactivityarchitecture.R
import id.kharozim.androidsingleactivityarchitecture.databinding.FragmentHomeMainBinding

class HomeFragmentMain : Fragment() {

    private lateinit var binding: FragmentHomeMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeMainBinding.inflate(inflater, container, false).apply {

            showFragment(HomekuFragment())
            bottomNavigation.setOnNavigationItemSelectedListener() {
                when (it.itemId) {
                    R.id.btNavList -> {
                        showFragment(ListFragment())
                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.btNavHome -> {
                        showFragment(HomekuFragment())
                        return@setOnNavigationItemSelectedListener true

                    }
                    R.id.btNavFav -> {
                        showFragment(FavFragment())
                        // Respond to navigation item 1 click
                        return@setOnNavigationItemSelectedListener true

                    }  R.id.btNavCart -> {
                        showFragment(CartFragment())
                        // Respond to navigation item 1 click
                        return@setOnNavigationItemSelectedListener true

                    }  R.id.btNavProfile -> {
                        showFragment(ProfileFragment())
                        // Respond to navigation item 1 click
                        return@setOnNavigationItemSelectedListener true
                    }
                    else -> false
                }
            }
        }
        return binding.root
    }

    private fun showFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction().replace(R.id.home_fragment_main_container, fragment)
            .commit()
    }
}