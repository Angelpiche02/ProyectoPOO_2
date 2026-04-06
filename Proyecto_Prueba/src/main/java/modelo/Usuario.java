package modelo;
import services.GestorTarea;
import services.GestorRecordatorio;

public abstract class Usuario

    {
        private int id;
        private String nombre;
        private String correo;
        private String contrasena;
        private boolean membresia;

        protected GestorTarea gestorTarea;
        protected GestorRecordatorio gestorRecordatorio;

        public Usuario(int id, String nombre, String correo, String contrasena, boolean membresia) {
            this.id = id;
            this.nombre = nombre;
            this.correo = correo;
            this.contrasena = contrasena;
            this.membresia = membresia;
            this.gestorTarea = new GestorTarea();
            this.gestorRecordatorio = new GestorRecordatorio();
        }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getCorreo() { return correo; }
        public void setCorreo(String correo) { this.correo = correo; }

        public String getContrasena() { return contrasena; }
        public void setContrasena(String contrasena) { this.contrasena = contrasena; }

        public boolean isMembresia() { return membresia; }
        public void setMembresia(boolean membresia) { this.membresia = membresia; }


        public abstract void crearTarea(Tarea t);
        public void crearRecordatorio(Recordatorio r)
        {
            gestorRecordatorio.agregarRecordatorio(r);
        };

        public void verTareas()
        {
            gestorTarea.mostrarTareas();
        }

        public void verRecordatorios()
        {
            gestorRecordatorio.mostrarRecordatorios();
        }


    }
