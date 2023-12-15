package de.syntax_institut.werwirdprogrammierer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.werwirdprogrammierer.R
import com.example.werwirdprogrammierer.databinding.FragmentQuizBinding
import com.example.werwirdprogrammierer.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding
    private val viewmodel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tvExit.setOnClickListener {
            activity?.finish()
        }

        binding.tvPlayAgain.setOnClickListener {
            viewmodel.restartGame()
        }

        viewmodel.quizFinished.observe(viewLifecycleOwner) {finished ->
            if(!finished){

                findNavController().navigateUp()

            }
        }

        viewmodel.cashEarned.observe(viewLifecycleOwner) {price ->

            if(price == 1000000) {
                binding.tvResult.text = getString(R.string.game_won)
            } else {
                binding.tvResult.text = getString(R.string.game_over)
            }

            val priceString = getString(R.string.you_won_amount, price)
            binding.tvAmountWon.text = priceString

        }


    }

}