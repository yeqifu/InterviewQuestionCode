package com.yeqifu.proxy;

/**
 * @author: yeqifu
 * @date: 2023/2/14 11:20
 */
public class ProxyOwner implements Decoration{

    private Owner owner;

    public ProxyOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void doRenovation() {
        System.out.println("找人施工...");
        owner.doRenovation();
        System.out.println("交付...");
    }
}
