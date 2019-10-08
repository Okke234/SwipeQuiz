package com.example.swipequiz

class Question(var question: String, var answer: Boolean) {

    companion object {
        val QUESTIONS = arrayOf(
            "Februari heeft 31 dagen",
            "Max Verstappen is coureur voor McLaren",
            "Deze zomer is in Nederland meer dan 40 graden gemeten",
            "Android studio ondersteunt zowel Java als Kotlin",
            "Streamer 'Ninja' is overleden aan Ligma"
        )

        val ANSWERS = arrayOf(
            false,
            false,
            true,
            true,
            true
        )
    }

}