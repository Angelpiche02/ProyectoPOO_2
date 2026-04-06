package modelo;
import services.GestorTarea;
import services.GestorRecordatorio;

public abstract class Usuario

    {
        private int id;
        private String nombre;
        private String correo;
        private String contrasena;

        public GestorTarea gestorTarea;
        public GestorRecordatorio gestorRecordatorio;

        public Usuario(int id, String nombre, String correo, String contrasena)
        {
            this.id = id;
            this.nombre = nombre;
            this.correo = correo;
            this.contrasena = contrasena;
            this.gestorTarea = new GestorTarea();
            this.gestorRecordatorio = new GestorRecordatorio();
        }

        public String getNombre(){ return nombre;}
        public void setNombre(){this.nombre = nombre;}

        public String getCorreo() { return correo; }
        public void setCorreo(String correo) { this.correo = correo; }

        public String getContrasena() { return contrasena; }
        public void setContrasena(String contrasena) { this.contrasena = contrasena; }


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
