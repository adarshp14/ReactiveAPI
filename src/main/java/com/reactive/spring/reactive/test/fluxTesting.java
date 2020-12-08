package com.reactive.spring.reactive.test;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class fluxTesting {

    @Test
    public void testingFLux()
    {
        Flux<String> stringFlux=Flux.just("Adarsh","Naman","Pragati");
        stringFlux.subscribe(System.out::println);
    }

    @Test
    public void monoTest()
    {
        Mono<String> stringMono=Mono.just("Coding");
        stringMono.subscribe(System.out::println);

    }
}
