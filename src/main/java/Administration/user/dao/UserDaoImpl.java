package Administration.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import Administration.user.model.User;
@Service
public class UserDaoImpl implements UserDao{
	

	@Autowired
	private MongoOperations mongoOperation;

	@Override
	public void save(User user) {
		System.out.println("save in UserDaoImpl");
		mongoOperation.save(user);
	}

}
