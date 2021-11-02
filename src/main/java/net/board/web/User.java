package net.board.web;

public class User {
	private String email;
	private String nickname;
	private String password;

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}

		
}
