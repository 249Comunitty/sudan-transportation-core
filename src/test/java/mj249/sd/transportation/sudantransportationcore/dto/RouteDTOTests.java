
package mj249.sd.transportation.sudantransportationcore.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RouteDTOTests {

    @Test
    public void optionsCount(){

        RouteDTO routeDTO = new RouteDTO();
        List<RouteOption> routeOptions = new ArrayList<>();
        routeOptions.add(null);
        routeOptions.add(null);
        routeOptions.add(null);
        routeDTO.setRouteOptions(routeOptions);

        Assertions.assertEquals(routeOptions.size(), routeDTO.getOptionsCount());
        Assertions.assertEquals(routeOptions.size(), routeDTO.getRouteOptions().size());
    }

}
