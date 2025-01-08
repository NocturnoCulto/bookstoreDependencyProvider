package pl.umkworkshop.bookstoreDependencyProvider.services.stock.model

import java.math.BigDecimal
import java.util.*

data class PriceDTO(
    val value: BigDecimal,
    val currency: Currency
)
