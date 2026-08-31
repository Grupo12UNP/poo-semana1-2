public class Main {
        public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana García", 1001, 16.5);
        Estudiante e2 = new Estudiante("Luis Torres", 1002, 14.0);
        Estudiante e3 = new Estudiante("Rosa Díaz",  1003, 18.0);
 
        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
 
        System.out.println("Total estudiantes: " + Estudiante.getTotalEstudiantes());
    }

}
