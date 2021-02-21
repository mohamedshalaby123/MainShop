package com.example.myapplication2.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication2.adapters.CartListAdapter;
import com.example.myapplication2.models.CartItem;
import com.example.myapplication2.models.Product;
import com.example.myapplication2.repositories.CartRepo;
import com.example.myapplication2.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {

    ShopRepo shopRepo = new ShopRepo();
    CartRepo cartRepo = new CartRepo();

    MutableLiveData<Product> mutableProduct = new MutableLiveData<>();

    // return live data of list of products
    public LiveData<List<Product>> getProducts(){

        return shopRepo.getProducts(); // in model class
    }

    public void setProduct(Product product){
        mutableProduct.setValue(product);
    }

    public LiveData<Product> getProduct(){
        return mutableProduct;
    }

    public LiveData<List<CartItem>> getCart(){
        return cartRepo.getCart();
    }

    public boolean addItemToCart(Product product){
       return cartRepo.addItemToCart(product);
    }

    public void removeItemFromCart(CartItem cartItem){
        cartRepo.removeItemFromCart(cartItem);
    }

    public void changeQuantity(CartItem cartItem, int quantity){
        cartRepo.changeQuantity(cartItem,quantity);
    }

    public LiveData<Double> getTotalPrice(){
        return cartRepo.getTotalPrice();
    }

    public void resetCart(){
        cartRepo.initCart();
    }
}
