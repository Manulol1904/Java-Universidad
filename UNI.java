public class UNI{

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Pedro","Gomez",25,"Maestro","Apps moviles",4);
        Estudiante estudiante = new Estudiante ("Manuel","Lozano",19,"Estudiante","Desarrollo de software",222022103);
        
        profesor.presentarse();
        estudiante.presentarse();
        estudiante.estudiar();
    }
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;

    public Persona(String nombre, String apellido, int edad, String ocupacion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.ocupacion=ocupacion;
    }

    public String GetNombre(){
        return nombre;
    }
    public void SetNombre(String nombre){
        this.nombre=nombre;
    }
    public String GetApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public int GetEdad(){
        return edad;
    }
    public void SetEdad(int edad){
        this.edad=edad;
    }
    public String GetOcupacion(){
        return ocupacion;
    }
    public void SetOcupacion(String ocupacion){
        this.ocupacion=ocupacion;
    }

    public void presentarse(){
        System.out.println("Hola soy "+ nombre + " "+ apellido +" soy actualmente "+ ocupacion +" y tengo "+ edad +" años ");

    }

}
class Profesor extends Persona{
    private String materia;
    private int creditos;

    public Profesor(String nombre, String apellido, int edad,String ocupacion, String materia, int creditos){
        super(nombre,apellido,edad,ocupacion);
        this.materia=materia;
        this.creditos=creditos;
    }
    public String GetMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia=materia;
    }
    public int GetCreditos(){
        return creditos;
    }
    public void SetCreditos(int creditos){
        this.creditos=creditos;
    }
    @Override
    public void presentarse(){
        System.out.println("Hola jovenes soy "+ GetNombre() + " "+ GetApellido() +" tengo "+ GetEdad() +" años, soy "+ GetOcupacion() +" y dicto la materia de "+ materia +" la cual cuenta con "+ creditos +" creditos");

    }

}
interface Estudiar {
    void estudiar();
}

class Estudiante extends Persona implements Estudiar{
    private String carrera;
    private int ce;

    public Estudiante (String nombre, String apellido, int edad,String ocupacion, String carrera, int ce){
        super(nombre, apellido, edad, ocupacion);
        this.carrera=carrera;
        this.ce=ce;
    }
    public String GetCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public int GetCe(){
        return ce;
    }
    public void SetCe(int ce){
        this.ce=ce;
    }
    @Override
    public void estudiar(){
        System.out.println(GetNombre() + " "+ GetApellido() +" con codigo de estudiante "+ ce +" esta estudiando la carrera de "+ carrera +" en la uniagustiniana");
    }

}
