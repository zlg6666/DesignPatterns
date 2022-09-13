package adapter.outwardPattern;

/**
 * @author: zlg
 * @date: 2022/9/13
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        Screeen screeen = new Screeen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screeen, popper);
        homeTheaterFacade.watchMovie("Raider of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}
