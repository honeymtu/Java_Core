package participant;

import Lesson_1_Java_Core.Team;

public class EgorParticipant extends Team {

    public EgorParticipant(String name, String participant, int speed){
        setName(name);
        setParticipant(participant);
        setSpeed(speed);
    }



    public void showResults(){
        System.out.println("Passed the distance");
    }

    public void getTeamInfo(){}

}
