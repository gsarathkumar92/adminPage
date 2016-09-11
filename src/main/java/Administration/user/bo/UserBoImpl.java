package Administration.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Administration.user.dao.UserDao;
import Administration.user.model.User;

@Service(value="dao")
public class UserBoImpl implements UserBo {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(String fname, String lname) {
		System.out.println("Save in UserBoImpl");
		User u=new User();
		u.setFname(fname);
		u.setLname(lname);
		userDao.save(u);

	}

	

}
