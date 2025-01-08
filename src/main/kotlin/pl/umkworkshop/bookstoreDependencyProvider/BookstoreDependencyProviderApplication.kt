package pl.umkworkshop.bookstoreDependencyProvider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookstoreDependencyProviderApplication

fun main(args: Array<String>) {
	runApplication<BookstoreDependencyProviderApplication>(*args)
}
