package com.fortex.xcloud.restapi.controller;

import com.fortex.xcloud.restapi.constants.ResponseContants;
import com.fortex.xcloud.restapi.model.Config;
import com.fortex.xcloud.restapi.model.FortexNewsServer;
import com.fortex.xcloud.restapi.model.ResponseObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/fortexNewsServer")
public class FortexNewsServerController extends BaseController{
    @RequestMapping(method = RequestMethod.POST)
    public ResponseObj update(@RequestBody FortexNewsServer fortexNewsServer) {
        ResponseObj responseObj = null;
        try {
            Config config = readObject();
            config.setFortexNewsServer(fortexNewsServer);
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
            responseObj = new ResponseObj("FortexNewsServer",readObject().getFortexNewsServer(), ResponseContants.CODE_SUCCESS, ResponseContants.MESSAGE_SUCCESS);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            responseObj = new ResponseObj( ResponseContants.CODE_READ_FILE_ERROR, ResponseContants.MESSAGE_READ_FILE_ERROR);
        }
        return responseObj;
    }

}
