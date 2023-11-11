package model;

import java.sql.Date;

public class Transaction {
    private int tid;
    private double amount;
    private Date date;
    private int cid;
    private int rid;

    public Transaction() {
        
    }

    public Transaction(int tid, double amount, Date date, int cid, int rid) {
        this.tid = tid;
        this.amount = amount;
        this.date = date;
        this.cid = cid;
        this.rid = rid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "Transaction{" + "tid=" + tid + ", amount=" + amount + ", date=" + date + ", cid=" + cid + ", rid=" + rid + '}';
    }
    
    
}
