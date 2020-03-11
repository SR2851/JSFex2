package Model;

import javax.faces.bean.ManagedBean;

import DAO.IUserDAO;
import DAO.UserDAO;
@ManagedBean(name="gu")
public class GestionUser {
	
	private User user=new User();
	private IUserDAO dao= new UserDAO();
	
	public String ajoutUser() {
		if(dao.addUser(user)==1) {
			return "pageLogin";
		}
		else {
			return "erreur";
		}
	}
	
	public String verifConnection() {
		if(dao.findUser(user)==null) {
			return "Erreur";
		}
		else{
			return "Accueil";
		}
	}
	
	
	public GestionUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
