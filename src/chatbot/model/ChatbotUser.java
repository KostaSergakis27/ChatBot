package chatbot.model;
//four data members
//at least two different types (String, int, boolean, double...)
public class ChatbotUser
{
	private String userName;
	private int userAge;
	private int userWeight;
	private boolean playsSports;
	private boolean isMale;
	
	public ChatbotUser()
	{
		this.userName = "";
		this.userAge = -999;
		this.userWeight = -27;
		this.playsSports = false;
		this.isMale = false;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public int getUserAge()
	{
		return userAge;
	}

	public void setUserAge(int userAge)
	{
		this.userAge = userAge;
	}
	
	public int getUserWeight()
	{
		return userWeight;
	}
	
	public void setUserWeight(int userWeight)
	{
		this.userWeight = userWeight;
	}

	public boolean isPlaysSports()
	{
		return playsSports;
	}

	public void setPlaysSports(boolean playsSports)
	{
		this.playsSports = playsSports;
	}

	public boolean isMale()
	{
		return isMale;
	}

	public void setMale(boolean isMale)
	{
		this.isMale = isMale;
	}
}
