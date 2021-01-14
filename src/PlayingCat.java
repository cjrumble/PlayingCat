/* ***************************************************************************
This is a comment about the PlayingCat class/methods.
*************************************************************************** */

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean isCatPlaying = false;
        if ((!summer) && (temperature >= 25 && temperature <= 35)) {
            isCatPlaying = true;
        } else if ((summer) && (temperature >= 25 && temperature <= 45)) {
            isCatPlaying = true;
        }
        return isCatPlaying;
    }
}
