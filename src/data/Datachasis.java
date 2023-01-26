package data;



import java.util.Map;
import java.util.TreeMap;

public class Datachasis {
    private static Datachasis instance = null;

    private Map<String, Chasis> dataStore = new TreeMap<>();

    public void guardar(Chasis model) {
        dataStore.put(model.getId(), model);
    }

    public void eliminar(String id) {
        dataStore.remove(id);
    }

    public Chasis buscar(String codigo) {
        return dataStore.get(id);
    }

    public void modificar(Chasis model) {
        dataStore.put(model.getCodigo(), model);
    }

    public static Datachasis getInstance() {
        if (instance == null) {
            instance = new Datachasis();
        }
        return instance;
    }
}
