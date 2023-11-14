package com.appnat3.tutoratplus.presentation.pagePrincipalTuteur

import android.os.Build
import androidx.annotation.RequiresApi
import com.appnat3.tutoratplus.presentation.Modele

class PresentateurPagePrincipalTuteur(var vue: VuePagePrincipalTuteur, private val modele: Modele){

    @RequiresApi(Build.VERSION_CODES.O)
    fun traiderNomTuteurLogger(): String?{
        return modele.ouvertureSessionTuteur?.nomTuteur
    }

}