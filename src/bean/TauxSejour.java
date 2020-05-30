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
public class TauxSejour {
    private Long id;
    private CategorieLocale categorieLocale;
    private Double prixNuite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategorieLocale getCategorieLocale() {
        return categorieLocale;
    }

    public void setCategorieLocale(CategorieLocale categorieLocale) {
        this.categorieLocale = categorieLocale;
    }

    public Double getPrixNuite() {
        return prixNuite;
    }

    public void setPrixNuite(Double prixNuite) {
        this.prixNuite = prixNuite;
    }
    
    
}
