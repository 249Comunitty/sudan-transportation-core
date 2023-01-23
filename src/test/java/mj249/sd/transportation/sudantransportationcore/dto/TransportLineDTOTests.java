
package mj249.sd.transportation.sudantransportationcore.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class TransportLineDTOTests {

    @Test
    public void values(){
        int id = 1;
        int fromStationId = 2;
        int toStationId = 3;
        BigDecimal fees = new BigDecimal("500");
        double journeyTime = 30.0;
        byte state = (byte) 1;

        TransportLineDTO transportLineDTO = new TransportLineDTO(id, fromStationId, toStationId, fees, journeyTime, state);
        Assertions.assertEquals(id, transportLineDTO.getId());
        Assertions.assertEquals(fromStationId, transportLineDTO.getFromStationId());
        Assertions.assertEquals(toStationId, transportLineDTO.getToStationId());
        Assertions.assertEquals(fees, transportLineDTO.getFees());
        Assertions.assertEquals(journeyTime, transportLineDTO.getJourneyTime());
        Assertions.assertEquals(state, transportLineDTO.getState());
    }
}
