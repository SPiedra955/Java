package domain.estacion;
import domain.tarjetausuario.Autenticacion;
import domain.bicicleta.Movil;



public class Estacion {

    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId(){
        return id;
    }

    private String getDireccion(){
        return direccion;
    }
    
    @Override
    public String toString(){
        return "id: "+ getId() + "\n" + "direccion: " + getDireccion() + "\n" + "numeroAnclajes: " + numAnclajes();
    }

    private Anclaje[] anclajes(){
        return this.anclajes.anclajes();
    }


    private int numAnclajes(){
        return this.anclajes.numAnclajes();
    }
    
    public void consultarEstacion(){
        System.out.println(this);
    }

    public int anclajesLibres(){
        int anclajesLibres = 0;
        for(Anclaje anclaje : anclajes()){
            anclajesLibres = anclaje.isOcupado() ? anclajesLibres : ++anclajesLibres;

        }
        return anclajesLibres;
    }

    public void anclarBicicleta(Movil bici){
        int posicion = 0;
        int numeroAnclaje = posicion + 1 ;
        for(Anclaje anclaje : anclajes()){
            if (!anclaje.isOcupado()){
                anclajes.ocuparAnclaje(posicion, bici);
                mostrarAnclaje(bici, numeroAnclaje);
                break;
            }else{
                posicion++;
            }
            numeroAnclaje++;
        }
    }

    public boolean leerTarjetaUsuario(Autenticacion tarjetaUsuario){
        return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjetaUsuario){
        if(leerTarjetaUsuario(tarjetaUsuario)){
            boolean biciRetirada = false;

            while (!biciRetirada){
                int posicion = anclajes.seleccionarAnclaje();
                int numeroAnclaje = posicion + 1 ;

                if(anclajes.isAnclajeOcupado(posicion)){
                    mostrarBicicleta(anclajes.getBiciAt(posicion), numeroAnclaje);
                    anclajes.liberarAnclaje(posicion);
                    biciRetirada = true;
                } else;
            
            }
        } else{
            System.out.println("Tarjeta de usuario inactivo");
        }
    }

    private void mostrarBicicleta(Movil bicicleta, int numeroAnclaje){
        System.out.println("Bicicleta retirada: "+ bicicleta.getId() + " del anclajes: " + numeroAnclaje);
    }

    private void mostrarAnclaje(Movil bicicleta, int numeroAnclaje){
        System.out.println("Bicicleta " + bicicleta.getId() + " anclada en el anclaje " + numeroAnclaje);
    }

    public void consultarAnclajes(){
        int posicion = 0;
        int numeroAnclaje = 0;

        for (Anclaje anclaje : anclajes()){
            numeroAnclaje = posicion + 1;
            if (anclaje.isOcupado()){
                System.out.println("Anclaje " + numeroAnclaje + " " + anclaje.getBici().getId());

            }else{
                System.out.println("Anclaje "+ numeroAnclaje + " libre");
            }
            posicion++;
        }
    }
}
