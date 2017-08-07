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
import com.genesys.authorization.model.Collectionstring;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * BaseClientDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-07T14:23:03.515Z")
public class BaseClientDetails {
  @SerializedName("access_token_validity")
  private Integer accessTokenValidity = null;

  @SerializedName("authorities")
  private List<String> authorities = new ArrayList<String>();

  @SerializedName("authorized_grant_types")
  private Collectionstring authorizedGrantTypes = null;

  @SerializedName("autoapprove")
  private Collectionstring autoapprove = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("redirect_uri")
  private List<String> redirectUri = new ArrayList<String>();

  @SerializedName("refresh_token_validity")
  private Integer refreshTokenValidity = null;

  @SerializedName("resource_ids")
  private Collectionstring resourceIds = null;

  @SerializedName("scope")
  private Collectionstring scope = null;

  public BaseClientDetails accessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
    return this;
  }

   /**
   * Get accessTokenValidity
   * @return accessTokenValidity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAccessTokenValidity() {
    return accessTokenValidity;
  }

  public void setAccessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
  }

  public BaseClientDetails authorities(List<String> authorities) {
    this.authorities = authorities;
    return this;
  }

  public BaseClientDetails addAuthoritiesItem(String authoritiesItem) {
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(List<String> authorities) {
    this.authorities = authorities;
  }

  public BaseClientDetails authorizedGrantTypes(Collectionstring authorizedGrantTypes) {
    this.authorizedGrantTypes = authorizedGrantTypes;
    return this;
  }

   /**
   * Get authorizedGrantTypes
   * @return authorizedGrantTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Collectionstring getAuthorizedGrantTypes() {
    return authorizedGrantTypes;
  }

  public void setAuthorizedGrantTypes(Collectionstring authorizedGrantTypes) {
    this.authorizedGrantTypes = authorizedGrantTypes;
  }

  public BaseClientDetails autoapprove(Collectionstring autoapprove) {
    this.autoapprove = autoapprove;
    return this;
  }

   /**
   * Get autoapprove
   * @return autoapprove
  **/
  @ApiModelProperty(example = "null", value = "")
  public Collectionstring getAutoapprove() {
    return autoapprove;
  }

  public void setAutoapprove(Collectionstring autoapprove) {
    this.autoapprove = autoapprove;
  }

  public BaseClientDetails clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public BaseClientDetails clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public BaseClientDetails redirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public BaseClientDetails addRedirectUriItem(String redirectUriItem) {
    this.redirectUri.add(redirectUriItem);
    return this;
  }

   /**
   * Get redirectUri
   * @return redirectUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public BaseClientDetails refreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
    return this;
  }

   /**
   * Get refreshTokenValidity
   * @return refreshTokenValidity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRefreshTokenValidity() {
    return refreshTokenValidity;
  }

  public void setRefreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
  }

  public BaseClientDetails resourceIds(Collectionstring resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

   /**
   * Get resourceIds
   * @return resourceIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public Collectionstring getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(Collectionstring resourceIds) {
    this.resourceIds = resourceIds;
  }

  public BaseClientDetails scope(Collectionstring scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(example = "null", value = "")
  public Collectionstring getScope() {
    return scope;
  }

  public void setScope(Collectionstring scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseClientDetails baseClientDetails = (BaseClientDetails) o;
    return Objects.equals(this.accessTokenValidity, baseClientDetails.accessTokenValidity) &&
        Objects.equals(this.authorities, baseClientDetails.authorities) &&
        Objects.equals(this.authorizedGrantTypes, baseClientDetails.authorizedGrantTypes) &&
        Objects.equals(this.autoapprove, baseClientDetails.autoapprove) &&
        Objects.equals(this.clientId, baseClientDetails.clientId) &&
        Objects.equals(this.clientSecret, baseClientDetails.clientSecret) &&
        Objects.equals(this.redirectUri, baseClientDetails.redirectUri) &&
        Objects.equals(this.refreshTokenValidity, baseClientDetails.refreshTokenValidity) &&
        Objects.equals(this.resourceIds, baseClientDetails.resourceIds) &&
        Objects.equals(this.scope, baseClientDetails.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenValidity, authorities, authorizedGrantTypes, autoapprove, clientId, clientSecret, redirectUri, refreshTokenValidity, resourceIds, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseClientDetails {\n");
    
    sb.append("    accessTokenValidity: ").append(toIndentedString(accessTokenValidity)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    authorizedGrantTypes: ").append(toIndentedString(authorizedGrantTypes)).append("\n");
    sb.append("    autoapprove: ").append(toIndentedString(autoapprove)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    refreshTokenValidity: ").append(toIndentedString(refreshTokenValidity)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

