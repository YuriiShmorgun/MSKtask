package model.service.factory;

import model.service.IService;
import model.service.ParseByReg;

public class ParseByRegFactory implements IServiceFactory{
    @Override
    public IService createService() {
        return new ParseByReg();
    }
}
