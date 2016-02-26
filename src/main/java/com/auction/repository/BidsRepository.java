package com.auction.repository;

import com.auction.entity.Bids;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidsRepository extends JpaRepository<Bids, Integer> {
}
