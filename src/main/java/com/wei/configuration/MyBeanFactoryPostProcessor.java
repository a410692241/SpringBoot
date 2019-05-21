package com.wei.configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Description: 对一个bean初始化完成的时候进行处理, 所以叫bean工厂后置处理器
 * 以下展示对user这个bean初始化完成之后赋值nickname为huwei
 * @Author: Awake-Hu
 * @Date: 2019/5/21
 */
//@Component
//public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
//        BeanDefinition user = configurableListableBeanFactory.getBeanDefinition("user");
//        MutablePropertyValues propertyValues = user.getPropertyValues();
//        propertyValues.addPropertyValue("nickname", "huwei");
//        user.setScope(BeanDefinition.SCOPE_SINGLETON);
//    }
//}
