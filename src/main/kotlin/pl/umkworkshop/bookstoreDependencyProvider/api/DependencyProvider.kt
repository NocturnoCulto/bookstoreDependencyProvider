package pl.umkworkshop.bookstoreDependencyProvider.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import pl.umkworkshop.bookstoreDependencyProvider.services.coreInformation.CoreInformationProvider
import pl.umkworkshop.bookstoreDependencyProvider.services.description.DescriptionProvider
import pl.umkworkshop.bookstoreDependencyProvider.services.stock.StockProvider

@RestController
class DependencyProvider(
    private val coreInformationProvider: CoreInformationProvider,
    private val stockProvider: StockProvider,
    private val descriptionProvider: DescriptionProvider,
    private val dependenciesConfiguration: DependenciesConfiguration
) {

    @GetMapping("/bookById/{id}")
    fun getBookById(@PathVariable id: Int): ResponseEntity<Any> {

        Thread.sleep(dependenciesConfiguration.coreInformationDelay)

        return prepareResponseEntity(dependenciesConfiguration.coreInformationErrorRate, coreInformationProvider.getCoreInformationById(id.toLong()))
    }

    @GetMapping("/descriptionById/{id}")
    fun getDescriptionById(@PathVariable id: Int): ResponseEntity<Any> {

        Thread.sleep(dependenciesConfiguration.descriptionDelay)

        return prepareResponseEntity(dependenciesConfiguration.descriptionErrorRate, descriptionProvider.getDescriptionById(id.toLong()))
    }

    @GetMapping("/stockById/{id}")
    fun getStockById(@PathVariable id: Int): ResponseEntity<Any> {

        Thread.sleep(dependenciesConfiguration.stockDelay)

        return prepareResponseEntity(dependenciesConfiguration.stockErrorRate, stockProvider.getStockById(id.toLong()))
    }

    private fun prepareResponseEntity(errorRate: Int, body: Any): ResponseEntity<Any> {
        if ((1..100).random() <= errorRate) {
            return ResponseEntity.status(500).body("Error")
        }

        return ResponseEntity.status(200).body(body)
    }


}