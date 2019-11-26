package com.hzf.mq.enums;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public enum Fuel {
    //采油
    DIESEL(1,"C"),
   //汽油
    GASOLINE(2,"Q"),
   //新能源
    ENERGY(3,"新能源");
    private int id;

    private String description;


    Fuel(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public  static  Fuel getDescription(String description){

        Fuel[] fuels = Fuel.values();

        for (Fuel f:fuels){

            if(f.description.equals(description)){
                return f;
            }
        }
       return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }}
