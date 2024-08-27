class InstagramChat implements Messanger{
    @Override
    public void sendMassage(User user){
       if(user instanceof InstagramUser){
        System.out.println("Sending Massage");
       }
       else{
        System.out.println("Massage not sending");
       }
    }
}