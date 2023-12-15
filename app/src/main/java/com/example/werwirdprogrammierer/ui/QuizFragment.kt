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

class QuizFragment : Fragment() {

    private val viewmodel: SharedViewModel by activityViewModels()
    private lateinit var binding: FragmentQuizBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQuizBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel.currentQuestion.observe(viewLifecycleOwner) {question ->

            binding.tvQuestion.text = question.question
            binding.tvAnswerA.text = question.answerA
            binding.tvAnswerB.text = question.answerB
            binding.tvAnswerC.text = question.answerC
            binding.tvAnswerD.text = question.answerD
            binding.tvPrice.text = question.price.toString()

            binding.tvAnswerA.setOnClickListener {
                viewmodel.answerQuestion(question, 1)
            }

            binding.tvAnswerB.setOnClickListener {
                viewmodel.answerQuestion(question, 2)
            }

            binding.tvAnswerC.setOnClickListener {
                viewmodel.answerQuestion(question, 3)
            }

            binding.tvAnswerD.setOnClickListener {
                viewmodel.answerQuestion(question, 4)
            }

        }

        viewmodel.quizFinished.observe(viewLifecycleOwner) {finished ->

            if(finished){
                findNavController().navigate(R.id.resultFragment)
            }

        }
    }

}