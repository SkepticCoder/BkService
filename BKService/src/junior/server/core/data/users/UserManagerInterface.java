package junior.server.core.data.users;

import java.util.HashMap;
import java.util.Map;

public interface UserManagerInterface {	
	/**
	 * 
	 * @param login
	 * @return true - пользователь с таким логином существует
	 */
	public boolean conteinsUser(String login);
	
	/**
	 * Меняет логин, если новый логин ещё не занят и подходит (по длине пока что)
	 * @param login - старый логин
	 * @param new_login - новый логин
	 * @return 
	 */
	public boolean changeLogin(String login, String new_login);
	
	/**
	 * Создаёт и добавляет пользователя с заданными параметрами. Так же 
	 * 
	 * 
	 * @param new_login
	 * @param new_name
	 * @param new_surname
	 * @param new_password
	 * @param new_bank_account
	 * @return true - если пользователь создан удачно. Иначе - false
	 */
	public boolean createUser(String new_login, String new_name, String new_surname, 
			String new_password, String new_bank_account);
	
	/**
	 * 
	 * @param login
	 * @return объект пользователя (не желательно, изменение данных 
	 * через его интерфейсы  
	 */
	public UserInterface getUser(String login);
	
	/**
	 * 
	 * @param login
	 * @param new_name
	 * @param new_surname
	 * @param new_password
	 * @param new_bank_account
	 * @return
	 */
	public boolean changeUserData(String login, String new_name, 
			String new_surname, String new_password, String new_bank_account);
	
}












