package co.com.tcs.account;

import co.com.tcs.account.gateway.AccountRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class AccountAdapter implements AccountRepository {

    @Override
    public Mono<Account> get(Long number, String type) {
        return Mono.just(Account.builder()
                .number(number)
                .type(type)
                .balance(50000)
                .status(true)
                .build());
    }
}
