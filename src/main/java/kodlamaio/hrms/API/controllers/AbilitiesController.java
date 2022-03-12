package kodlamaio.hrms.API.controllers;

import kodlamaio.hrms.Business.abstracts.AbilityService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Ability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/abilities")
public class AbilitiesController {

    private AbilityService abilityService;

    @Autowired
    public AbilitiesController(@RequestParam AbilityService abilityService){
        this.abilityService=abilityService;
    }

    @GetMapping("/getAll")
    DataResult<List<Ability>> getAll(){
        return this.abilityService.getAll();
    }

    @GetMapping("/getAllByDescriptionContains")
    DataResult<List<Ability>> getAllByDescriptionContains(@RequestParam String descrpition){
        return this.abilityService.getAllByDescriptionContains(descrpition);
    }


    @PostMapping("/add")
    Result add(@RequestBody Ability ability){
       return this.abilityService.add(ability);
    }

}
