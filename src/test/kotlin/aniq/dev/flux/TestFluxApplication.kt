package aniq.dev.flux

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<FluxApplication>().with(TestcontainersConfiguration::class).run(*args)
}
