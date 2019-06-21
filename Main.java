import depois.Teacher;
import depois.SubstituteTeacher;

public class Main {
    public static void main(String[] args) {
 
        Teacher teacher = new SubstituteTeacher();

        //nem tem como compilar a execução do método abaixo
        //já que professor substituo nem professor tem o método
        //teacher.performOtherResponsibilities();

    }
    
}