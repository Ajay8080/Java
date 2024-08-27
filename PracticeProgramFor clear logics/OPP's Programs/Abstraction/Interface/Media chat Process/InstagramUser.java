class InstagramUser extends User{
    InstagramUser(String name){
        super(name);
    }
    public void sendDirectMassage(String sendMassage){
        System.out.println("Name: "+getName());
        System.out.println("Send Massage: "+sendMassage);
    }
}
