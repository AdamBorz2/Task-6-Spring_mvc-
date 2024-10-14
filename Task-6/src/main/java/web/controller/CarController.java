package web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getAllCars() {
        return "Список всех машин";
    }

    @GetMapping("/{id}")
    public String getCarById(@PathVariable Long id) {
        return "Информация об автомобиле с ID: " + id;
    }

    @PostMapping
    public String createCar() {
        return "Автомобиль успешно создан";
    }

    @PutMapping("/{id}")
    public String updateCar(@PathVariable Long id) {
        return "Информация об автомобиле с ID: " + id + " успешно обновлена";
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable Long id) {
        return "Автомобиль с ID: " + id + " успешно удален";
    }
}



