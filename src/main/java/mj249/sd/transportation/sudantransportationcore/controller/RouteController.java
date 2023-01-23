
package mj249.sd.transportation.sudantransportationcore.controller;

import mj249.sd.transportation.sudantransportationcore.dto.RouteDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mj249.sd.transportation.sudantransportationcore.response.Result;

@RestController
@RequestMapping("/api/v1/route/")
public class RouteController {

    @GetMapping("/getRoute")
    public Result<RouteDTO> getRoute(){
        // TODO: Write the logic here to return the result
        return Result.success(null);
    }
}
