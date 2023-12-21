package com.unit.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GSTServiceTest {

    @Mock
    private GSTProvider mockProvider;

    @InjectMocks
    private GSTService gstService;

//    we can also use @ExtendWith(MockitoExtension.class) on class to openMocks
//@ExtendWith is a repeatable annotation that is used to register extensions for the annotated test class, test interface, test method, parameter, or field.
//    Annotated parameters are supported in test class constructors, in test methods, and in @BeforeAll, @AfterAll, @BeforeEach, and @AfterEach lifecycle methods.
//    @ExtendWith fields may be either static or non-static.

//    @BeforeEach
//    public void init(){
//        MockitoAnnotations.openMocks(this);
//    }

    @Test
    public void getCalculateTest(){
//        GSTProvider provider=new GSTProviderImpl();
//        GSTProvider mockProvider = Mockito.mock(GSTProvider.class);
//        GSTService gstService=new GSTService(mockProvider);

//        important line
        Mockito.when(mockProvider.getGSTDetail()).thenReturn(18);

        int actualResult = gstService.calculateGST();
        Assertions.assertEquals(18,actualResult,"GST rate test fail!!");
    }
}

//    stub test
//class GSTProviderImpl implements GSTProvider{
//    @Override
//    public int getGSTDetail() {
//        return 18;
//    }
//}
