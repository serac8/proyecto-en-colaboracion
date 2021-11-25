public class Bici {

    private int kilometros;
    private String marca;
    private Ruedas ruedas;
    private boolean deMonta�a;
   
   
    public Bici(int kilometrosRecorridos, String marcaBici, Ruedas ruedasBici) {
       kilometros = kilometrosRecorridos;
       marca = marcaBici;
       ruedas = ruedasBici;
       deMonta�a = true;
    }
   
   
   
    public int getkilometros() {
        return kilometros;
    }
   
    public String getmarca() {
        return marca;
    }
   
    public Ruedas getruedas() {
        return ruedas;
    }
   
    public void setkilometrosRecorridos(int kilometrosRecorridos) {
        kilometros = kilometrosRecorridos;
    }
   
    public void setnuevaMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }
   
    public void setnuevasRuedas(Ruedas nuevasRuedas) {
        ruedas = nuevasRuedas;
    }
   
    public void imprimirDetalles(){
        System.out.println("Kilometros recorridos: "+kilometros+ " - Marca: "+ marca + " - Ruedas marca: "+ ruedas.getMarcaBici()+ " - Ruedas gastadas: "+ ruedas.getRuedasGastadas() + ". Bici de monta�a: " + deMonta�a);
    }
   
    public void setDeMonta�a(boolean biciDeMonta�a){
        deMonta�a = biciDeMonta�a;
    }
}