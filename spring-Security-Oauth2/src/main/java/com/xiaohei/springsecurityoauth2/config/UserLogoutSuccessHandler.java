package com.xiaohei.springsecurityoauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2022/4/15 10:12 上午
 * @Describtion
 */
@Component
public class UserLogoutSuccessHandler extends AbstractAuthenticationTargetUrlRequestHandler implements LogoutSuccessHandler {
    private static final String BEARER_AUTHENTICATION = "Bearer ";
    private static final String HEADER_AUTHORIZATION = "authorization";

    @Autowired
    private TokenStore tokenStore;

//    @Autowired
//    private MyRedisTokenStore myRedisTokenStore;

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Authentication authentication) {

        String token = httpServletRequest.getHeader(HEADER_AUTHORIZATION);

        if (token != null && token.startsWith(BEARER_AUTHENTICATION)) {
            String accessTokenValue = token.split(" ")[1];

            OAuth2AccessToken oAuth2AccessToken = tokenStore.readAccessToken(accessTokenValue);
            if (oAuth2AccessToken != null) {
                OAuth2RefreshToken oAuth2RefreshToken = oAuth2AccessToken.getRefreshToken();
                if (oAuth2RefreshToken != null)
                    tokenStore.removeRefreshToken(oAuth2RefreshToken);

                tokenStore.removeAccessToken(oAuth2AccessToken);
            }
        }

        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
    }

    public void onLogoutSuccess(String authorization) {

        if (authorization != null && authorization.startsWith(BEARER_AUTHENTICATION)) {
            String accessTokenValue = authorization.split(" ")[1];

            OAuth2AccessToken oAuth2AccessToken = tokenStore.readAccessToken(accessTokenValue);
            if (oAuth2AccessToken != null) {
                OAuth2RefreshToken oAuth2RefreshToken = oAuth2AccessToken.getRefreshToken();
                if (oAuth2RefreshToken != null)
                    tokenStore.removeRefreshToken(oAuth2RefreshToken);

                tokenStore.removeAccessToken(oAuth2AccessToken);
            }
        }

//        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
    }

}
