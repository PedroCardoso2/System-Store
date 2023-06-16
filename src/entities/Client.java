package entities;

public class Client {
    private String name;
    private Integer holder;
    private Integer password;

    public Client(String name, Integer holder, Integer password) {
        this.name = name;
        this.holder = holder;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHolder() {
        return holder;
    }

    public void setHolder(Integer holder) {
        this.holder = holder;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }


}
