package pro.sky.Spring.service;

import java.util.List;
import java.util.Set;

public interface StoreService {
    Set<Integer> add(List<Integer> IDs);

    Set<Integer> get();
}
