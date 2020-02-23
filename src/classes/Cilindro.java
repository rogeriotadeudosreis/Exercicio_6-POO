/*
 *Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto cilindro
em conformidade com o paradigma orientado a objeto. Posteriormente implemente esta
classe. A classe deverá ter as seguintes características: raio, altura e cálculo da área lateral,
área total e volume. Obs.: os valores do raio e da altura não podem ser negativos. O cálculo
da área lateral é (2*3.1415*raio*altura), área total (2*3.1415*raio*(altura+raio)) e volume
(3.1415*raio*raio*altura).
 */
package classes;

public class Cilindro {

    private double raio = 0.0;
    private double altura = 0.0;
    private double pi = 3.1415;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double calculaAreaLateral() {
        return (2 * pi * raio * altura);
    }

    public double calculaAreaTotal() {
        return (2 * pi * raio * (altura + raio));
    }

    public double calculaVolumeCilindro() {
        return (3.1415 * raio * raio * altura);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f\n%s: %.2f\n%s: %.2f", "A área lateral do cilindro é", calculaAreaLateral(),
                "A área total do cilindro é", calculaAreaTotal(), "O volume do cilidnro é", calculaVolumeCilindro());
    }

}
