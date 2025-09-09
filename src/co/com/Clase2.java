package co.com;

public class Clase2 {

    private String saludo;

    private String despedida;


    public void imprimirSaludo(){
        System.out.println(saludo);
    }

    public void imprimirDespedida(){
        System.out.println(despedida);
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public void setDespedida(String despedida) {
        this.despedida = despedida;
    }
}
