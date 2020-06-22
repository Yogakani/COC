package com.yoga.coc.service;

import com.yoga.coc.coc.ClashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocServiceImpl implements CocService {

    @Autowired
    private ClashService clashService;

    @Override
    public String getPlayerProfile(String token, String playerTag) {
        return clashService.getPlayerProfile(playerTag,token);
    }
}
