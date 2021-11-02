



public class AFN {
    
    String afabeto;                             //alfacbeto de entrada
    String transicion;                          //funcion de transicion que permite la transicion Epsilon
    int q0;                                     //estado inicial del automata
    int[ ] estados = new int[40];               //conjunto finito de estados el automata
    int[ ] estadosFin = new int[4];             //conjunto de estados finales
    


    public AFN(String afabeto, String transicion) {
        this.afabeto = afabeto;
        this.transicion = transicion;
    }

    public String getAfabeto() {
        return afabeto;
    }

    public void setAfabeto(String afabeto) {
        this.afabeto = afabeto;
    }

    public String getTransicion() {
        return transicion;
    }

    public void setTransicion(String transicion) {
        this.transicion = transicion;
    }

    public int getQ0() {
        return q0;
    }

    public void setQ0(int q0) {
        this.q0 = q0;
    }

    public int[] getEstados() {
        return estados;
    }

    public void setEstados(int[] estados) {
        this.estados = estados;
    }

    public int[] getEstadosFin() {
        return estadosFin;
    }

    public void setEstadosFin(int[] estadosFin) {
        this.estadosFin = estadosFin;
    }
    
    
    
}
