package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BrokerAspect {

    /**
     * 定义切入点，切入点为 com.aop.AopController;中的所有函数
     * 通过@PointCut注解声明频繁使用的切入点表达式
     */
//    @Pointcut("execution(public * com.aop.AopController.*(..))")
//    public void brokerAspect(){
//
//    }

//    @Pointcut("execution(public * com.aop..*(..))")
//    public void brokerAspect(){
//
//    }
    /**
     * @description 在连接点执行之前的通知
     */
//    @Before("brokerAspect()")
//    public void doBeforeGame(){
//        System.out.println("经纪人正在处理球星赛前事务！");
//    }
//
//    /**
//     * @description  在连接点执行之后执行的通知（返回通知和异常通知的异常）
//     */
//    @After("brokerAspect()")
//    public void doAfterGame(){
//        System.out.println("经纪人为球星表现疯狂鼓掌！");
//    }
//
//    /**
//     * @description  在连接点执行之后执行的通知（返回通知）
//     */
//    @AfterReturning("brokerAspect()")
//    public void doAfterReturningGame(){
//        System.out.println("返回通知：经纪人为球星表现疯狂鼓掌！");
//    }
//
//    /**
//     * @description  在连接点执行之后执行的通知（异常通知）
//     */
//    @AfterThrowing("brokerAspect()")
//    public void doAfterThrowingGame(){
//        System.out.println("异常通知：球迷要求退票！");
//    }

    /**
     * @description  使用环绕通知
     */
//    @Around("brokerAspect()")
//    public void doAroundGame(ProceedingJoinPoint pjp) throws Throwable {
//        try{
//            System.out.println("经纪人正在处理球星赛前事务！");
//            pjp.proceed();
//            System.out.println("返回通知：经纪人为球星表现疯狂鼓掌！");
//        }
//        catch(Throwable e){
//            System.out.println("异常通知：球迷要求退票！");
//        }
//    }
}
