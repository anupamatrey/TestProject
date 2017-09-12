package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-12T19:14:47.483Z")

public class InlineResponse200   {
  @JsonProperty("pin")
  private String pin = null;

  @JsonProperty("metrefId")
  private String metrefId = null;

  public InlineResponse200 pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Get pin
   * @return pin
  **/
  @ApiModelProperty(value = "")
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public InlineResponse200 metrefId(String metrefId) {
    this.metrefId = metrefId;
    return this;
  }

   /**
   * Get metrefId
   * @return metrefId
  **/
  @ApiModelProperty(value = "")
  public String getMetrefId() {
    return metrefId;
  }

  public void setMetrefId(String metrefId) {
    this.metrefId = metrefId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.pin, inlineResponse200.pin) &&
        Objects.equals(this.metrefId, inlineResponse200.metrefId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pin, metrefId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    metrefId: ").append(toIndentedString(metrefId)).append("\n");
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

