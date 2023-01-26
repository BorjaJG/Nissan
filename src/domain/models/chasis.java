package domain.models;

public class chasis  implements Stock{



    private String bastidor;
    private String marca;
    private String modelo;




    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getId() {
        return null;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
