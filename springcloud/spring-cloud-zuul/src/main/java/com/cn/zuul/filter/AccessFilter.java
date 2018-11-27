package com.cn.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: lzf
 * @Date: 2018/11/27 0027 15:36
 * @Description:
 */
@Component
public class AccessFilter extends ZuulFilter {

    /****
     * filterType 过滤器类型(pre:请求前被执行 routing:路由请求时被调用 post:在routing和error过滤器之后被调用 error:在请求发生错误时候被调用 )
     * filterOrder 通过int值来定义过滤器的执行顺序，数值越小 优先级越高
     * shouldFilter 是否执行该过滤器
     * run  过滤器具体执行逻辑
     * @return
     */


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("前置过滤器AccessFilter被执行了");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();
        if (request.getParameter("token") == null) {
            ctx.setSendZuulResponse(false); //令zuul过滤该请求，不对其进行路由
            ctx.setResponseStatusCode(401); //设置返回的错误码
            response.setCharacterEncoding("UTF-8");
            ctx.setResponse(response);
            ctx.setResponseBody("token异常");
        }
        return null;
    }
}
