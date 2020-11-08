package problem2.service;

import org.springframework.stereotype.Service;

@Service
public class ThrowExceptionImpl implements ThrowException{
    @Override
    public void throwNullpointerException(){throw new NullPointerException();}
}
