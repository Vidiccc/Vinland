package model;

public class Branch {
    private int bid;
    private String manager;
    private String phone;
    private String address;

    public Branch() {
        
    }

    public Branch(int bid, String manager, String phone, String address) {
        this.bid = bid;
        this.manager = manager;
        this.phone = phone;
        this.address = address;
    }   

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Branch{" + "bid=" + bid + ", manager=" + manager + ", phone=" + phone + ", address=" + address + '}';
    }
    
    
}
