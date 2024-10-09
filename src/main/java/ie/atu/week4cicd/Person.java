package ie.atu.week4cicd;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

   @NotBlank(message = "You must enter a name")
   private String name;
   @NotBlank(message = "You must enter a title")
   private String title;
   @PositiveOrZero(message = "You must enter a valid id")
   private int employeeId;
   @PositiveOrZero(message = "You must enter a valid age")
   private int age;
   @Email(message = "You must enter a valid email")
   private String email;
   @NotBlank(message = "You must enter a valid position")
   private String position;
   @NotBlank(message = "You must enter a valid department")
   private String department;

}
