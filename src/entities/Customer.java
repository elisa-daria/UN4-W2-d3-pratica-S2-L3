package entities;

import java.util.Random;

public class Customer {

    //attributes
    private long id;
    private String name;
    private int tier;

    //constructor

    public Customer( String name) {
        this.setName(name);
        this.setTier(tier);
        this.setId(id);

    }

    //getters


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }

    //setters


    public void setId(long id) {
        Random  rdm=new Random();
        this.id = rdm.nextInt(1,1001);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(int tier) {
        Random  rdm=new Random();
        this.tier = rdm.nextInt(1,5);
    }

    //methods


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}


