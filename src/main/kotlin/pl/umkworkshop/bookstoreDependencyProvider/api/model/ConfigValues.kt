package pl.umkworkshop.bookstoreDependencyProvider.api.model

data class ConfigValues(
    val coreInformationDelay: Long = 100,
    val coreInformationErrorRate: Int = 0,
    val coreInformationErrorDelay: Long = 100,
    val stockDelay: Long = 100,
    val stockErrorRate: Int = 0,
    val stockErrorDelay: Long = 100,
    val descriptionDelay: Long = 100,
    val descriptionErrorRate: Int = 0,
    val descriptionErrorDelay: Long = 100
)
