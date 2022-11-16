package co.com.tcs.account;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/account", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountService {

    @Autowired
    private AccountUseCase accountUseCase;


    @GetMapping(value = "/getAccount")
    public Mono<Account> get(@RequestParam Long number, @RequestParam String type){
        return accountUseCase.get(number, type);
    }


}
