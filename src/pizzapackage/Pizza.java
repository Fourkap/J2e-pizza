package pizzapackage;

public class Pizza {

    private String nomPizza;
    private Integer nroPizza;
    private String prixPizza;

    public Pizza(String nomPizza, Integer nroPizza, String prixPizza) {
        this.nomPizza = nomPizza;
        this.nroPizza = nroPizza;
        this.prixPizza = prixPizza;
    }


    public String getNomPizza() {
        return nomPizza;
    }

    public void setNomPizza(String nomPizza) {
        this.nomPizza = nomPizza;
    }

    public Integer getNroPizza() {
        return nroPizza;
    }

    public void setNroPizza(Integer nroPizza) {
        this.nroPizza = nroPizza;
    }

    public String getPrixPizza() {
        return prixPizza;
    }

    public void setPrixPizza(String prixPizza) {
        this.prixPizza = prixPizza;
    }
}
