/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Maryam lahib
 */
public class TaxeSejour {

    private Long id;
    private int annee;
    private int trimestre;
    private int nombreNuite;
    private Double montantBase;
    private int nombreMoisRetard;
    private Double montantRetard;
    private Double montant;
    private Locale locale;
    private Double prixNuitte;

    private Redevable redevable;
    private TauxSejour tauxSejour;

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public TauxSejour getTauxSejour() {
        return tauxSejour;
    }

    public void setTauxSejour(TauxSejour tauxSejour) {
        this.tauxSejour = tauxSejour;
    }

    
    public TaxeSejour() {
    }

    public TaxeSejour(Long id, int annee, int trimestre, int nombreNuite, Double montantBase, int nombreMoisRetard, Double montantRetard, Double montant, Locale locale, Double prixNuitte) {
        this.id = id;
        this.annee = annee;
        this.trimestre = trimestre;
        this.nombreNuite = nombreNuite;
        this.montantBase = montantBase;
        this.nombreMoisRetard = nombreMoisRetard;
        this.montantRetard = montantRetard;
        this.montant = montant;
        this.locale = locale;
        this.prixNuitte = prixNuitte;
    }

    @Override
    public String toString() {
        return "Sejour{" + "id=" + id + ", annee=" + annee + ", trimestre=" + trimestre + ", nombreNuite=" + nombreNuite + ", montantBase=" + montantBase + ", nombreMoisRetard=" + nombreMoisRetard + ", montantRetard=" + montantRetard + ", montant=" + montant + ", locale=" + locale + ", prixNuitte=" + prixNuitte + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    public int getNombreNuite() {
        return nombreNuite;
    }

    public void setNombreNuite(int nombreNuite) {
        this.nombreNuite = nombreNuite;
    }

    public Double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(Double montantBase) {
        this.montantBase = montantBase;
    }

    public int getNombreMoisRetard() {
        return nombreMoisRetard;
    }

    public void setNombreMoisRetard(int nombreMoisRetard) {
        this.nombreMoisRetard = nombreMoisRetard;
    }

    public Double getMontantRetard() {
        return montantRetard;
    }

    public void setMontantRetard(Double montantRetard) {
        this.montantRetard = montantRetard;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Double getPrixNuitte() {
        return prixNuitte;
    }

    public void setPrixNuitte(Double prixNuitte) {
        this.prixNuitte = prixNuitte;
    }

}
