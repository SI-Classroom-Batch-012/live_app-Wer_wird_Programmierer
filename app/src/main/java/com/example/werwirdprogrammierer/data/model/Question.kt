package de.syntax_institut.werwirdprogrammierer.data.model

/**
 * Diese Klasse steht für eine Frage, in der die Antwortmöglichkeiten, die richtige Antwort und die
 * dazugehörige Preisstufe gespeichert sind
 *
 * @param question die Frage
 * @param answerA die erste Anwortmöglichkeit (Index 1)
 * @param answerB die zweite Anwortmöglichkeit (Index 2)
 * @param answerC die dritte Anwortmöglichkeit (Index 3)
 * @param answerD die vierte Anwortmöglichkeit (Index 4)
 * @param rightAnswer der Index der richtigen Anwort (1..4)
 * @param price die Preisstufe die zu dieser Frage gehört
 */
data class Question(
    val question: String,
    val answerA: String,
    val answerB: String,
    val answerC: String,
    val answerD: String,
    val rightAnswer: Int,
    val price: Int
)