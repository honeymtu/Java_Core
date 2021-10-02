package Lesson_1_Java_Core;

public class Team {

    private String name; // название команды
    private String participant ; // участники
    private int speed;



    public void showResults(){}

    public void getTeamInfo(){}

    public void allDistance(){
        System.out.println("run");
    }

    public String getParticipant(){
        return participant;
    }

    public void setParticipant(String participant){
        this.participant = participant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
