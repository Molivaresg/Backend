package com.springboot.headers;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

@Component
public class PreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1; 
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
     
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.addZuulRequestHeader("X-Request-ID", "valor-del-encabezado");
        return null;
    }
}
