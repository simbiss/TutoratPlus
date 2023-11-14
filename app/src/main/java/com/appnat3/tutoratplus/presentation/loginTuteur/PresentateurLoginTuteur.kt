package com.appnat3.tutoratplus.presentation.loginTuteur

import VueLoginTuteur
import com.appnat3.tutoratplus.domaine.entite.InfoLogin
import com.appnat3.tutoratplus.presentation.Modele

class PresentateurLoginTuteur(var vue : VueLoginTuteur) {



                //private var listeInfoLogin = arrayListOf<InfoLogin>()


    fun traiterValidationInfoLogin(username:String, password:String):Boolean{

        var listeInfoLogin = Modele.listeInfoLogin


        for (item in listeInfoLogin){
            if(item.nomUtilisateur == username) {
                if (item.motDePasse == password) {
                    return true
                }
            }
        }
        return false
    }

    fun traiterCollectInformationLogin(username: String){

        for ((key, InfoLogin) in Modele.mapInfoLogin){
            if(InfoLogin.nomUtilisateur == username){       //condition pour trouver la position de la clée du tuteur a logger
                var idOuvertureSessionLogin = key

                for ((key, Tuteur) in Modele.mapListTuteur){
                    if(key == idOuvertureSessionLogin) {        //condition pour assigner dans le modele quelle tuteur logger
                        Modele.ouvertureSessionTuteur = Tuteur
                    }
                }
            }
        }


    }

    fun effectuerNavigationAcceuil(){
        vue.naviguerVersmenu_principal()
    }

    fun effectuerNavigationPageTuteur(){
        vue.navigationVerspage_principal_tuteur()
    }


}