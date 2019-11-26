package com.hzf.mq.enums;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public enum Result {


    STANDARD(1,"Y"),

    OVERRUN(0,"N");

    private  int id;

    private String  description;


    Result(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public  static  Result getDescription(String description){

        Result[] values = Result.values();
        for(Result r:values){
            if(r.getDescription().equals(description)){
                return  r;
            }
        }
        return  null;
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
    }


}
