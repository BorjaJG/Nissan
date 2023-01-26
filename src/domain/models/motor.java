package domain.models;

public class motor implements Stock {


    private String id;
    private String marca;
    private String cilindrada;


    public String getId() {
        return id;
    }

    @Override
    public String getModelo() {
        return null;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }



}
