// Functional Interface
interface LightAction {
    void activate();
}

public class SmartHomeLighting {

    public static void main(String[] args) {

        // Motion detected → turn on hallway lights
        LightAction motionTrigger = () -> 
            System.out.println("Motion detected: Hallway lights ON");

        // Night time → dim lights
        LightAction nightTrigger = () -> 
            System.out.println("Night time: Lights set to DIM mode");
        // Voice command → turn off all lights
        LightAction voiceTrigger = () -> 
            System.out.println("Voice command: All lights OFF");

        // Executing triggers
        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}