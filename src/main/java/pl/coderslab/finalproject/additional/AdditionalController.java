package pl.coderslab.finalproject.additional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Validator;

@Controller
@RequestMapping("/additional")
public class AdditionalController {
    private final AdditionalService additionalService;
    private final Validator validator;

    public AdditionalController(AdditionalService additionalService, Validator validator) {
        this.additionalService = additionalService;
        this.validator = validator;
    }


}
