package com.aop.annotation;

import com.utils.StringUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

@Aspect
@Component
public class LogAspect {

    //切入点：拦截自定义注解
    @Pointcut("@annotation(com.aop.annotation.Action)")
    public void annotationPoinCut(){}

//    @After("annotationPoinCut()")
//    public void after(JoinPoint joinPoint){
//
//        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
//        Method method = signature.getMethod();
//        Action annotation = method.getAnnotation(Action.class);
//        System.out.println("注解式拦截 "+annotation.name());
//    }

//    @Before("execution(public * com.aop.annotation.DemoMethodService.*(..))")
//    public void befor(JoinPoint joinPoint){
//
//        MethodSignature signature =  (MethodSignature)joinPoint.getSignature();
//        Method method = signature.getMethod();
//
//        System.out.println("方法规则式拦截,"+method.getName());
//    }

    /**
     * 增强的方法
     */
    @Around("annotationPoinCut()")
    public void doAroundGameData(ProceedingJoinPoint pjp) throws Throwable {
        try{
            //TODO 查询Redis
            //连接本地的 Redis 服务
            Jedis jedis = new Jedis("localhost");
            String runoobkey = jedis.get("runoobkey");
            //TODO 判断Redis是否有数据
            if(StringUtil.notNullOrEmpty(runoobkey)){

                //TODO 如果有返回 没有则去查询数据库接口
                System.out.printf("redis中有数据直接返回给页面");
            }else{
                pjp.proceed();
                //TODO 将数据添加到Redis
            }

        }
        catch(Throwable e){
            System.out.println("异常通知");
        }
    }
}