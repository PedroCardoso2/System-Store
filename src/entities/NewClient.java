package entities;

public class NewClient extends Client{
    private Integer newPassword;

    public NewClient(String name, Integer holder, Integer password, Integer newPassword) {
        super(name, holder, password);
        this.newPassword = newPassword;
    }

    public Integer getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(Integer newPassword) {
        this.newPassword = newPassword;
    }
}
