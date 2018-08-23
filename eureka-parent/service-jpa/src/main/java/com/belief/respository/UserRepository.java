package com.belief.respository;

import com.belief.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo,Long> {

    public UserInfo findByName(String name);
}
