package aobai.user.api.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户表 t_user
 *
 * @author platform
 * @date 2019-09-05
 */
@Data
@Accessors(chain = true)
public class User implements Serializable{

    private Integer id ;
    //用户名
    private String userName ;
    //学历
    private String education;
    //居住地址
    private String address;
    //详细地址
    private String detailedAddress;
    //居住时长
    private String liveTime;
    //婚姻状况
    private String maritalStatus ;
    private Integer qq;
    //身份证
    private String idCard;
    //直系亲属
    private String immediateFamily;
    //亲属姓名
    private String immediateName	 ;
    //亲属手机号码
    private int  immediatePhone;
    //同事朋友名字
    private String colleaguesName	;
    //同事朋友手机号码
    private int  colleaguesPhone ;


}

