package app;

public class Aula {
    
    private String nombre = "";   
    private Integer bancos  = 0;
    private boolean completa = false;   
    
    
    public Aula(String nombre, Integer bancos, boolean completa) {
        this.nombre = nombre; 
        this.bancos = bancos; 
        this.completa = completa; 
        
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setBancos(Integer bancos) {
        this.bancos = bancos;
    }

    public Integer getBancos() {
        return bancos;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public boolean isCompleta() {
        return completa;
    }


}
