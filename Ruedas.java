public class Ruedas {

    private String marca;
    private boolean gastadas;
    
    public  Ruedas(String marcaBici, boolean ruedasGastadas) {
        marca = marcaBici;
        gastadas = ruedasGastadas; 
       
    }
    
    public String getMarcaBici(){
        return marca;
    }
    
    public boolean getRuedasGastadas(){
        return gastadas;
    }
    
    public void setMarcaNueva(String marcaNueva){
        marca = marcaNueva;
    }
    
    public void setRuedasGastadas(boolean ruedasNuevas){
        gastadas = ruedasNuevas;
    }

    public void imprimeDetalles() {
        System.out.println("Marca: " + marca + "  |  " + "Gastadas: " + gastadas);
    
    }



}