package com.nishasoni.service;

import com.nishasoni.dto.LoginDto;
import com.nishasoni.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}