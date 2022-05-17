public class Quadrado {
/*    2.Classe Quadrado: Crie uma classe que modele um quadrado:
    a.Atributos: Tamanho do lado
    b.Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área; */

    private double tamanhoDoLado;


    public Quadrado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }



    public void mudarValorLado(Quadrado quadrado, Double tamanhoAux){
        setTamanhoDoLado(tamanhoAux);
    }
    public double retornarVlLAdoECalculaArea(Quadrado quadrado){
        System.out.println("A area do seu quadrado é: " + quadrado.tamanhoDoLado * quadrado.tamanhoDoLado);
        System.out.println("O tamanho do seu lado é: ");
        return tamanhoDoLado;
    }


    public double getTamanhoDoLado() {
        return tamanhoDoLado;
    }

    public void setTamanhoDoLado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }
}
