package pl.coderslab.finalproject.BodyCompositionAnalysis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.validation.Validator;

@Controller
@RequestMapping("/measurement")
public class MeasurementController {
    private final MeasurementService measurementService;
    private final Validator validator;

    public MeasurementController(MeasurementService measurementService, Validator validator) {
        this.measurementService = measurementService;
        this.validator = validator;
    }
}
