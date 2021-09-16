package com.xiaohei.springsecurityoauth2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zhouxin
 * @Title
 * @Description
 * @date: 2019/3/20
 */
@Table(name = "oauth_client_details")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ClientDetails {

    /**
     * 客户端id
     */
    @Id
    private String clientId;

    /**
     * 资源服务id
     */
    private String resourceIds;

    /**
     * 秘钥
     */
    private String clientSecret;

    /**
     * 权限
     */
    private String scope;

    /**
     * 授权类型
     */
    private String authorizedGrantTypes;

    /**
     * 回调url
     */
    private String webServerRedirectUri;

    /**
     * 权限
     */
    private String authorities;

    /**
     * token有效期
     */
    private Long accessTokenValidity;

    /**
     * 刷新token 有效期
     */
    private Long refreshTokenValidity;

    private String additionalInformation;

    private String autoapprove;

}
