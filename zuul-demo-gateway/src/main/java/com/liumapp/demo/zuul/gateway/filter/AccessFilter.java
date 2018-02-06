package com.liumapp.demo.zuul.gateway.filter;


import com.netflix.zuul.ZuulFilter;

/**
 * Created by liumapp on 2/6/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }

}
