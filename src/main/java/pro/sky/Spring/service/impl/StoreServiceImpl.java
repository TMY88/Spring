package pro.sky.Spring.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.Spring.service.StoreService;

import java.util.List;
import java.util.Set;

@Service
public class StoreServiceImpl implements StoreService {

    private final Cart cart;

    public StoreServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override

    public Set<Integer> add(List<Integer> IDs) {
        return cart.add(IDs);
    }

    @Override
    public Set<Integer> get() {
        return cart.get();
    }
}
