package com.yeqifu.proxy;

/**
 * @author: yeqifu
 * @date: 2023/2/14 11:22
 */
public class ProxyTest {
    public static void main(String[] args) {
        ProxyOwner proxyOwner = new ProxyOwner(new Owner());
        proxyOwner.doRenovation();
    }
}
