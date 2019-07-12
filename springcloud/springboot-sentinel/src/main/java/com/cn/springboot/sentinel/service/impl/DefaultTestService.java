package com.cn.springboot.sentinel.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cn.springboot.sentinel.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author lzf
 * desc
 * date 2019/7/11-17:54
 */
@Service
public class DefaultTestService implements TestService {



    /*// 对应的 `handleException` 函数需要位于 `ExceptionUtil` 类中，并且必须为 static 函数.
    @SentinelResource(value = "test", blockHandler = "handleException", blockHandlerClass = {ExceptionUtil.class})
    public void test() {
        System.out.println("Test");
    }*/

    @Override
    @SentinelResource(value = "flowTest", blockHandler = "handleException", fallback = "helloFallback")
    public String test() {
        return "hello sentinel service";
    }

    public String handleException(BlockException ex) {
        ex.printStackTrace();
        return "Oops, error occurred at ";
    }

    // Fallback 函数，函数签名与原函数一致或加一个 Throwable 类型的参数.
    public String helloFallback() {
        return "huitui";
    }
}
