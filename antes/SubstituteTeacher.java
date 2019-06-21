package antes;

import java.lang.RuntimeException;

public class SubstituteTeacher extends Teacher {

    public void teach(){
        System.out.println("Teachs something");
    }

    @Override
    public void performOtherResponsibilities(){
        throw new RuntimeException("Substitute Teacher cannot perform other responsibilities");
    }

}