package com.example.pet

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ToggleButton
import androidx.core.content.ContextCompat
import com.example.pet.databinding.FragmentChooseMoodFragmnetBinding
import com.example.pet.databinding.FragmentYearOfBirthBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChooseMoodFragmnet.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChooseMoodFragmnet : Fragment() {
    private var _binding : FragmentChooseMoodFragmnetBinding? = null
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
    ): View? {
        _binding = FragmentChooseMoodFragmnetBinding.inflate(inflater)

        val backButtonStep02 = binding.imageButtonBackStep02
        val buttonContinue = binding.buttonContinueStep02

        val buttonToggleClick1 = binding.toggleButton1Step02
        val buttonToggleClick2 = binding.toggleButton2Step02
        val buttonToggleClick3 = binding.toggleButton3Step02
        val buttonToggleClick4 = binding.toggleButton4Step02
        val buttonToggleClick5 = binding.toggleButton5Step02
        val buttonToggleClick6 = binding.toggleButton6Step02
        val buttonToggleClick7 = binding.toggleButton7Step02
        val buttonToggleClick8 = binding.toggleButton8Step02

        backButtonStep02(backButtonStep02)
        buttoContinue(buttonContinue)

        buttonClick(buttonToggleClick1)
        buttonClick(buttonToggleClick2)
        buttonClick(buttonToggleClick3)
        buttonClick(buttonToggleClick4)
        buttonClick(buttonToggleClick5)
        buttonClick(buttonToggleClick6)
        buttonClick(buttonToggleClick7)
        buttonClick(buttonToggleClick8)

        return binding.root
    }


    fun buttonClick(toggleButton: ToggleButton) {
        toggleButton.setOnClickListener {
            if (toggleButton.isChecked) {
                toggleButton.background =
                    ContextCompat.getDrawable(requireContext(), R.drawable.choose_active_button)
                val textColor =
                    ContextCompat.getColorStateList(requireContext(), R.color.color_text_toggle_button_active)
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

    fun buttoContinue(buttonContinue: View) {
        buttonContinue.setOnClickListener {
            val intent = Intent(requireContext(), SurveyStep03::class.java)
            startActivity(intent)
        }
    }

    fun backButtonStep02(backButtonStep02: View) {
        backButtonStep02.setOnClickListener {
            val intent = Intent(requireContext(), FragmentYearOfBirthBinding::class.java)
            startActivity(intent)
        }
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ChooseMoodFragmnet.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChooseMoodFragmnet().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}