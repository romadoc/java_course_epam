package module4.task4;

public class Start {
    public static void main(String[] args) {
        Shedule shedule = new Shedule();
        shedule.simpleOut();
        shedule.upSort();
        shedule.destSort();
        InputRequest inputRequest = new InputRequest();
        shedule.findTrain(inputRequest.insNumTrain());
    }
}
