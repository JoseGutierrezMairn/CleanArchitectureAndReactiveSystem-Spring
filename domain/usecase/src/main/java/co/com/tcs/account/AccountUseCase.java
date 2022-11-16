package co.com.tcs.account;

import co.com.tcs.account.gateway.AccountRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class AccountUseCase {

    private AccountRepository accountRepository ;

    public Mono<Account> get(Long number, String type){

        return accountRepository.get(number, type);

    }

}
