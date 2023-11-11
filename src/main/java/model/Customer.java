package model;

public class Customer {
    private int cid;
    private String name;
    private long invested;
    private int property;
    private String phone;

    public Customer() {
        
    }

    public Customer(int cid, String name, long invested, int property, String phone) {
        this.cid = cid;
        this.name = name;
        this.invested = invested;
        this.property = property;
        this.phone = phone;
    }

    

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getInvested() {
        return invested;
    }

    public void setInvested(long invested) {
        this.invested = invested;
    }

    public int getProperty() {
        return property;
    }

    public void setProperty(int property) {
        this.property = property;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", name=" + name + ", invested=" + invested + ", property=" + property + ", phone=" + phone + '}';
    }

   
}
