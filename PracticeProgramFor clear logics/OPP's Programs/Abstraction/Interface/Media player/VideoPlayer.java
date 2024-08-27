class VideoPlayer implements AdavancedMediaPlayer{
    @Override
    public void play(String songTitle){
        if(songTitle == null || songTitle.isEmpty()){
            System.err.println("video song Title is not be empty string");
        }
        else{
            System.out.println("Playing Video: " + songTitle);
        }
    }
    @Override
    public void stop(String songTitle){
        if(songTitle == null || songTitle.isEmpty()){
            System.err.println("Title is not be empty string");
        }
        else{
            System.out.println("Stop Video: " + songTitle);
        }
    }
    @Override
    public void pause(String songTitle){
        if(songTitle == null || songTitle.isEmpty()){
            System.err.println("Title is not be empty string");
        }
        else{
            System.out.println("Pause Video: " + songTitle);
        }
    }
}
