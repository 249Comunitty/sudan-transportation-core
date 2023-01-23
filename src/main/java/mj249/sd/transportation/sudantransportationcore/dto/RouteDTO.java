
package mj249.sd.transportation.sudantransportationcore.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


import java.util.List;

@NoArgsConstructor
public class RouteDTO {

    private byte optionsCount;
    @Getter
    @Setter
    private List<RouteOption> routeOptions;

    public byte getOptionsCount() {
        return (byte) this.routeOptions.size();
    }
}
