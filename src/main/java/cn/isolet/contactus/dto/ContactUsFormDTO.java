package cn.isolet.contactus.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class ContactUsFormDTO implements Serializable {

    @NotNull(message = "姓名不能为空")
    private String name;

    @NotNull(message = "公司不能为空")
    private String company;

    @Email(message = "邮箱格式不正确")
    private String email;

    private String comment;
}
