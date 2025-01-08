package pl.umkworkshop.bookstoreDependencyProvider.services.coreInformation

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service
import pl.umkworkshop.bookstoreDependencyProvider.services.coreInformation.model.CoreInformationDTO

@Service
class CoreInformationProvider {

    private val coreInformationMap: MutableMap<Long, CoreInformationDTO> = mutableMapOf()

    fun getCoreInformationById(id: Long): CoreInformationDTO {
        return coreInformationMap[id] ?: coreInformationMap[123L]!!
    }

    @PostConstruct
    fun fillDescriptions() {
        coreInformationMap[123L] = CoreInformationDTO(123L, "Hobbit", "John Ronald Reuel", "Tolkien")
        coreInformationMap[125L] = CoreInformationDTO(125L, "Lord of the rings", "John Ronald Reuel", "Tolkien")
        coreInformationMap[127L] = CoreInformationDTO(127L, "Silmarillion", "John Ronald Reuel", "Tolkien")
        coreInformationMap[129L] = CoreInformationDTO(129L, "Quo vadis", "Henryk", "Sienkiewicz")
        coreInformationMap[130L] = CoreInformationDTO(130L, "Potop", "Henryk", "Sienkiewicz")
        coreInformationMap[131L] = CoreInformationDTO(131L, "Krzyżacy", "Henryk", "Sienkiewicz")
        coreInformationMap[132L] = CoreInformationDTO(132L, "Pan Wołodyjowski", "Henryk", "Sienkiewicz")
        coreInformationMap[135L] = CoreInformationDTO(135L, "Ogniem i mieczem", "Henryk", "Sienkiewicz")
        coreInformationMap[140L] = CoreInformationDTO(140L, "Krew elfów", "Andrzej", "Sapkowski")
        coreInformationMap[145L] = CoreInformationDTO(145L, "Czas pogardy", "Andrzej", "Sapkowski")
        coreInformationMap[150L] = CoreInformationDTO(150L, "Chrzest ognia", "Andrzej", "Sapkowski")
        coreInformationMap[155L] = CoreInformationDTO(155L, "Wieża Jaskółki", "Andrzej", "Sapkowski")
        coreInformationMap[160L] = CoreInformationDTO(160L, "Pani Jeziora", "Andrzej", "Sapkowski")
    }
}