
package mj249.sd.transportation.sudantransportationcore.controller;

import mj249.sd.transportation.sudantransportationcore.dto.StateDTO;
import mj249.sd.transportation.sudantransportationcore.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/state/")
public class StateController {

    @GetMapping("/getState")
    public Result<StateDTO> getStateById(@RequestParam Byte id){
        // TODO: Write the logic here to return the result
        return Result.success(null);
    }

    @GetMapping("/getStates")
    public Result<StateDTO> getStates(){
        // TODO: Write the logic here to return the result
        return Result.success(null);
    }
}
