package com.wzy.study.design.adapt;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/30 17:44
 * @Desc:
 */

public class JDKAdapt {
    public static void main(String[] args) {
        //
        new DispatcherServlet(new WebApplicationContext() {
            @Override
            public ServletContext getServletContext() {
                return null;
            }

            @Override
            public String getId() {
                return null;
            }

            @Override
            public String getApplicationName() {
                return null;
            }

            @Override
            public String getDisplayName() {
                return null;
            }

            @Override
            public long getStartupDate() {
                return 0;
            }

            @Override
            public ApplicationContext getParent() {
                return null;
            }

            @Override
            public AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException {
                return null;
            }

            @Override
            public BeanFactory getParentBeanFactory() {
                return null;
            }

            @Override
            public boolean containsLocalBean(String name) {
                return false;
            }

            @Override
            public boolean containsBeanDefinition(String beanName) {
                return false;
            }

            @Override
            public int getBeanDefinitionCount() {
                return 0;
            }

            @Override
            public String[] getBeanDefinitionNames() {
                return new String[0];
            }

            @Override
            public String[] getBeanNamesForType(ResolvableType type) {
                return new String[0];
            }

            @Override
            public String[] getBeanNamesForType(ResolvableType type, boolean includeNonSingletons, boolean allowEagerInit) {
                return new String[0];
            }

            @Override
            public String[] getBeanNamesForType(Class<?> type) {
                return new String[0];
            }

            @Override
            public String[] getBeanNamesForType(Class<?> type, boolean includeNonSingletons, boolean allowEagerInit) {
                return new String[0];
            }

            @Override
            public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
                return null;
            }

            @Override
            public <T> Map<String, T> getBeansOfType(Class<T> type, boolean includeNonSingletons, boolean allowEagerInit) throws BeansException {
                return null;
            }

            @Override
            public String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType) {
                return new String[0];
            }

            @Override
            public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType) throws BeansException {
                return null;
            }

            @Override
            public <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType) throws NoSuchBeanDefinitionException {
                return null;
            }

            @Override
            public Object getBean(String name) throws BeansException {
                return null;
            }

            @Override
            public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
                return null;
            }

            @Override
            public Object getBean(String name, Object... args) throws BeansException {
                return null;
            }

            @Override
            public <T> T getBean(Class<T> requiredType) throws BeansException {
                return null;
            }

            @Override
            public <T> T getBean(Class<T> requiredType, Object... args) throws BeansException {
                return null;
            }

            @Override
            public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType) {
                return null;
            }

            @Override
            public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType) {
                return null;
            }

            @Override
            public boolean containsBean(String name) {
                return false;
            }

            @Override
            public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
                return false;
            }

            @Override
            public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
                return false;
            }

            @Override
            public boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException {
                return false;
            }

            @Override
            public boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException {
                return false;
            }

            @Override
            public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
                return null;
            }

            @Override
            public Class<?> getType(String name, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
                return null;
            }

            @Override
            public String[] getAliases(String name) {
                return new String[0];
            }

            @Override
            public void publishEvent(Object o) {

            }

            @Override
            public String getMessage(String s, Object[] objects, String s1, Locale locale) {
                return null;
            }

            @Override
            public String getMessage(String s, Object[] objects, Locale locale) throws NoSuchMessageException {
                return null;
            }

            @Override
            public String getMessage(MessageSourceResolvable messageSourceResolvable, Locale locale) throws NoSuchMessageException {
                return null;
            }

            @Override
            public Environment getEnvironment() {
                return null;
            }

            @Override
            public Resource[] getResources(String locationPattern) throws IOException {
                return new Resource[0];
            }

            @Override
            public Resource getResource(String location) {
                return null;
            }

            @Override
            public ClassLoader getClassLoader() {
                return null;
            }
        });
    }
}
