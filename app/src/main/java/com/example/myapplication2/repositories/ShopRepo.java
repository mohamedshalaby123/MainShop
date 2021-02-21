package com.example.myapplication2.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication2.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {
    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts(){
        if (mutableProductList == null){
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone",690.0,false,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "iMac",1299.0,true,"https://homepages.cae.wisc.edu/~ece533/images/cat.png"));
        mutableProductList.setValue(productList);
    }
}
