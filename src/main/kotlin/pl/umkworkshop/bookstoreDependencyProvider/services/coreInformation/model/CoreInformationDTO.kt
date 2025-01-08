package pl.umkworkshop.bookstoreDependencyProvider.services.coreInformation.model;


data class CoreInformationDTO(
    val id: Long,
    val title: String,
    val authorFirstName: String,
    val authorLastName: String
)
