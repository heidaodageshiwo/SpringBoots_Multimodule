package com.zhangqiang.mmrepo;

import com.zhangqiang.mmentity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}