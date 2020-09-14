package pl.coderslab.finalproject.additional;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AdditionalService {
    private final AdditionalRepository additionalRepository;

    public AdditionalService(AdditionalRepository additionalRepository) {
        this.additionalRepository = additionalRepository;
    }
}
