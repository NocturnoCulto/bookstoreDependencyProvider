package pl.umkworkshop.bookstoreDependencyProvider.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import pl.umkworkshop.bookstoreDependencyProvider.api.model.ConfigValues

@RestController
class DependenciesConfigApplier(
    private val dependenciesConfiguration: DependenciesConfiguration
) {

    @PutMapping("/config")
    fun applyConfig(@RequestBody configValues: ConfigValues): String {
        dependenciesConfiguration.descriptionDelay = configValues.descriptionDelay
        dependenciesConfiguration.coreInformationDelay = configValues.coreInformationDelay
        dependenciesConfiguration.stockDelay = configValues.stockDelay

        dependenciesConfiguration.descriptionErrorRate = configValues.descriptionErrorRate
        dependenciesConfiguration.coreInformationErrorRate = configValues.coreInformationErrorRate
        dependenciesConfiguration.stockErrorRate = configValues.stockErrorRate

        return getConfig().toString()
    }

    @GetMapping("/config")
    fun getConfig(): ConfigValues {
        return ConfigValues(
            descriptionDelay = dependenciesConfiguration.descriptionDelay,
            coreInformationDelay = dependenciesConfiguration.coreInformationDelay,
            stockDelay = dependenciesConfiguration.stockDelay,
            descriptionErrorRate = dependenciesConfiguration.descriptionErrorRate,
            coreInformationErrorRate = dependenciesConfiguration.coreInformationErrorRate,
            stockErrorRate = dependenciesConfiguration.stockErrorRate
        )
    }
}