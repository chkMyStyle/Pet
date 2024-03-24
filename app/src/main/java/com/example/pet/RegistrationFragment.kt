package com.example.pet

import android.graphics.BlendModeColorFilter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Toast
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.fragment.findNavController
import com.example.pet.databinding.FragmentRegistrationBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegistrationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegistrationFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

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
        _binding = FragmentRegistrationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val continueButton = binding.buttonContinueMain
        val checkBoxRegistration = binding.checkBoxRegisterMain
        val activeColor = resources.getColor(R.color.color_bg_button_cotinue, null)
        val inactiveColor = resources.getColor(R.color.color_bg_button_cotinue, null)

        checkBoxRegistration.buttonDrawable?.colorFilter =
            BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                inactiveColor,
                BlendModeCompat.SRC_ATOP
            )
        clickNextScreenButton(continueButton, checkBoxRegistration, activeColor, inactiveColor)
    }

    private fun clickNextScreenButton(
        buttonNexScreen: View,
        checkBoxRegister: CheckBox,
        actColor: Int,
        inActColor: Int
    ) {
        checkBoxRegister.setOnCheckedChangeListener { buttonView, isChecked ->
            val color = if (isChecked) actColor else inActColor
            buttonView.buttonDrawable?.colorFilter =
                BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                    color,
                    BlendModeCompat.SRC_ATOP
                )
        }
        buttonNexScreen.setOnClickListener {
            if (checkBoxRegister.isChecked.not()) {
                Toast.makeText(requireContext(), "Подтвердите соглашение", Toast.LENGTH_SHORT)
                    .show()
            } else {
                findNavController().navigate(R.id.action_registrationFragment_to_yearOfBirthFragment)
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
         * @return A new instance of fragment RegistrationFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RegistrationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}