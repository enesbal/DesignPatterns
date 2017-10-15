package AdapterPattern;

/**
 * Created by enes on 10/15/2017.
 */
public class VlcPlayer implements AdvancedMediaPlayer  {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
