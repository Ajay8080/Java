class Soccer extends Sport{
    @Override
    public String getName(){
        return "Soccer";
    }
    @Override
    public String getNumberOfTeamMembers(){
        return "In "+getName()+" ,each team has 11 players";
    }
}
