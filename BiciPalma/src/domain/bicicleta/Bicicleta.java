package domain.bicicleta;

public class Bicicleta implements Movil {

    private final int id;

    public Bicicleta(int id){
        this.id = id; //como el self.name = name

    }
    
    @Override
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return Integer.toString(getId());
    }
}
