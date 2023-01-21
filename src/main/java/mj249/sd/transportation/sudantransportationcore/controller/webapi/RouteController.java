
package mj249.sd.transportation.sudantransportationcore.controller.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mj249.sd.transportation.sudantransportationcore.response.Result;

@RestController
@RequestMapping("/api/web/v1/route")
public class RouteController {

    @GetMapping()
    public Result<String> Get(){
        return Result.success("Route Info DTO.");
    }
}
