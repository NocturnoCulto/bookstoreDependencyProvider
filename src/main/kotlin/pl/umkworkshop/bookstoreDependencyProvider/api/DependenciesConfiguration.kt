package pl.umkworkshop.bookstoreDependencyProvider.api

import org.springframework.context.annotation.Configuration

@Configuration
class DependenciesConfiguration {
    var descriptionDelay: Long = 100
    var coreInformationDelay: Long = 100
    var stockDelay: Long = 100

    var descriptionErrorRate: Int = 0
    var coreInformationErrorRate: Int = 0
    var stockErrorRate: Int = 0

    var descriptionErrorDelay: Long = 100
    var coreInformationErrorDelay: Long = 100
    var stockErrorDelay: Long = 100
}