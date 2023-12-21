package com.unit.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GSTServiceTest {

    @Test
    public void getCalculateTest(){
//        GSTProvider provider=new GSTProviderImpl();
        GSTProvider provider = Mockito.mock(GSTProvider.class);
        GSTService gstService=new GSTService(provider);

//        important line
        Mockito.when(provider.getGSTDetail()).thenReturn(18);

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
