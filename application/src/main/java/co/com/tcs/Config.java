package co.com.tcs;


import co.com.tcs.account.AccountUseCase;
import co.com.tcs.account.gateway.AccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    AccountUseCase accountUseCase(AccountRepository accountRepository){

        return new AccountUseCase(accountRepository);
    }
}
