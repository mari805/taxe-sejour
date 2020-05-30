/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TauxSejour;
import bean.TaxeSejour;
import java.util.ArrayList;

/**
 *
 * @author Maryam lahib
 */
public class TaxeSejourService {

    TauxSejourService tauxSejourService= new TauxSejourService();
    public int save(TaxeSejour taxeSejour,ArrayList<TaxeSejour> taxeSejours,ArrayList<TauxSejour> tauxSejours){
        TaxeSejour myTaxeSejour=findByLocaleLibelleAndTrimAndAnnee(taxeSejour.getLocale().getLibelle(),taxeSejour.getTrimestre(),taxeSejour.getAnnee(),taxeSejours);
        if(myTaxeSejour!=null){
            return -1;
        }
        TauxSejour tauxSejour= tauxSejourService.findByCategorieLocaleLibelle(taxeSejour.getLocale().getCategorieLocale().getLibelle(), tauxSejours);
        if(tauxSejour==null){
            return -2;
        }else{
            Double montant = tauxSejour.getPrixNuite()*taxeSejour.getNombreNuite();
            taxeSejour.setMontantBase(montant);
            taxeSejours.add(taxeSejour);
            return 1;
        }
    }

    private TaxeSejour findByLocaleLibelleAndTrimAndAnnee(String libelle, int trimestre, int annee, ArrayList<TaxeSejour> taxeSejours) {
        
        return null;
    }  
}
