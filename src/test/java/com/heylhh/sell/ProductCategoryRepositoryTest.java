package com.heylhh.sell;

import com.heylhh.sell.dataobject.ProductCategory;
import com.heylhh.sell.repository.ProductCategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOne() {
        ProductCategory one = productCategoryRepository.findOne(1);
        System.out.println(one.toString());
    }

    @Test
    public void SaveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);
        productCategoryRepository.save(productCategory);
    }
}
