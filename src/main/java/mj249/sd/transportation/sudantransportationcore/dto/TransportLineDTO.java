
package mj249.sd.transportation.sudantransportationcore.dto;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
public class TransportLineDTO {
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private int fromStationId;

    @Getter
    @Setter
    private int toStationId;

    @Getter
    @Setter
    private BigDecimal fees;

    @Getter
    @Setter
    private double journeyTime;

    @Getter
    @Setter
    private byte state;

    @Override
    public String toString() {
        return "TransportLineDTO{" +
                "id=" + id +
                ", fromStationId=" + fromStationId +
                ", toStationId=" + toStationId +
                ", fees=" + fees +
                ", journeyTime=" + journeyTime +
                ", state=" + state +
                '}';
    }
}
