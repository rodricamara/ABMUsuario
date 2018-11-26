package usuario;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rodri
 */
public class DTOTipoUsuario {

    private String nombreDTOTipoUsuario;

    public DTOTipoUsuario(String nombreDTOTipoUsuario) {
        this.nombreDTOTipoUsuario = nombreDTOTipoUsuario;
    }

    public String getNombreDTOTipoUsuario() {
        return nombreDTOTipoUsuario;
    }

    public void setNombreDTOTipoUsuario(String nombreDTOTipoUsuario) {
        this.nombreDTOTipoUsuario = nombreDTOTipoUsuario;
    }

    public enum DTOTUsuario {
        Admin(1), Comun(2);

        private int id;
        private static final Map<Integer, DTOTUsuario> MAP = new HashMap<>();

        private DTOTUsuario(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public static DTOTUsuario fromId(int id) {
            return MAP.get(id);
        }

        static {
            for (DTOTUsuario n : values()) {
                MAP.put(n.getId(), n);
            }
        }
    }
}
