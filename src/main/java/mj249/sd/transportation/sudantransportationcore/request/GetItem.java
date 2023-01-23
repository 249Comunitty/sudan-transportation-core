package mj249.sd.transportation.sudantransportationcore.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class GetItem<T> {
    @Getter
    @Setter
    private T itemId;
}
