package com.yudylaw.demo;


/**
 * @author liuyu3@xiaomi.com
 * @since 2015年3月3日
 */

public interface ObjectPoolFactory<T> {

    public ObjectPool<T> createPool();
    
}
