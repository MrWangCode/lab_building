package com.zb.entity;

import java.io.Serializable;

/**
 *
 *
 *  Created by xuxueli on '2019-08-29 11:48:30'.
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = 42L;

    /**
     *
     */
    private int aid;

    /**
     *
     */
    private String aname;

    /**
     *
     */
    private String apwd;

    /**
     *
     */
    private int powers;

    /**
     *
     */
    private int state;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public int getPowers() {
        return powers;
    }

    public void setPowers(int powers) {
        this.powers = powers;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}