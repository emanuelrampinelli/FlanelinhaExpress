
package modelo.componentes;


public class Vaga {
    private int id;
    private int numero;
    
    public final int TAM_LATI_LONGI = 15;
    
    


    public Vaga(int id, String status, int andar, int numero) {
        this.id = id;
        this.numero = numero;
    }

    public Vaga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/*
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        if (andar >= 0)
            this.andar = andar;
        else
            throw new IllegalArgumentException("Andar inválido!");
    }
*/
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
/*
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        if (latitude.length() == TAM_LATI_LONGI)
            this.latitude = latitude;
        else
            throw new IllegalArgumentException("Latitude inválida!");
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        if (longitude.length() == TAM_LATI_LONGI)
            this.longitude = longitude;
        else
            throw new IllegalArgumentException("Longitude inválida!");
    }
    */

}
