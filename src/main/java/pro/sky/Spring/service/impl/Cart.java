package pro.sky.Spring.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import org.yaml.snakeyaml.events.Event;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Cart {

    private final Set<Integer> goods = new HashSet<>();

    public Set<Integer> add(List<Integer> IDs) {
        goods.addAll(IDs);
        return goods;
    }

    public Set<Integer> get() {
        return new HashSet<>(goods);
    }
}

