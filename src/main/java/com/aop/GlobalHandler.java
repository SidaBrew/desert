package com.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *  Created by shao.guangze on 2020/5/24
 */
@Aspect
@Component
public class GlobalHandler {
    private static final Log log = LogFactory.getLog(GlobalHandler.class);

    //切入点：拦截自定义注解
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
//    public void annotationPoinCut(){}

//  @Around("annotationPoinCut()")
//  public Object doAroundGameData(ProceedingJoinPoint pjp) throws Throwable {

    @Around("@annotation(requestMapping)")
    public Object doAroundGameData(ProceedingJoinPoint pjp,RequestMapping requestMapping) throws Throwable {
        try{

            Object proceed = pjp.proceed();
            return  proceed;
        }
        catch(Throwable e){

            log.error("出错了:{}"+e.getMessage());
            return  "failed";
        }
    }

}
