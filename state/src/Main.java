public class Main {
    public static void main(String[] args) {

        Rezervare rezervare = new Rezervare(32);
        StareNeplatita stareNeplatita = new StareNeplatita(); // I recommend to use the class Stare here
        stareNeplatita.doAction(rezervare); // I recommend to set the state on rezervare: rezervare.SetStare and then rezervare.getStare().doAction 
                                            // or stare.doAction, but Stare should be the abstract class.
        StarePlatita starePlatita = new StarePlatita();
        starePlatita.doAction(rezervare);

    }
}
