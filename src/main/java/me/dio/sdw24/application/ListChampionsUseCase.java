
package me.dio.sdw24.application;
import java.util.List;

import org.springframework.stereotype.Service;

import me.dio.sdw24.domain.model.Champions;
import me.dio.sdw24.domain.ports.ChampionsRepository;


@Service

public record ListChampionsUseCase (ChampionsRepository repository) {
    public List<Champions> findAll(){
        return repository.findAll();
    }
}
