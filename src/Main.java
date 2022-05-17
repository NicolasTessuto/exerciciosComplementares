import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        String auxCorBola;

        Bola bola = new Bola("Preta", 2.5, "Plastico");
        bola.mostrarCor(bola);
        bola.trocarCor(bola, sc.nextLine());
        bola.mostrarCor(bola);

        Quadrado quadrado = new Quadrado(2.4);
        System.out.println(quadrado.retornarVlLAdoECalculaArea(quadrado));
        quadrado.mudarValorLado(quadrado, 5.0);
        System.out.println(quadrado.retornarVlLAdoECalculaArea(quadrado));
        */

        Retangulo retangulo = new Retangulo(2.5,3);
        retangulo.calculaAreaEPerimetro(retangulo);
        System.out.print("VALOR DOS LADOS DO SEU RETANGULO É: ");
        System.out.println(retangulo.rentornaVlLados(retangulo));






    }
}
