package com.professionaltraining.rc;

public class MenuItem {
	
	// properties
	private String name;
	private String url;
	private boolean topMenu;
	private boolean sideMenu;
	private boolean loggedIn;
	
	// get & set methods
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isTopMenu() {
		return topMenu;
	}

	public void setTopMenu(boolean topMenu) {
		this.topMenu = topMenu;
	}

	public boolean isSideMenu() {
		return sideMenu;
	}

	public void setSideMenu(boolean sideMenu) {
		this.sideMenu = sideMenu;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	// constructor (s)
	
	public MenuItem(String name, String url, boolean topMenu, boolean sideMenu, boolean loggedIn) {
		super(); // super is to do with inheritance
		this.name = name;
		this.url = url;
		this.topMenu = topMenu;
		this.sideMenu = sideMenu;
		this.loggedIn = loggedIn;
	}
	
	// other methods
	public String getLink() {
		String link = "<a href='" + url + "'>" + name + "</a>";
		return link;
	}

	

	public static void main(String[] args) {

			MenuItem home = new MenuItem("Home", "index.jsp",
										true, true, false);
			System.out.println(home.getLink());
			// <a href="index.jsp">Home</a>

	}

	

}
