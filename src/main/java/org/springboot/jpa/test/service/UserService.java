package org.springboot.jpa.test.service;

import org.springboot.jpa.test.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/716:34
 */
public interface UserService extends JpaRepository<UserEntity,Long> {
}
