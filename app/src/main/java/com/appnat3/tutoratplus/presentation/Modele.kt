package com.appnat3.tutoratplus.presentation

import com.appnat3.tutoratplus.domaine.entité.Cours
import com.appnat3.tutoratplus.domaine.entité.Tuteur


object Modele{

    /**
     * initialisation des different cours de tutorat
     */
    var listeDesCours = mutableListOf<Cours>()
    var coursSelectionne: Cours? = null

    init {
        var cours1 = Cours("Programmation 1", "programmation")
        var cours2 = Cours("Programmation 2", "reseau")
        var cours3 = Cours("Programmation 2", "programmation")
        var cours4 = Cours("Programmation Autre et BD", "programmation")
        var cours5 = Cours("Réseautique", "reseau")

        listeDesCours.add(cours1)
        listeDesCours.add(cours2)
        listeDesCours.add(cours3)
        listeDesCours.add(cours4)
        listeDesCours.add(cours5)
    }

    /**
     * Méthode pour retourner tout les cours de tutorat
     */
    fun retourListeDesCours():List<Cours> {
        return listeDesCours
    }

    fun retourCoursSelectionne(): Cours? {
        return coursSelectionne
    }


    /**
     * initialisation des different cours de tutorat
     */
    var listeTuteurs = mutableListOf<Tuteur>()
    var tuteurSelectionne: Tuteur? = null

    init {
        var tuteur1 = Tuteur("Mohamed Fatene", "programmation")
        var tuteur2 = Tuteur("Raphaël Beyrouthy", "reseau")
        var tuteur3 = Tuteur("Lakhdar Amine Ouzou", "programmation")
        var tuteur4 = Tuteur("Elliott Fournier-Robert", "programmation")
        var tuteur5 = Tuteur("Antoine Lépine", "reseau")

        listeTuteurs.add(tuteur1)
        listeTuteurs.add(tuteur2)
        listeTuteurs.add(tuteur3)
        listeTuteurs.add(tuteur4)
        listeTuteurs.add(tuteur5)
    }

    fun retourListeTuteur():List<Tuteur>{
        return listeTuteurs
    }


}