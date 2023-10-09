package poo.ejercicioclase;

public class Vehiculo {
    private String marca;
    private int cantRuedas;
    protected boolean esDeCompetencia;
    protected boolean estaLaAlarmaEncendida;
    private String kmMaximo;
    private String kmMinimo;

    public Vehiculo(String marca, int cantRuedas, boolean esDeCompetencia, boolean estaLaAlarmaEncendida, String kmMaximo, String kmMinimo) {
        this.marca = marca;
        this.cantRuedas = cantRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.estaLaAlarmaEncendida = estaLaAlarmaEncendida;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    public Vehiculo(String marca, int cantRuedas, boolean esDeCompetencia, String kmMaximo, String kmMinimo) {
        this.marca = marca;
        this.cantRuedas = cantRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public boolean isEsDeCompetencia() {
        return esDeCompetencia;
    }

    public void setEsDeCompetencia(boolean esDeCompetencia) {
        this.esDeCompetencia = esDeCompetencia;
    }

    public boolean isEstaLaAlarmaEncendida() {
        return estaLaAlarmaEncendida;
    }

    public void setEstaLaAlarmaEncendida(boolean estaLaAlarmaEncendida) {
        this.estaLaAlarmaEncendida = estaLaAlarmaEncendida;
    }

    public String getKmMaximo() {
        return kmMaximo;
    }

    public void setKmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }

    public String getKmMinimo() {
        return kmMinimo;
    }

    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }

    public void arrancarVehiculo(){
        if (estaLaAlarmaEncendida){
            System.out.println("Ruido de alarma");
        }else {
            System.out.println("Arranca el vehiculo");
        }
    }


}
