package android.itis.mylistview;

import java.util.Date;

/**
 * Created by Амир on 18.10.2015.
 */
public class Information {
    private String date;
    private String headline;
    private String info;
    Information(String date, String info,String headline){
        this.date=date;
        this.info=info;
        this.headline=headline;
    }
    public String getDate(){
        return date;
    }
    public String getInfo(){
        return info;
    }
    public String getHeadline(){
        return headline;
    }
    public void setInfo(String info){
      this.info=info;
    }
    public void setDate(String date){
        this.date=date;
    }
    public void setHeadline(String headline){
        this.headline=headline;
    }

}
