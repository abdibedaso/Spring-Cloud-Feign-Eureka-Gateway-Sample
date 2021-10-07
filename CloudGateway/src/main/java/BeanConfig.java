import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
//
//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p.path("/student/**")
//                        .uri("lb://StudentService")
////                        .id("studentModule")
//                )
//                .route(r -> r.path("/grade/**")
//                        .uri("lb://GradingService")
////                        .id("gradesModule")
//                )
//                .build();
//    }

}
