package com.mama100.lotteryweb.po;

public class BwBaseinfoWithBLOBs extends BwBaseinfo {
    private String receiveTerminal;

    private String triggerTerminal;

    private String phones;

    public String getReceiveTerminal() {
        return receiveTerminal;
    }

    public void setReceiveTerminal(String receiveTerminal) {
        this.receiveTerminal = receiveTerminal == null ? null : receiveTerminal.trim();
    }

    public String getTriggerTerminal() {
        return triggerTerminal;
    }

    public void setTriggerTerminal(String triggerTerminal) {
        this.triggerTerminal = triggerTerminal == null ? null : triggerTerminal.trim();
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones == null ? null : phones.trim();
    }
}