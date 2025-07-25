package mtech.prokect.openapigenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.Objects;

/**
 * User
 */
public class User {
  @JsonProperty("name")
  private String name;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  public User name(String name2) {
    this.name = name2;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Schema(example = "John Shahin", required = true)
  @NotNull
  @Pattern(regexp = "^[A-Za-z\\s]{1,50}$")
  @Size(max = 60)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @Schema(example = "+962790123456", required = true)
  @NotNull
  @Pattern(regexp = "^\\+962[0-9]{8}$")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.name, user.name) &&
        Objects.equals(this.phoneNumber, user.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

