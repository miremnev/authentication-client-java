/*
 * Authorization API
 * Authorization API
 *
 * OpenAPI spec version: 9.0.000.00.598
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.authorization.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DefaultOAuth2AccessToken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T20:02:46.517Z")
public class DefaultOAuth2AccessToken {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  @SerializedName("id_token")
  private String idToken = null;

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
  @ApiModelProperty(example = "null", value = "the access token")
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
  @ApiModelProperty(example = "null", value = "timeout (in seconds) before token expiration")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public DefaultOAuth2AccessToken idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

   /**
   * id_token, see JWT standard for more details
   * @return idToken
  **/
  @ApiModelProperty(example = "null", value = "id_token, see JWT standard for more details")
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  public DefaultOAuth2AccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * the type of access token, always 'bearer'
   * @return tokenType
  **/
  @ApiModelProperty(example = "null", value = "the type of access token, always 'bearer'")
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
        Objects.equals(this.idToken, defaultOAuth2AccessToken.idToken) &&
        Objects.equals(this.tokenType, defaultOAuth2AccessToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, idToken, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultOAuth2AccessToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
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

