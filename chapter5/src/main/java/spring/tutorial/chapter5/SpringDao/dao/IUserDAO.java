package spring.tutorial.chapter5.SpringDao.dao;

import spring.tutorial.chapter5.SpringDao.model.User;

import java.util.List;

public interface IUserDAO {
  public List<User> QueryAllUser();

  public Boolean AddUser(User user);

  public Boolean transfer(int fromUserId, int toUserId, float transferMoney);
}
