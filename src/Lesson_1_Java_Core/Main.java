package Lesson_1_Java_Core;

import participant.EgorParticipant;
import participant.IvanParticipant;
import participant.OlegParticipant;

public class Main {

    public static void main(String[] args) {

       IvanParticipant participant1 = new IvanParticipant("Vict ory", "Ivan", 20);
       EgorParticipant participant2 = new EgorParticipant("Victory", "Egor", 25);
       OlegParticipant participant3 = new OlegParticipant("Victory", "Oleg", 30);

       participant1.setParticipant("Ivan");
       participant2.setParticipant("Egor");
       participant3.setParticipant("Oleg");


       System.out.println(participant1.getParticipant());
       System.out.println(participant2.getParticipant());
       System.out.println(participant3.getParticipant());

       participant1.showResults();
       participant2.showResults();
       participant3.showResults();


    }

}
