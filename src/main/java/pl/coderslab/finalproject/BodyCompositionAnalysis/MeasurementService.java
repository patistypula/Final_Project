package pl.coderslab.finalproject.BodyCompositionAnalysis;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MeasurementService {
    private final MeasurementRepository measurementRepository;

    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    public Measurement save(Measurement measurement) {
        return measurementRepository.save(measurement);
    }
}
