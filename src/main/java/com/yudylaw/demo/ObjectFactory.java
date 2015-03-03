package com.yudylaw.demo;

/**
 * @author liuyu3@xiaomi.com
 * @since 2015年3月3日
 */

public interface ObjectFactory<T> {

    public T makeObject();
    
    public void activateObject(T obj);
    
    public void passivateObject(T obj);
    
    public boolean validateObject(T obj);
    
    public void destroyObject(T obj);
    
}
