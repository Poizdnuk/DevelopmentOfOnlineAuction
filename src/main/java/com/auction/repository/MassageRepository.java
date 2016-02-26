package com.auction.repository;

import com.auction.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MassageRepository extends JpaRepository<Message, Integer> {
}
