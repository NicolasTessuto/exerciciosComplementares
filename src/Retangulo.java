public class Retangulo {
/*
3. Classe Retângulo: Crie uma classe que modele um retângulo:
a.Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
b.Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular
Perímetro;
c.Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as
medidas de um local. Depois, deve criar um objeto com as medidas e calcular a quantidade
de pisos e de rodapés necessárias para o local.
*/
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public void mudarValorDosLado(Retangulo retangulo, double auxVlLados){
        setAltura(auxVlLados);
    }
    public double rentornaVlLados(Retangulo retangulo){
        return getAltura();
    }

    public void calculaAreaEPerimetro(Retangulo retangulo){
        System.out.println("A [area] do seu retangulo é: " + getBase() * getAltura());
        System.out.println("O [perimetro] do seu retangulo é: " + 2* (getBase() + getAltura()));
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
