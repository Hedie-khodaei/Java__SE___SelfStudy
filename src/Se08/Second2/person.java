package src.Se08.Second2;

@Timeit
public abstract class person {
private int id;
    private  String name;
    private WeekDay day;
@Timeit
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "man t string hastm";

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
