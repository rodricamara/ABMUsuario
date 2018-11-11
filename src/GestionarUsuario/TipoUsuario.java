package GestionarUsuario;

class TipoUsuario {

    public enum TUsuario {
        Admin(1), Comun(2);

        private int tUsuario;

        private TUsuario(int tUsuario) {
            this.tUsuario = tUsuario;
        }
        public int getTUsuario() {
            return tUsuario;
        }
    }
}
