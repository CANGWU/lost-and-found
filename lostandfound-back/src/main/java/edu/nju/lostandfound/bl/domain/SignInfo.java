package edu.nju.lostandfound.bl.domain;

import edu.nju.lostandfound.data.enmu.SignStatus;
import edu.nju.lostandfound.data.entity.Sign;
import edu.nju.lostandfound.data.entity.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 15:22
 */

@Data
public class SignInfo {

    private long id;
    private List<String> tags;
    private String title;
    private String lostAddress;
    private Date lostDateBef;
    private Date lostDateEnd;
    private String description;
    private SignStatus signStatus;

    private long sigerId;
    private String signerName;
    private String signerEmail;
    private String signerPhone;
    private String signerPhotoUrl;

    public SignInfo(){

    }


    public SignInfo(Sign sign){
        this.id = sign.getId();

        this.tags = new ArrayList<String>();
        String[] ts = sign.getTags().split("-");
        for(String t : ts){
            this.tags.add(t);
        }
        this.title = sign.getTitle();
        this.lostAddress = sign.getLostAddress();
        this.lostDateBef = sign.getLostDateBef();
        this.lostDateEnd = sign.getLostDateEnd();
        this.description = sign.getDescription();
        this.signStatus = sign.getSignStatus();

        User user = sign.getUser();
        this.sigerId = user.getId();
        this.signerEmail = user.getEmail();
        this.signerPhone = user.getPhoneNumber();
        this.signerName = user.getName();
        this.signerPhotoUrl = user.getPhotoUrl();



    }
}
