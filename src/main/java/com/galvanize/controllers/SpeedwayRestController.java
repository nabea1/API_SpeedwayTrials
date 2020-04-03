package com.galvanize.controllers;

import com.galvanize.entities.Car;
import com.galvanize.entities.Driver;
import com.galvanize.entities.Race;
import com.galvanize.services.SpeedwayService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/speedway")
public class SpeedwayRestController {
    SpeedwayService speedwayService;

    public SpeedwayRestController(SpeedwayService speedwayService) {
        this.speedwayService = speedwayService;
    }

    @PostMapping("/driver")
    public Driver createDriver(@RequestBody Driver driver) {
        return speedwayService.createDriver(driver);
    }

    @GetMapping("/driver/{id}")
    public Driver findDriver(@PathVariable Long id) {
        return speedwayService.findDriverById(id);
    }

    @GetMapping("/driver")
    public List<Driver> findAllDrivers() {
        return speedwayService.findAllDrivers();
    }

    @PutMapping("/driver/{id}")
    public Driver updateDriver(@PathVariable Long id, @RequestBody Driver driver){ return speedwayService.updateDriverById(driver, id);}

    @DeleteMapping("driver/{id}")
    public void delteteDriverById(@PathVariable Long id){ speedwayService.deleteDriverById(id); }

    @PostMapping("/car")
    public Car createCar(@RequestBody Car car){
        return speedwayService.createCar(car);
    }

    @GetMapping("/car/{id}")
    public Car findCarById(@PathVariable Long id){
        return speedwayService.findCarById(id);
    }

    @GetMapping("/car")
    public List<Car> findAllCars(){
        return speedwayService.findAllCars();
    }

    @PutMapping("/car/{id}")
    public Car updateCarById(@PathVariable Long id, @RequestBody Car car){
        return speedwayService.updateCarById(id, car);
    }

    @DeleteMapping("/car/{id}")
    public void deleteCarById(@PathVariable Long id){
        speedwayService.deleteCarById(id);
    }

    @PostMapping("/race")
    public Race createRace(@RequestBody Race race){
        return speedwayService.createRace(race);
    }

    @GetMapping("/race/{id}")
    public Race findRaceById(@PathVariable Long id){
        return speedwayService.findRaceById(id);
    }

    @GetMapping("/race")
    public List<Race> findAllRaces(){
        return speedwayService.findAllRaces();
    }

    @PutMapping("/race/{id}")
    public Race updateRaceById(@PathVariable Long id, @RequestBody Race race){
        return speedwayService.updateRaceById(id, race);
    }

    @DeleteMapping("/race/{id}")
    public void deleteRaceById(@PathVariable Long id){
        speedwayService.deleteCarById(id);
    }
}
