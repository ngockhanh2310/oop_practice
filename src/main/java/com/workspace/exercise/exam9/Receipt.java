package com.workspace.exercise.exam9;

public class Receipt extends Client {
    private int oldCode;
    private int newCode;
    private int cost;

    public Receipt(String name, String address, String code, int oldCode, int newCode, int cost) {
        super(name, address, code);
        this.oldCode = oldCode;
        this.newCode = newCode;
        this.cost = cost;
    }

    public int getOldCode() {
        return oldCode;
    }

    public void setOldCode(int oldCode) {
        this.oldCode = oldCode;
    }

    public int getNewCode() {
        return newCode;
    }

    public void setNewCode(int newCode) {
        this.newCode = newCode;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\r\nReceipt\r\n{\r\n\t\b" +
                "\"oldCode\"=" + oldCode +
                ",\r\n\t\b\"newCode\"=" + newCode +
                ",\r\n\t\b\"cost\"=" + cost +
                ",\r\n\t\b\"name\"='" + getName() + '\'' +
                ",\r\n\t\b\"address\"='" + getAddress() + '\'' +
                ",\r\n\t\b\"code\"='" + getCode() + '\'' +
                "\r\n" + '}';
    }
}
