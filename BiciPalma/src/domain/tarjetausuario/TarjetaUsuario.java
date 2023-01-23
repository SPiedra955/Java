package domain.tarjetausuario;

public class TarjetaUsuario implements Autenticacion {

    private final String id;
    private boolean activada = false;
    
    public TarjetaUsuario(String id, boolean activada){
        this.id = id;
        this.activada = activada;
    }
    

    @Override // invoke a method
    public boolean isActivada(){
        return this.activada;
    }

    public void setActivada(boolean activada){ //void no devuelve nada
        this.activada = activada;
    }

    @Override
    public String toString(){ // si no hay void usamos return
        return this.id;
    }

}


