public class Prestamo {

        private String id;
        private Usuario usuarios;
        private Libro libro;
        private String dateStart;
        private String dateEnd;

        public void setId (String id){
            this.id = id;
        }

        public Libro getLibro () {
            return libro;
        }
        public void setLibro  (Libro libro) {
            this.libro = this.libro;
        }

        public Usuario getUsuarios () {
            return usuarios;
        }
        public void setUsuarios (Usuario usuarios) {
            this.usuarios = usuarios;
        }

    public String getDateStart(){
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd(){
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }


    }

