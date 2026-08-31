public class Estudiante {
     
    // Atributos de instancia (privados - encapsulamiento)
    private String nombre;
    private int codigo;
    private double nota;
 
    // Variable STATIC: compartida por todos los objetos
    private static int totalEstudiantes = 0;
 
    // Constructor
    public Estudiante(String nombre, int codigo, double nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota   = nota;
        totalEstudiantes++;   // se incrementa en cada objeto creado
    }
 
    // Getters
    public String getNombre() { return nombre; }
    public double getNota()   { return nota; }
 
    // Método static
    public static int getTotalEstudiantes() { return totalEstudiantes; }
 
    // Muestra información del estudiante
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Nota: " + nota);
    }

}
