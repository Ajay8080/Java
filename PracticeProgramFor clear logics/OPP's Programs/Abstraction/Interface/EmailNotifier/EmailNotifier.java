class EmailNotifier implements Notifier{
    public void notifyUsers(User... users) {
        for (User user : users) {
            sendEmail(user);
        }
    }

    private void sendEmail(User user) {
        System.out.println("Sending email to " + user.getName() + " at " + user.getEmail());
    }
}
