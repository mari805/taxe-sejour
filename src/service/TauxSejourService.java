/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TauxSejour;
import java.util.ArrayList;

/**
 *
 * @author Maryam lahib
 */
public class TauxSejourService {
    public TauxSejour findByCategorieLocaleLibelle(String liblleCategorieLocale,ArrayList<TauxSejour> tauxSejours){
        for (TauxSejour tauxSejour : tauxSejours) {
            if(tauxSejour.getCategorieLocale().getLibelle().equals(liblleCategorieLocale)){
                return tauxSejour;
            }
        }
        return null;
    }
}
