package com.example.pet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.fragment.findNavController
import com.example.pet.databinding.FragmentChooseMoodBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChooseMoodFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChooseMoodFragment : Fragment() {
    private var _binding: FragmentChooseMoodBinding? = null
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
        _binding = FragmentChooseMoodBinding.inflate(inflater)

        val backButton = binding.imageButtonChooseMood
        val continueButton = binding.buttonContinueChooseMood

        val toggleButtons = listOf(
            binding.toggleButton1ChooseMood,
            binding.toggleButton2ChooseMood,
            binding.toggleButton3ChooseMood,
            binding.toggleButton4ChooseMood,
            binding.toggleButton5ChooseMood,
            binding.toggleButton6ChooseMood,
            binding.toggleButton7ChooseMood,
            binding.toggleButton8ChooseMood
        )

        toggleButtons.forEach { toggleButton ->
            toggleButton.setOnClickListener {
                if (toggleButton.isChecked) {
                    toggleButton.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.choose_active_button)
                    val textColor =
                        ContextCompat.getColorStateList(
                            requireContext(),
                            R.color.color_text_toggle_button_active
                        )
                    toggleButton.setTextColor(textColor)
                } else {
                    toggleButton.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.choose_no_active_bar)
                    val textColor = ContextCompat.getColorStateList(
                        requireContext(),
                        R.color.color_text_toggle_button_no_active
                    )
                    toggleButton.setTextColor(textColor)
                }
            }
        }

        clickBackButton(backButton)
        clickButtonContinue(continueButton)

        return binding.root
    }

    private fun clickButtonContinue(buttonContinue: View) {
        buttonContinue.setOnClickListener {
            findNavController().navigate(R.id.action_chooseMoodFragment_to_mentalHealthFragment)
        }
    }

    private fun clickBackButton(backButtonStep02: View) {
        backButtonStep02.setOnClickListener {
            findNavController().navigate(R.id.action_chooseMoodFragment_to_yearOfBirthFragment)
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
         * @return A new instance of fragment ChooseMoodFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChooseMoodFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
