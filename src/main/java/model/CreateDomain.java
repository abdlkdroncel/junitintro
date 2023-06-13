package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public interface CreateDomain <T>{

    T createDomain();

    @Test
    default void createDomainShuldBeImplmeneted(){
        Assertions.assertNotNull(createDomain());
    }
}
