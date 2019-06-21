package antes;

public abstract class Teacher {
    private String name;

    public abstract void teach();
    
    private void makeAnnouncements(){
        System.out.println("my name is" + this.name);
    }

    private void takeAttendence(){
        System.out.println("takeAttendence");
    }

    private void collectPaperWork(){
        System.out.println("collectPaperWork");
    }

    private void conductHallwayDuties(){
        System.out.println("conductHallwayDuties");
    }

    public void performOtherResponsibilities(){
        System.out.println("performOtherResponsibilities");
    }
}