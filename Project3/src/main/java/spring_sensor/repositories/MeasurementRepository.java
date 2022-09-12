package spring_sensor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_sensor.models.Measurement;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
