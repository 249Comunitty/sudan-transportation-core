
package mj249.sd.transportation.sudantransportationcore.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RouteOption {
    @Getter
    @Setter
    private byte optionOrder;

    private byte changes;

    @Getter
    @Setter
    private List<TransportLineDTO> transportLines;

    public byte getChanges(){
        return  (byte) transportLines.size();
    }
}
