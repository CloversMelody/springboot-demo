package edu.nuaa.springbootdemo.domain;

import lombok.*;

/**
 * @Description: 用户信息实体
 * @author: wangli
 * @date: 2021/10/31 9:00
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户账号
     */
    private String accountNo;

    /**
     * 用户密码
     */
    private String accountPwd;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 手机号
     */
    private String userPhone;
}
