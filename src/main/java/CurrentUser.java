public class CurrentUser {
    private String username;
    private String password;

    protected boolean isAuthorized() {
            return (username.equals("admin") && password.equals("password"));
        }

    protected CurrentUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
