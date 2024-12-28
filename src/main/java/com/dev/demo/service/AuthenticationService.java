package com.dev.demo.service;

import com.dev.demo.dto.request.AuthenticationRequest;
import com.dev.demo.dto.request.IntrospectRequest;
import com.dev.demo.dto.response.AuthenticationResponse;
import com.dev.demo.dto.response.IntrospectResponse;
import com.nimbusds.jose.JOSEException;

import java.text.ParseException;

public interface AuthenticationService {
    AuthenticationResponse authenticate(AuthenticationRequest request);

    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;
}
