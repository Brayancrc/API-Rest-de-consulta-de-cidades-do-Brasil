package com.github.brayancrc.staties.repositories;

import com.github.andrelugomes.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
