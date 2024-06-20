package aniq.dev.flux

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.springframework.context.annotation.Bean
import org.testcontainers.oracle.OracleContainer
import org.testcontainers.utility.DockerImageName

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

	@Bean
	@ServiceConnection
	fun oracleFreeContainer(): OracleContainer {
		return OracleContainer(DockerImageName.parse("gvenzl/oracle-free:latest"))
	}

}
