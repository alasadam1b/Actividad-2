package ende;

/**
 *
 */
class Jugador{

    int exitos;      // número de partidas ganadas
    int winTotal;
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar ()
    {
        String opcion="";
        Integer c = (int)(Math.random()*3);
        switch (c) {
            case 0 -> opcion = ("piedra");
            case 1 -> opcion = ("papel");
            case 2 -> opcion = ("tijeras");
        }
        return opcion;
    }
    public void setExitos ()
    {
        exitos++;
    }
    public int getExitos ()
    {
        return(exitos);
    }
}