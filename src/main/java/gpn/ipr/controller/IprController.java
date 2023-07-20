package gpn.ipr.controller;

import gpn.ipr.model.IprCalculationRequest;
import gpn.ipr.model.IprCalculationResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/ipr")
@Tag(name = "IPR controller")
public class IprController {

    /**
     * Эндпоинт расчёта IPR
     */
    @Operation(description = "Эндпоинт расчёта IPR")
    @PostMapping("/calc")
    public IprCalculationResponse calculateCurve(@Valid @RequestBody IprCalculationRequest request) {
        return new IprCalculationResponse(
                asList(
                        190.04, 187.46, 184.87, 182.12, 177.57, 171.26, 163.59,
                        154.82, 145.13, 134.67, 123.53, 111.82, 99.60, 87.15,
                        74.70, 62.25, 49.80, 37.35, 24.90, 12.45, 0.0
                ),
                asList(
                        1.0, 13.45, 25.9, 38.34, 50.8, 63.25, 75.69,
                        88.14, 100.6, 113.05, 125.5, 137.95, 150.39, 162.85,
                        175.29, 187.75, 200.2, 212.64, 225.1, 237.54, 250.0
                )
        );
    }

}
