package com.springboot.headers;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

@Component
public class PostFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
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
        ctx.getResponse().getHeaderNames().forEach(headerName -> {
         
            if (headerName.startsWith("X-Sensible-Header")) {
                ctx.getResponse().getHeader(headerName);
            }
        });
        return null;
    }
}

