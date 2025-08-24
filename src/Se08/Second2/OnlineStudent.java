package src.Se08.Second2;


@Timeit
public class OnlineStudent extends Student implements User {
    @Override
    public boolean login(String username, String password) {
        return false;
    }
}
