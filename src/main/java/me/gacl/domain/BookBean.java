package me.gacl.domain;

/**
 * Created by hua on 2018/5/25.
 */
public class BookBean {
    private int bid;
    private String bname;
    private String bdesc;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBdesc() {
        return bdesc;
    }

    public void setBdesc(String bdesc) {
        this.bdesc = bdesc;
    }

    //    BookBean(int bid, String bname,String bdesc){
//        this.bid=bid;
//        this.bname=bname;
//        this.bdesc=bdesc;
//    }
//    BookBean(){
//        this.bid=bid;
//        this.bname=bname;
//        this.bdesc=bdesc;
//    }
//    @Override
    public String toString() {
        return "BookBean [Bid=" + this.bid + ", Bname=" + this.bname + ", Bdesc=" + this.bdesc
                + "]";
    }
}