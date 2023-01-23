
package mj249.sd.transportation.sudantransportationcore.dto;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RouteOptionTests {

    @Test
    public void changes(){
        RouteOption option = new RouteOption();
        option.setOptionOrder((byte)1);
        List<TransportLineDTO> transportLineDTOS = new ArrayList<>();
        transportLineDTOS.add(null);
        transportLineDTOS.add(null);
        transportLineDTOS.add(null);
        option.setTransportLines(transportLineDTOS);

        Assertions.assertEquals(transportLineDTOS.size(), option.getChanges());
        Assertions.assertEquals(transportLineDTOS.size(), option.getTransportLines().size());
        Assertions.assertEquals(1, option.getOptionOrder());
    }
}
