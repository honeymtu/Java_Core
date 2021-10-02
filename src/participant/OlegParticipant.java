package participant;

import Lesson_1_Java_Core.Team;

public class OlegParticipant extends Team {

    public OlegParticipant(String name, String participant, int speed){
        setName(name);
        setParticipant(participant);
        setSpeed(speed);
    }



    public void showResults(){
        System.out.println("Don't passed the distance");
    }

    public void getTeamInfo(){}

}
