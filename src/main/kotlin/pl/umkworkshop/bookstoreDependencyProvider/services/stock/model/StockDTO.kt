package pl.umkworkshop.bookstoreDependencyProvider.services.stock.model

data class StockDTO(
    val id: Long,
    val stockCount: Int,
    val price: PriceDTO
)
