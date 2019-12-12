package com.sidabw;

import org.junit.Test;

public class JWTTests {

    @Test
    public void createTokenTest(){
        String token = JwtUtil.createToken(12345678);
        System.out.println(token); // eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJpc3MiOiJkdXN0IiwiVVNFUl9JRCI6MTIzNDU2Nzh9.qUNgiHKB5uIWhhpf8GM6hdcaE9hTvDJG9UmmMpcCPpfncduQ713aKI7VMhCedJWP
    }

    @Test
    public void decodeTokenTest(){
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJpc3MiOiJkdXN0IiwiVVNFUl9JRCI6MTIzNDU2Nzh9.qUNgiHKB5uIWhhpf8GM6hdcaE9hTvDJG9UmmMpcCPpfncduQ713aKI7VMhCedJWP";
        System.out.println(JwtUtil.analyzeToken(token)); // 12345678
    }

    @Test
    public void verifyTokenTest(){
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJpc3MiOiJkdXN0IiwiVVNFUl9JRCI6MTIzNDU2Nzh9.qUNgiHKB5uIWhhpf8GM6hdcaE9hTvDJG9UmmMpcCPpfncduQ713aKI7VMhCedJWP";
        System.out.println(JwtUtil.verifyToken(token)); // true
    }
}
