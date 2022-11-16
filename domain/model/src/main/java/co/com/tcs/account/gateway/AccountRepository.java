package co.com.tcs.account.gateway;

import co.com.tcs.account.Account;
import reactor.core.publisher.Mono;

public interface AccountRepository {

    public Mono<Account> get(Long number, String type);


}
