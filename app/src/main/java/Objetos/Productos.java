package Objetos;

public class Productos {
    private String[] material = {"Ceramica", "Porcelana", "Vidrio"};
    private int[] precio  ={4500, 12500, 25000};
    private int valora [] = {2,3,5};
    private int adicional [] ={150,350,500};

    public Productos(){

    }

    public Productos(String[] material, int[] precio, int[] valora, int[] adicional) {
        this.material = material;
        this.precio = precio;
        this.valora = valora;
        this.adicional = adicional;
    }

    public String[] getMaterial() {
        return material;
    }

    public void setMaterial(String[] material) {
        this.material = material;
    }

    public int[] getPrecio() {
        return precio;
    }

    public void setPrecio(int[] precio) {
        this.precio = precio;
    }

    public int[] getValora() {
        return valora;
    }

    public void setValora(int[] valora) {
        this.valora = valora;
    }

    public int[] getAdicional() {
        return adicional;
    }

    public void setAdicional(int[] adicional) {
        this.adicional = adicional;
    }

    public int precio12(int i){
        return 12*precio[i];
    }

    public  int precio24 (int i){
        return 24*precio[i];
    }

    public int resMaterial(int valor, int i){
        return valor - precio[i] - adicional[i];
    }
}
