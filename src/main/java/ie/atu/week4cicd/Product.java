package ie.atu.week4cicd;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @NotBlank(message="You must enter a name")
    private String name;
    @Min(value=1, message="Must be greater or equal to 1")
    private int id;
}
