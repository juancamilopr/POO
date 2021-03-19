package tourDeFrancia;
import java.util.ArrayList;


public class Tour {
        private String verEquiposDelTour;
        private String resultadoDeEtapa;
        public ArrayList<Corredor> corredoresDeUnEquipos;
        public ArrayList<Tabla> tablaDePosiciones;

        public Tour(String nombreDelTour, double distanciaDelTour) {
            this.verEquiposDelTour = verEquiposDelTour;
            this.resultadoDeEtapa = resultadoDeEtapa;
            this.corredoresDeUnEquipos = new ArrayList<Corredor>();
            this.tablaDePosiciones = new ArrayList<Tabla>();

        }

        public String verEquiposDelTour() {
            return verEquiposDelTour;
        }

        public String resultadoDeEtapa() {
            return resultadoDeEtapa;
        }

        public ArrayList<Equipo> getcorredoresDeUnEquipos() {
            return corredoresDeUnEquipos;
        }

        public ArrayList<Tabla> gettablaDePosiciones() {
            return tablaDePosiciones;
        }
}
