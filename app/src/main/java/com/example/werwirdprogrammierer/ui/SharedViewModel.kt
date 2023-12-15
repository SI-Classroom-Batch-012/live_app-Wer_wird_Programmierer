package de.syntax_institut.werwirdprogrammierer.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.syntax_institut.werwirdprogrammierer.data.AppRepository
import de.syntax_institut.werwirdprogrammierer.data.model.Question

class SharedViewModel : ViewModel() {

    private val allQuestions = AppRepository().questions

    private val _currentQuestion: MutableLiveData<Question> = MutableLiveData(allQuestions[0])
    val currentQuestion: LiveData<Question>
        get() = _currentQuestion

    private val _quizFinished: MutableLiveData<Boolean> = MutableLiveData(false)
    val quizFinished: LiveData<Boolean>
        get() = _quizFinished

    private val _cashEarned: MutableLiveData<Int> = MutableLiveData(0)
    val cashEarned: LiveData<Int>
        get() = _cashEarned


    //Setzt den Inhalt der currentQuestion auf die nächste Frage
    fun answerQuestion(question: Question, clickedAnswerIndex: Int) {

        val isAnswerCorrect: Boolean = (question.rightAnswer == clickedAnswerIndex)

        if (isAnswerCorrect) {

            _cashEarned.value = question.price

            nextQuestion()

        } else {

            _quizFinished.value = true

        }


    }


    fun nextQuestion() {

        //speichert den Index der currentQuestion
        val currentIndex = allQuestions.indexOf(currentQuestion.value)

        //überprüfe ob die letzte Frage beantwortet wurde
        if (currentIndex == allQuestions.size - 1) {
            _quizFinished.value = true
        } else {
            _currentQuestion.value = allQuestions[currentIndex + 1]
        }

    }

    fun restartGame() {

        _currentQuestion.value = allQuestions[0]
        _cashEarned.value = 0
        _quizFinished.value = false


    }

}