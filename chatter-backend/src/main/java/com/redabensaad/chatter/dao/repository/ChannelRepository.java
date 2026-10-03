package com.redabensaad.chatter.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redabensaad.chatter.dao.entity.Channel;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

}
