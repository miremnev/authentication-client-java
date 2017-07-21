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
import com.genesys.authorization.model.CollectionGrantedAuthority;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ClientDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-21T20:20:26.006Z")
public class ClientDetails {
  @SerializedName("accessTokenValiditySeconds")
  private Integer accessTokenValiditySeconds = null;

  @SerializedName("authorities")
  private CollectionGrantedAuthority authorities = null;

  @SerializedName("authorizedGrantTypes")
  private List<String> authorizedGrantTypes = new ArrayList<String>();

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("refreshTokenValiditySeconds")
  private Integer refreshTokenValiditySeconds = null;

  @SerializedName("registeredRedirectUri")
  private List<String> registeredRedirectUri = new ArrayList<String>();

  @SerializedName("resourceIds")
  private List<String> resourceIds = new ArrayList<String>();

  @SerializedName("scope")
  private List<String> scope = new ArrayList<String>();

  @SerializedName("scoped")
  private Boolean scoped = null;

  @SerializedName("secretRequired")
  private Boolean secretRequired = null;

  public ClientDetails accessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    return this;
  }

   /**
   * Get accessTokenValiditySeconds
   * @return accessTokenValiditySeconds
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAccessTokenValiditySeconds() {
    return accessTokenValiditySeconds;
  }

  public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
  }

  public ClientDetails authorities(CollectionGrantedAuthority authorities) {
    this.authorities = authorities;
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @ApiModelProperty(example = "null", value = "")
  public CollectionGrantedAuthority getAuthorities() {
    return authorities;
  }

  public void setAuthorities(CollectionGrantedAuthority authorities) {
    this.authorities = authorities;
  }

  public ClientDetails authorizedGrantTypes(List<String> authorizedGrantTypes) {
    this.authorizedGrantTypes = authorizedGrantTypes;
    return this;
  }

  public ClientDetails addAuthorizedGrantTypesItem(String authorizedGrantTypesItem) {
    this.authorizedGrantTypes.add(authorizedGrantTypesItem);
    return this;
  }

   /**
   * Get authorizedGrantTypes
   * @return authorizedGrantTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAuthorizedGrantTypes() {
    return authorizedGrantTypes;
  }

  public void setAuthorizedGrantTypes(List<String> authorizedGrantTypes) {
    this.authorizedGrantTypes = authorizedGrantTypes;
  }

  public ClientDetails clientId(String clientId) {
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

  public ClientDetails clientSecret(String clientSecret) {
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

  public ClientDetails refreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    return this;
  }

   /**
   * Get refreshTokenValiditySeconds
   * @return refreshTokenValiditySeconds
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRefreshTokenValiditySeconds() {
    return refreshTokenValiditySeconds;
  }

  public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
  }

  public ClientDetails registeredRedirectUri(List<String> registeredRedirectUri) {
    this.registeredRedirectUri = registeredRedirectUri;
    return this;
  }

  public ClientDetails addRegisteredRedirectUriItem(String registeredRedirectUriItem) {
    this.registeredRedirectUri.add(registeredRedirectUriItem);
    return this;
  }

   /**
   * Get registeredRedirectUri
   * @return registeredRedirectUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRegisteredRedirectUri() {
    return registeredRedirectUri;
  }

  public void setRegisteredRedirectUri(List<String> registeredRedirectUri) {
    this.registeredRedirectUri = registeredRedirectUri;
  }

  public ClientDetails resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public ClientDetails addResourceIdsItem(String resourceIdsItem) {
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

   /**
   * Get resourceIds
   * @return resourceIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public ClientDetails scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public ClientDetails addScopeItem(String scopeItem) {
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public ClientDetails scoped(Boolean scoped) {
    this.scoped = scoped;
    return this;
  }

   /**
   * Get scoped
   * @return scoped
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getScoped() {
    return scoped;
  }

  public void setScoped(Boolean scoped) {
    this.scoped = scoped;
  }

  public ClientDetails secretRequired(Boolean secretRequired) {
    this.secretRequired = secretRequired;
    return this;
  }

   /**
   * Get secretRequired
   * @return secretRequired
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSecretRequired() {
    return secretRequired;
  }

  public void setSecretRequired(Boolean secretRequired) {
    this.secretRequired = secretRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDetails clientDetails = (ClientDetails) o;
    return Objects.equals(this.accessTokenValiditySeconds, clientDetails.accessTokenValiditySeconds) &&
        Objects.equals(this.authorities, clientDetails.authorities) &&
        Objects.equals(this.authorizedGrantTypes, clientDetails.authorizedGrantTypes) &&
        Objects.equals(this.clientId, clientDetails.clientId) &&
        Objects.equals(this.clientSecret, clientDetails.clientSecret) &&
        Objects.equals(this.refreshTokenValiditySeconds, clientDetails.refreshTokenValiditySeconds) &&
        Objects.equals(this.registeredRedirectUri, clientDetails.registeredRedirectUri) &&
        Objects.equals(this.resourceIds, clientDetails.resourceIds) &&
        Objects.equals(this.scope, clientDetails.scope) &&
        Objects.equals(this.scoped, clientDetails.scoped) &&
        Objects.equals(this.secretRequired, clientDetails.secretRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenValiditySeconds, authorities, authorizedGrantTypes, clientId, clientSecret, refreshTokenValiditySeconds, registeredRedirectUri, resourceIds, scope, scoped, secretRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDetails {\n");
    
    sb.append("    accessTokenValiditySeconds: ").append(toIndentedString(accessTokenValiditySeconds)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    authorizedGrantTypes: ").append(toIndentedString(authorizedGrantTypes)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    refreshTokenValiditySeconds: ").append(toIndentedString(refreshTokenValiditySeconds)).append("\n");
    sb.append("    registeredRedirectUri: ").append(toIndentedString(registeredRedirectUri)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scoped: ").append(toIndentedString(scoped)).append("\n");
    sb.append("    secretRequired: ").append(toIndentedString(secretRequired)).append("\n");
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

