package com.fortex.xcloud.restapi.controller;


import com.fortex.xcloud.restapi.constants.ResponseContants;
import com.fortex.xcloud.restapi.model.Config;
import com.fortex.xcloud.restapi.model.ResponseObj;
import com.fortex.xcloud.restapi.model.Startup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/startup")
public class StartupController extends BaseController {
    @RequestMapping(method = RequestMethod.POST)
    public ResponseObj update(@RequestBody Startup startup) {
        ResponseObj responseObj = null;
        try {
            Config config = readObject();
            config.setStartup(startup);
            writeObject(config);
            responseObj = new ResponseObj(ResponseContants.CODE_SUCCESS, ResponseContants.MESSAGE_SUCCESS);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            responseObj = new ResponseObj(ResponseContants.CODE_READ_FILE_ERROR, ResponseContants.MESSAGE_READ_FILE_ERROR);
        }
        return responseObj;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseObj read(){
        ResponseObj responseObj = null;
        try {
            responseObj = new ResponseObj("Startup",readObject().getStartup(), ResponseContants.CODE_SUCCESS, ResponseContants.MESSAGE_SUCCESS);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            responseObj = new ResponseObj( ResponseContants.CODE_READ_FILE_ERROR, ResponseContants.MESSAGE_READ_FILE_ERROR);
        }
        return responseObj;
    }
}
