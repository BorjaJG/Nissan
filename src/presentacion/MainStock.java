package presentacion;

public class MainStock {

        private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

        public void execute(Inspeccion model) {
            dataStore.guardar(model);
        }
}
