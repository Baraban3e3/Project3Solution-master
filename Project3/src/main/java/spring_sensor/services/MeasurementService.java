package spring_sensor.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_sensor.models.Measurement;
import spring_sensor.repositories.MeasurementRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class MeasurementService {

    private final MeasurementRepository measurementRepository;
    private final SensorService sensorService;

    public MeasurementService(MeasurementRepository measurementRepository,
                              SensorService sensorService) {
        this.measurementRepository = measurementRepository;
        this.sensorService = sensorService;
    }

    public List<Measurement> findAll() {
        return measurementRepository.findAll();
    }

    @Transactional
    public void addMeasurement(Measurement measurement) {
        enrichMeasurement(measurement);
        measurementRepository.save(measurement);
    }

    public void enrichMeasurement(Measurement measurement) {
        // we have to find the sensor from the database by name and insert the object from the Hibernate persistence context
        measurement.setSensor(sensorService.findByName(measurement.getSensor().getName()).get());

        measurement.setMeasurementDateTime(LocalDateTime.now());
    }
}
