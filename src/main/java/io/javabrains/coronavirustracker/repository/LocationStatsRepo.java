package io.javabrains.coronavirustracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.coronavirustracker.models.LocationStats;


@Repository
public interface LocationStatsRepo extends JpaRepository<LocationStats, Integer> {
	List<LocationStats> findByState(String state);
}
