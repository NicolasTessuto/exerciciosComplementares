public class Bola {
    /*1.Classe Bola: Crie uma classe que modele uma bola:
    a.Atributos: Cor, circunferência, material
    b.Métodos: trocaCor e mostraCor*/

    private String cor;
    private double circunferencia;
    private String material;

    public void mostrarCor(Bola bola){
        System.out.println("A cor da bola é: " + getCor());
    }

    public void trocarCor(Bola bola, String corDesejada){
        setCor(corDesejada);
    }

    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


}
