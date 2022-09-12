package spring_sensor.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class SensorDTO {
    @NotEmpty(message = "Title must not be empty!")
    @Size(min = 3, max = 30, message = "Sensor name must be between 3 and 30 characters!")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
