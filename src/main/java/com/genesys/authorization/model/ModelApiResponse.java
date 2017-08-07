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
import com.genesys.authorization.model.ApiResponseStatus;
import com.genesys.authorization.model.CollectionApiResponse;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ModelApiResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-07T14:23:03.515Z")
public class ModelApiResponse {
  @SerializedName("data")
  private Object data = null;

  @SerializedName("errors")
  private CollectionApiResponse errors = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("status")
  private ApiResponseStatus status = null;

  public ModelApiResponse data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public ModelApiResponse errors(CollectionApiResponse errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public CollectionApiResponse getErrors() {
    return errors;
  }

  public void setErrors(CollectionApiResponse errors) {
    this.errors = errors;
  }

  public ModelApiResponse path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ModelApiResponse status(ApiResponseStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ApiResponseStatus getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.data, _apiResponse.data) &&
        Objects.equals(this.errors, _apiResponse.errors) &&
        Objects.equals(this.path, _apiResponse.path) &&
        Objects.equals(this.status, _apiResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, path, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

