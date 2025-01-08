package pl.umkworkshop.bookstoreDependencyProvider.services.stock

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component
import pl.umkworkshop.bookstoreDependencyProvider.services.stock.model.PriceDTO
import pl.umkworkshop.bookstoreDependencyProvider.services.stock.model.StockDTO
import java.math.BigDecimal
import java.util.Currency

@Component
class StockProvider {

    private val stockMap: MutableMap<Long, StockDTO> = mutableMapOf()

    fun getStockById(id: Long): StockDTO {
        return stockMap[id] ?: stockMap[123L]!!
    }

    @PostConstruct
    fun fillStockMap() {
        stockMap[123L] = StockDTO(123L, 7, PriceDTO(BigDecimal.valueOf(47), Currency.getInstance("PLN")))
        stockMap[125L] = StockDTO(125L, 19, PriceDTO(BigDecimal.valueOf(52), Currency.getInstance("PLN")))
        stockMap[127L] = StockDTO(127L, 12, PriceDTO(BigDecimal.valueOf(68), Currency.getInstance("PLN")))
        stockMap[129L] = StockDTO(129L, 24, PriceDTO(BigDecimal.valueOf(74), Currency.getInstance("PLN")))
        stockMap[130L] = StockDTO(130L, 6, PriceDTO(BigDecimal.valueOf(59), Currency.getInstance("PLN")))
        stockMap[131L] = StockDTO(131L, 14, PriceDTO(BigDecimal.valueOf(61), Currency.getInstance("PLN")))
        stockMap[132L] = StockDTO(132L, 21, PriceDTO(BigDecimal.valueOf(70), Currency.getInstance("PLN")))
        stockMap[135L] = StockDTO(135L, 8, PriceDTO(BigDecimal.valueOf(49), Currency.getInstance("PLN")))
        stockMap[140L] = StockDTO(140L, 17, PriceDTO(BigDecimal.valueOf(66), Currency.getInstance("PLN")))
        stockMap[145L] = StockDTO(145L, 10, PriceDTO(BigDecimal.valueOf(72), Currency.getInstance("PLN")))
        stockMap[150L] = StockDTO(150L, 23, PriceDTO(BigDecimal.valueOf(55), Currency.getInstance("PLN")))
        stockMap[155L] = StockDTO(155L, 9, PriceDTO(BigDecimal.valueOf(63), Currency.getInstance("PLN")))
        stockMap[160L] = StockDTO(160L, 15, PriceDTO(BigDecimal.valueOf(71), Currency.getInstance("PLN")))
    }

}

























