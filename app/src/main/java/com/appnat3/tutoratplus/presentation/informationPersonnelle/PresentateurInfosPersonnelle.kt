package com.appnat3.tutoratplus.presentation.informationPersonnelle

import android.graphics.ColorSpace
import android.os.Build
import androidx.annotation.RequiresApi
import com.appnat3.tutoratplus.presentation.Modele


class PresentateurInfosPersonnelle(var vue: VueInformationPersonnlle, val modele: Modele) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun traiterCreationInfoPerso(da:String, prenom:String, nom:String, courriel:String){
        modele.daInfoPerso = da
        modele.prenomInfoPerso = prenom
        modele.nomInfoPerso = nom
        modele.courrielInfoPerso = courriel
    }

    fun effectuerNaviguationCalendrier() {
        vue.naviguerVerspage_calendrier()
    }

    fun effectuerNaviguationAcceuil() {
        vue.naviguerVersmenu_principal()
    }

    fun effectuerNaviguationPageConfirmation() {
        vue.naviguerVerspage_confirmation()
    }
}