package com.example.motivation.data

import com.example.motivation.infrastructure.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    private val mListPhrase: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e fez.", happy),

        Phrase("Você não é derrotado quando perde, " +
                "você é derrotado quando desiste!", happy),

        Phrase("Quando está mais escuro, vemos mais estrelas!", happy),

        Phrase("Não coloque limite em seus sonhos, coloque fé.", happy),

        Phrase("Comece onde está, use o que você tem, faça o que você pode.", happy),

        Phrase("A meta é ser melhor do que ontem, não melhor do que ninguém.", happy),

        Phrase("A maior recompensa pelo trabalho não é o que a pessoa ganha, " +
                "é o que ela se torna através dele.", sunny),

        Phrase("Você perde todas as chances que você não aproveita.", sunny),

        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),

        Phrase("Enquanto não estivermos comprometidos, haverá hesitação!", sunny),

        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),

        Phrase("Se você acredita, faz toda a diferença.", sunny),

        Phrase("Riscos devem ser corridos, " +
                "porque o maior perigo é não arriscar nada!", sunny)
    )

    fun getPhrase(value: Int): String {
        val filtered = mListPhrase.filter { it.categoryId == value || value == all}
        return filtered[Random.nextInt(filtered.size)].description
    }
}