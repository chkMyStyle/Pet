package com.example.pet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.pet.databinding.FragmentMentalHealthBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MentalHealthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MentalHealthFragment : Fragment() {

    private var _binding: FragmentMentalHealthBinding? = null
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
        _binding = FragmentMentalHealthBinding.inflate(inflater)

        val backButtonView = binding.imageButtonBack
        clickBackButton(backButtonView)

        val continueButtonView = binding.imageButtonContinue
        clickContinueButton(continueButtonView)

        val toggleButtons = listOf(
            binding.toggleButton1,
            binding.toggleButton2,
            binding.toggleButton3,
            binding.toggleButton4,
            binding.toggleButton5,
            binding.toggleButton6,
            binding.toggleButton7,
            binding.toggleButton8,
            binding.toggleButton9,
            binding.toggleButton10,
            binding.toggleButton11,
            binding.toggleButton12
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
        return binding.root
    }

    private fun clickBackButton(backButton: View) {
        backButton.setOnClickListener {
            parentFragmentManager.commit {
                remove(this@MentalHealthFragment)
                replace<ChooseMoodFragment>(R.id.chooseMoodFragment)
                addToBackStack(ChooseMoodFragment::class.java.simpleName)
            }
        }
    }

    private fun clickContinueButton(view: View) {
        view.setOnClickListener {
            parentFragmentManager.commit {
                replace<MainScreenFragment>(R.id.mainScreenFragment)
                addToBackStack(MentalHealthFragment::class.java.simpleName)
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
         * @return A new instance of fragment MentalHealthFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MentalHealthFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}