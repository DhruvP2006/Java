package musicPlayer;

public class MP3Player implements musicPlayer{
  @Override
  public void play(String songName){
    System.out.println("Playing song: " + songName);
  }

  @Override
  public void pause(){
    System.out.println("Song Paused");
  }

  @Override
  public void stop(){
    System.out.println("Song Stopped");
  }
}
