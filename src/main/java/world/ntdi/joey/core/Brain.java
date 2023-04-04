package world.ntdi.joey.core;

public class Brain implements Mouth, Eyes {
    private boolean saidWhen = false;

    @Override
    public void speak(String words) {
        System.out.println("\nJoey > " + words);
    }

    @Override
    public void readText(String text) {
        if (saidWhen) {
            speak("Did I ask?");
            saidWhen = false;
            return;
        }

        speak("When?");
        saidWhen = true;
    }

    public void createEyes() {
        System.out.println("\n" +
                "██╗░░░██╗██╗██████╗░██████╗░\n" +
                "██║░░░██║██║██╔══██╗██╔══██╗\n" +
                "╚██╗░██╔╝██║██████╔╝██████╦╝\n" +
                "░╚████╔╝░██║██╔══██╗██╔══██╗\n" +
                "░░╚██╔╝░░██║██║░░██║██████╦╝\n" +
                "░░░╚═╝░░░╚═╝╚═╝░░╚═╝╚═════╝░");

        System.out.println("\nWelcome to the Virb chat bot, please keep in mind that repsonses may be.. ..retarded\n");
    }

}
