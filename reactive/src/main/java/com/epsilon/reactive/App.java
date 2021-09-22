package com.epsilon.reactive;

import reactor.core.publisher.Flux;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Flux<Integer> publisher = Flux.just(1,2,3,4,5,6);
        
        publisher.map(x -> x*x).filter(x -> x%2 == 0).subscribe(System.out::println);
        //publisher.log().subscribe(System.out::println);
    }
}
