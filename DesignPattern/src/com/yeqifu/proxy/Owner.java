package com.yeqifu.proxy;

/**
 * 业主
 *
 * @author: yeqifu
 * @date: 2023/2/14 11:18
 */
public class Owner implements Decoration{

    @Override
    public void doRenovation() {
        System.out.println("给钱装修...");
    }
}
