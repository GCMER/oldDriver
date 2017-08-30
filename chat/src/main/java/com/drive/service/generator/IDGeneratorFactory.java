package com.drive.service.generator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Component("idGengeratorFactory")
public class IDGeneratorFactory implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Map<IDGeneratorEnum,IDGeneratorService> services = new HashMap<IDGeneratorEnum,IDGeneratorService>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Collection<IDGeneratorService> serviceImpls = this.applicationContext.getBeansOfType(IDGeneratorService.class).values();
        Iterator<IDGeneratorService> it = serviceImpls.iterator();
        while(it.hasNext())
        {
            IDGeneratorService service = it.next();
            this.services.put(service.getType(),service);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public IDGeneratorService get(IDGeneratorEnum type)
    {
        return services.get(type);
    }
}
