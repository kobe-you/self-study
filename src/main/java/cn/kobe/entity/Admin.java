package cn.kobe.entity;

/**
 * @author: kobe byrant
 * @Date: 2020/1/19 11:43
 * @Version
 */
public class Admin {
    private String admin_account;
    private String admin_name;
    private String admin_password;
    private int admin_power;

    public String getAdmin_account() {
        return admin_account;
    }

    public void setAdmin_account(String admin_account) {
        this.admin_account = admin_account;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public int getAdmin_power() {
        return admin_power;
    }

    public void setAdmin_power(int admin_power) {
        this.admin_power = admin_power;
    }
}
