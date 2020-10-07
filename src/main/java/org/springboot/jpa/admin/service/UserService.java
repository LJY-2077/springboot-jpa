package org.springboot.jpa.admin.service;

import org.springboot.jpa.admin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/716:34
 */
public interface UserService extends JpaRepository<User,String> {
}
