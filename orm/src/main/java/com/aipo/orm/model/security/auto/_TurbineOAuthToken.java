package com.aipo.orm.model.security.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import com.aipo.orm.model.security.TurbineUser;

/**
 * Class _TurbineOAuthToken was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TurbineOAuthToken extends CayenneDataObject {

    public static final String ACCESS_TOKEN_PROPERTY = "accessToken";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String EXPIRE_TIME_PROPERTY = "expireTime";
    public static final String SCOPE_PROPERTY = "scope";
    public static final String TOKEN_TYPE_PROPERTY = "tokenType";
    public static final String USER_PROPERTY = "user";

    public static final String TOKEN_ID_PK_COLUMN = "TOKEN_ID";

    public void setAccessToken(String accessToken) {
        writeProperty("accessToken", accessToken);
    }
    public String getAccessToken() {
        return (String)readProperty("accessToken");
    }

    public void setCreateDate(Date createDate) {
        writeProperty("createDate", createDate);
    }
    public Date getCreateDate() {
        return (Date)readProperty("createDate");
    }

    public void setExpireTime(Date expireTime) {
        writeProperty("expireTime", expireTime);
    }
    public Date getExpireTime() {
        return (Date)readProperty("expireTime");
    }

    public void setScope(String scope) {
        writeProperty("scope", scope);
    }
    public String getScope() {
        return (String)readProperty("scope");
    }

    public void setTokenType(String tokenType) {
        writeProperty("tokenType", tokenType);
    }
    public String getTokenType() {
        return (String)readProperty("tokenType");
    }

    public void setUser(TurbineUser user) {
        setToOneTarget("user", user, true);
    }

    public TurbineUser getUser() {
        return (TurbineUser)readProperty("user");
    }


}