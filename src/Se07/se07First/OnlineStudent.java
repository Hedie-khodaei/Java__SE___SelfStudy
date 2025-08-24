package src.Se07.se07First;

public final class OnlineStudent extends Student {
    private String username;
    private String password;
// final : شی میشه ساخت   (ارث بری نمیشه   برد
    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


