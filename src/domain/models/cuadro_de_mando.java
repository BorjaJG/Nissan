package domain.models;

public class cuadro_de_mando  implements Stock{

    private String id;
    private String modelo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
