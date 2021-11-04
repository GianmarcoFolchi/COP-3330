package project2;

abstract class Person {
    protected String name;
    protected String id;

    protected Person() {
        this.id = "";
        this.name = "";
    }

    protected Person(String name, String id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id=" + id + ", ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void print();
}
