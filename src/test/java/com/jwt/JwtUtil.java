package com.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

public class JwtUtil {

    private final static String ISS = "dust";

    private final static String SECRET = "secret";

    // 过期时间是3600秒，既是1个小时
    private final static long EXPIRATION = 3600;


    /**
     * 生成token
     * @param userId 用户id
     * @return token
     */
    public static String createToken(long userId){
        Algorithm algorithm = Algorithm.HMAC384(SECRET);
        String token = JWT.create()
                .withIssuer(ISS).withIssuedAt(new Date()).withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION * 1000))
                .withClaim("USER_ID",userId)
                .sign(algorithm);

        return token;
    }

    /**
     * 解析token
     * @param token token
     * @return long
     */
    public static long analyzeToken(String token){
        DecodedJWT decode = JWT.decode(token);
        return decode.getClaim("USER_ID").asLong();
    }

    /**
     * 校验token的合法性
     * @param token token
     * @return  boolean
     */
    public static boolean verifyToken(String token){
        Algorithm algorithm = Algorithm.HMAC384(SECRET);
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer(ISS)
                .build(); //Reusable verifier instance
        try {
            // 验证不通过会出现异常
            verifier.verify(token);
        } catch(Exception ex){
            return false;
        }
        return true;
    }
}
