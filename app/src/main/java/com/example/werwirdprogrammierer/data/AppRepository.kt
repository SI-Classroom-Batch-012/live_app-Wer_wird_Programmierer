package de.syntax_institut.werwirdprogrammierer.data

import de.syntax_institut.werwirdprogrammierer.data.model.Question

class AppRepository {

    val questions: List<Question>
        get() {
            return loadQuestions()
        }

    /**
     * Diese Funktion liefert eine Liste an Question Objekten zurück, in denen die Fragen, die
     * Antwortmöglichkeiten, der Index der richtigen Antwort und die Preisstufe gespeichert sind
     */
    private fun loadQuestions(): List<Question> {
        return listOf(
            Question(
                "Was ist \"Kotlin\"?",
                "Eine Automarke",
                "Ein Land",
                "Ein Gericht",
                "Eine Programmiersprache",
                4,
                50
            ),
            Question(
                "Welche View zeigt Bilder an?",
                "TextView",
                "EditText",
                "ImageView",
                "FotoView",
                3,
                100
            ),
            Question(
                "Wie heißt die Simulation eines Smartphones in Android Studio?",
                "Emulator",
                "Emulgator",
                "Elmolator",
                "Ellogator",
                1,
                200
            ),
            Question(
                "Wie konvertiert man zu einer Gleitkomazahl?",
                "toInt()",
                "toString()",
                "toChar()",
                "toDouble()",
                4,
                300
            ),
            Question(
                "Was gibt diese Funktion zurück?\nfun doStuff(nr: Int): String {...}",
                "Eine Kommazahl",
                "Einen Integer",
                "Einen String",
                "Einen fun",
                3,
                500
            ),
            Question(
                "Wofür steht \"Int\"",
                "Internal",
                "Internet",
                "Integer",
                "Instant",
                3,
                1000
            ),
            Question(
                "Wo kann man Bilder für die App importieren?",
                "Resource Manager",
                "Image Importer",
                "Foto Manager",
                "Picture CEO",
                1,
                2000
            ),
            Question(
                "Wie heißt die Verknüpfung von XML Elementen und Code?",
                "Info binding",
                "binding Info",
                "View binder",
                "View Binding",
                4,
                4000
            ),
            Question(
                "Wofür steht \"XML\"?",
                "Extra Module Language",
                "Extreme Management Language",
                "Extensible Markup Language",
                "Xylophone Melody Lover",
                3,
                8000
            ),
            Question(
                "Wo kommen die Daten einer MVVM App her?",
                "Repository",
                "ViewModel",
                "Fragment",
                "Activity",
                1,
                16000
            ),
            Question(
                "Was ist eine Komponente der RecyclerView?",
                "Generator",
                "Factory",
                "Adapter",
                "Port",
                3,
                32000
            ),
            Question(
                "Was ist kein Architekturmuster?",
                "MVVM",
                "MVP",
                "MVC",
                "MLP",
                4,
                64000
            ),
            Question(
                "Wo findet man die Logik einer MVVM App?",
                "Repository",
                "ViewModel",
                "Fragment",
                "Activity",
                2,
                125000
            ),
            Question(
                "Was ist keine Funktion der Adapterklasse einer RecyclerView?",
                "onCreateViewHolder()",
                "onBindViewHolder()",
                "onRecycleView()",
                "getItemCount()",
                3,
                500000
            ),
            Question(
                "Wofür steht MVVM",
                "Model View ViewModel",
                "ModelView View Model",
                "Model ViewModel View Model",
                "ModelView ViewModel",
                1,
                1000000
            )
        )
    }
}