package kodlamaio.hrms.API.controllers;

import kodlamaio.hrms.Business.abstracts.LanguageService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/add")
    Result add(@RequestBody Language language){
        return this.languageService.add(language);
    }

    @GetMapping("/getByOrderByLevelAsc")
    DataResult<List<Language>> getByOrderByLevelAsc(){
        return this.languageService.getByOrderByLevelAsc();
    }

    @GetMapping("/getAll")
    DataResult<List<Language>> getAll(){
        return this.languageService.getAll();
    }

}
