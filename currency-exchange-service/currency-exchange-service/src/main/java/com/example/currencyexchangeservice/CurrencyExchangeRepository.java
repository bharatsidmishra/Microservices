package com.example.currencyexchangeservice;

import io.micrometer.core.instrument.cumulative.CumulativeFunctionTimer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {

    CurrencyExchange findByFromAndTo(String from , String to);
}
