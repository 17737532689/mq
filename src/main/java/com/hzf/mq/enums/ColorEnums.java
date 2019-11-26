package com.hzf.mq.enums;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public enum ColorEnums {
    BLUE(1,"blue"),
    YELLOW(2,"yellow"),
    WHITE(3,"white"),
    BLACK(4,"black"),
    GREE(5,"green");
    private  int id;

    private String  description;

    ColorEnums(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public static   ColorEnums getDescription(String description){
        ColorEnums[] values = ColorEnums.values();

        for(ColorEnums c:values){
            if(c.getDescription().equals(description)){
                return c;
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
