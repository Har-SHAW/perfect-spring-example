package com.example.demo.utility;

import com.example.demo.exception.ShawException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect
{

    private static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);

    @AfterThrowing(pointcut = "execution(* com.example.demo.service.*Impl.*(..))", throwing = "exception")
    public void logServiceException(ShawException exception)
    {
        // code
        LOGGER.error(exception.getMessage(), exception);
    }

}
