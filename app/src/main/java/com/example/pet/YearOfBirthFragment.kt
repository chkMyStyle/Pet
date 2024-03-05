package com.example.pet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.pet.databinding.FragmentYearOfBirthBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [YearOfBirthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class YearOfBirthFragment : Fragment() {
    private var _binding: FragmentYearOfBirthBinding? = null
    private val binding get() = _binding!!

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentYearOfBirthBinding.inflate(inflater)

        val backButton = binding.imageButtonBackButtonStep01
        val createAccountButton = binding.buttonCreateAccountStep01

        val yearNumberPicker = binding.numberPicker

        yearNumberPicker.setFormatter { value ->
            String.format("%d", value)
        }

        clickBackButton(backButton)
        clickCreateAccountButton(createAccountButton)

        return binding.root
    }

    private fun clickCreateAccountButton(buttonCreateAccount: View) {
        buttonCreateAccount.setOnClickListener {
            parentFragmentManager.commit {
                remove(this@YearOfBirthFragment)
                replace<ChooseMoodFragment>(R.id.yearsOfBirdFragment)
                addToBackStack(ChooseMoodFragment::class.java.simpleName)
            }
        }
    }

    private fun clickBackButton(backButton: View) {
        backButton.setOnClickListener {
            parentFragmentManager.commit {
                replace<RegistrationFragment>(R.id.yearsOfBirdFragment)
                addToBackStack(RegistrationFragment::class.java.simpleName)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment YearOfBirthFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            YearOfBirthFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}