class MusicPlayer implements AdavancedMediaPlayer{
    @Override
    public void play(String songTitle){
        if(songTitle == null || songTitle.isEmpty()){
            System.err.println("Song Title is not be empty string");
        }
        else{
            System.out.println("Playing song: " + songTitle);
        }
    }
    @Override
    public void stop(String songTitle){
        if(songTitle == null || songTitle.isEmpty()){
            System.err.println("Title is not be empty string");
        }
        else{
            System.out.println("Stop song: " + songTitle);
        }
    }
    @Override
    public void pause(String songTitle){
        if(songTitle == null || songTitle.isEmpty()){
            System.err.println("Title is not be empty string");
        }
        else{
            System.out.println("Pause song: " + songTitle);
        }
    }
}
