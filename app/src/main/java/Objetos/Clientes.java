package Objetos;

public class Clientes {
    private String[] nombre = {"Sermieh" , "Jacinta"};
    private int[] salario = {45000,55000};

    public Clientes(){

    }

    public Clientes(String[] nombre, int[] salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }
}
