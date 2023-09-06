package com.example.read.repository;

import com.example.read.model.MapArt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapArtRepository extends JpaRepository<MapArt,Long> {
}
