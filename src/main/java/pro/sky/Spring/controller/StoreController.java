package pro.sky.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Spring.service.StoreService;

import java.util.Set;
import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> IDs) {
        return storeService.add(IDs);
    }

    @GetMapping("/get")
    public Set<Integer> get() {
        return storeService.get();
    }
}
