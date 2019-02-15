package com.ls;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int qty;
    private double cost;
    private int vmId;

    public Snack(String name, int qty, double cost, int vmId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.qty = qty;
        this.cost = cost;
        this.vmId = vmId;
    }

//    public String getName()
//    {
//        return name;
//    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQty()
    {
        return qty;
    }

    public void addQty(int qty)
    {
        this.qty = this.qty + qty;
    }

    public int buyQty(int qty)
    {
        this.qty = this.qty - qty;
        return this.qty;
    }

    public double getTotalCost(int qty)
    {
        return cost*qty;
    }

//    public void setCost(double cost)
//    {
//        this.cost = cost;
//    }
//
//    public int getVmId()
//    {
//        return vmId;
//    }
//
//    public void setVmId(int vmId)
//    {
//        this.vmId = vmId;
//    }
}
