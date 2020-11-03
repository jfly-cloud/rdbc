package com.jfly.repository;

import com.jfly.entity.PanamaEndorsementForm;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactivePanamaEndorsementFormRepository extends ReactiveSortingRepository<PanamaEndorsementForm, Long> {

    Mono<PanamaEndorsementForm> findByTrackingId(String trackingId);

    Mono<Integer>  deleteByTrackingId(String trackingId);

    Flux<PanamaEndorsementForm> findByUserId(String userId, Pageable pageable);

    @Modifying
    @Query("UPDATE person SET firstname = :firstname where lastname = :lastname")
    Mono<Integer> setFixedFirstnameFor(String firstname, String lastname);


}
