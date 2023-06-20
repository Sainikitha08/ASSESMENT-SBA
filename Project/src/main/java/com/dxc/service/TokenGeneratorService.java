package com.dxc.service;

import java.util.Map;

import com.dxc.model.UserCredential;

public interface TokenGeneratorService {
	Map<String,String> generateToken(UserCredential user);
}
