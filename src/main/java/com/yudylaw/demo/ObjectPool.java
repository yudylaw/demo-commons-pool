package com.yudylaw.demo;

/**
 * @author liuyu3@xiaomi.com
 * @since 2015年3月3日
 */

public interface ObjectPool<T> {
    
    public void addObject();
    
    public T borrowObject();
    
    public void returnObject(T o);
    
    public void close();
    
}
