package model;

public class RealEstate {
    private int rid;
    private long price;
    private double area;
    private String status;
    private String owner;
    private double promotion;
    private int bid;

    public RealEstate() {
        
    }

    public RealEstate(int rid, long price, double area, String status, String owner, double promotion, int bid) {
        this.rid = rid;
        this.price = price;
        this.area = area;
        this.status = status;
        this.owner = owner;
        this.promotion = promotion;
        this.bid = bid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPromotion() {
        return promotion;
    }

    public void setPromotion(double promotion) {
        this.promotion = promotion;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "RealEstate{" + "rid=" + rid + ", price=" + price + ", area=" + area + ", status=" + status + ", owner=" + owner + ", promotion=" + promotion + ", bid=" + bid + '}';
    }
    
    
}
