/*
 * Authentication API
 * Authentication API
 *
 * OpenAPI spec version: 9.0.000.00.764
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.authentication.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DefaultOAuth2AccessToken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T21:41:13.300Z")
public class DefaultOAuth2AccessToken {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("token_type")
  private String tokenType = null;

  public DefaultOAuth2AccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * the access token
   * @return accessToken
  **/
  @ApiModelProperty(value = "the access token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public DefaultOAuth2AccessToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * timeout (in seconds) before token expiration
   * @return expiresIn
  **/
  @ApiModelProperty(value = "timeout (in seconds) before token expiration")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public DefaultOAuth2AccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * the refresh token
   * @return refreshToken
  **/
  @ApiModelProperty(value = "the refresh token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public DefaultOAuth2AccessToken scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * scope of token
   * @return scope
  **/
  @ApiModelProperty(value = "scope of token")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public DefaultOAuth2AccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * the type of access token, always &#39;bearer&#39;
   * @return tokenType
  **/
  @ApiModelProperty(value = "the type of access token, always 'bearer'")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultOAuth2AccessToken defaultOAuth2AccessToken = (DefaultOAuth2AccessToken) o;
    return Objects.equals(this.accessToken, defaultOAuth2AccessToken.accessToken) &&
        Objects.equals(this.expiresIn, defaultOAuth2AccessToken.expiresIn) &&
        Objects.equals(this.refreshToken, defaultOAuth2AccessToken.refreshToken) &&
        Objects.equals(this.scope, defaultOAuth2AccessToken.scope) &&
        Objects.equals(this.tokenType, defaultOAuth2AccessToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, refreshToken, scope, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultOAuth2AccessToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

