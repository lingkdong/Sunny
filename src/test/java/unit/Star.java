package unit;

import java.util.Date;

/**
 * Created by DT254 on 2017/4/12.
 */
public class Star {
    private Long id;
    private String name;
    private String pass;
    private Date createTime;
    private Date lastUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Star(Builder builder) {
        this.name=builder.name;
        this.pass=builder.pass;
        this.createTime=builder.createTime;
        this.lastUpdateTime=builder.lastUpdateTime;
    }

    public static  class Builder{
       private String name;
       private String pass;
       private Date createTime;
       private Date lastUpdateTime;

       public Builder() {
       }

       public Builder name(String name){
           this.name=name;
           return this;
       }

       public Builder pass(String pass){
           this.pass=pass;
           return this;
       }

       public Builder createTime(Date createTime){
           this.createTime=createTime;
           return this;
       }

       public Builder lastUpdateTime(Date lastUpdateTime){
           this.lastUpdateTime=lastUpdateTime;
           return this;
       }

        public Star build(){
            return new Star(this);
        }
   }
}
