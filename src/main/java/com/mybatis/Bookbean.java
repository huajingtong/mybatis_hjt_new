package com.mybatis;

import java.io.Serializable;

/**
 * Created by hua on 2018/5/25.
 */

    public class Bookbean implements Serializable {
        private int bid;
        private String bname;
        private String bdesc;

    public Bookbean() {
        super();
    }

    public Bookbean(int bid) {
        super();
        this.bid = bid;
    }

    public Bookbean(int bid, String bname) {
        super();
        this.bid = bid;
        this.bname = bname;
    }
    public Bookbean(int bid, String bname,String bdesc) {
        super();
        this.bid = bid;
        this.bname = bname;
        this.bdesc = bdesc;
    }

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
            return "BookBean [id=" + this.bid + ", Bname=" + this.bname + ", tBdesc=" + this.bdesc
                    +  "]";
        }

    }

