package com.pedrom.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedrom.database.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

}
