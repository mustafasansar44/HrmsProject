package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService){
        this.cityService = cityService;
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public DataResult<List<City>> getAll(){
        return this.cityService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody City city){
        return ResponseEntity.ok(this.cityService.add(city));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody City city){
        return ResponseEntity.ok(this.cityService.updateCity(city));
    }
}
