package com.appnat3.tutoratplus.présentation.vue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.appnat3.tutoratplus.R
import com.appnat3.tutoratplus.présentation.présentateur.PrésentateurPageInformation

class page_information : Fragment() {
    //Déclaration de variables
    lateinit var navController: NavController
    lateinit var btnRetour: Button
    var présentateur = PrésentateurPageInformation(this)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vue = inflater.inflate(R.layout.fragment_page_information, container, false)

        btnRetour = vue.findViewById(R.id.btn_retour_information)
        btnRetour.setOnClickListener {
            présentateur.effectuerNavigationMenu()
        }

        return vue
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Obtient le NavController pour la navigation
        navController = Navigation.findNavController(view)
    }

    fun naviguerVersmenu_principal() {
        navController.navigate(R.id.action_page_information_to_menu_principal2)
    }
}