/*
 Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto
retângulo em conformidade com o paradigma orientado a objeto. Posteriormente implemente
esta classe. A classe deverá ter as seguintes características: comprimento, largura e cálculo
do perímetro e da área do retângulo. Obs.: os valores da largura e do comprimento não
podem ser negativos. O cálculo da área (largura * comprimento) e do perímetro (soma dos
quatro lados).
 */
package classes;

public class Retangulo {

    private double largura = 0.0;
    private double comprimento = 0.0;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double calculaAreaRetang(){
        return (largura * comprimento);
    }
    public double calculaPerimetroRetang(){
        return ((largura * 2) + (comprimento * 2));
    }
    @Override
    public String toString(){
       return String.format("%s: %.2f\n%s: %.2f\n%s","Cálculo da área", calculaAreaRetang(), 
               "Cálculo do perímetro", calculaPerimetroRetang(), "Fim da Execução");
    }

}
