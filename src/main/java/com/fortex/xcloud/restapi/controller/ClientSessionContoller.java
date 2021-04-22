package com.fortex.xcloud.restapi.controller;

import com.fortex.xcloud.restapi.constants.ResponseContants;
import com.fortex.xcloud.restapi.model.ClientSession;
import com.fortex.xcloud.restapi.model.Config;
import com.fortex.xcloud.restapi.model.ResponseObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/clientSession")
public class ClientSessionContoller extends BaseController{
    @RequestMapping(method = RequestMethod.POST)
    public ResponseObj update(@RequestBody ClientSession clientSession) {
        ResponseObj responseObj = null;
        try {
            Config config = readObject();
            config.setClientSession(clientSession);
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
            responseObj = new ResponseObj("ClientSession",readObject().getClientSession(), ResponseContants.CODE_SUCCESS, ResponseContants.MESSAGE_SUCCESS);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            responseObj = new ResponseObj(ResponseContants.CODE_READ_FILE_ERROR, ResponseContants.MESSAGE_READ_FILE_ERROR);
        }
        return responseObj;
    }
}
