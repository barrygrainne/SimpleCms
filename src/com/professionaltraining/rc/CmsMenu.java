package com.professionaltraining.rc;

public class CmsMenu {

	// properties
	private MenuItem[] menu;
	private boolean loggedIn;

	// get & set methods

	public MenuItem[] getMenu() {
		return menu;
	}

	public void setMenu(MenuItem[] menu) {
		this.menu = menu;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	// constructor(s)
	public CmsMenu() {
		menu = new MenuItem[7];

		menu[0] = new MenuItem("Home", "index.jsp", true, true, false);
		menu[1] = new MenuItem("Products", "products.jsp", true, true, true);
		menu[2] = new MenuItem("About", "about.jsp", true, true, true);
		menu[3] = new MenuItem("Contact us", "contact.jsp", true, true, true);
		menu[4] = new MenuItem("Logout", "logout.jsp", true, false, true);
		menu[5] = new MenuItem("Test", "test.jsp", false, true, true);
		menu[6] = new MenuItem("New Item", "new.jsp", false, true, true);

	}

	// other methods
	public String getTopMenu() {
		
		String html = "";

		for (int i = 0; i < menu.length; i++) {


			if (menu[i].isTopMenu()) {

				if ((menu[i].isLoggedIn() && loggedIn) || (menu[i].isLoggedIn() == false)) {
					html = html + "<div class='navitem'>" + menu[i].getLink() + "</div>";
				}
			}
		}

		html = html + "";
		return html;
	
	}

	public String getSideMenu() {
		String html = "<ul class='leftnav'>";

		for (int i = 0; i < menu.length; i++) {


			if (menu[i].isSideMenu()) {

				if ((menu[i].isLoggedIn() && loggedIn) || (menu[i].isLoggedIn() == false)) {
					html = html + "<li>" + menu[i].getLink() + "</li>";
				}
			}
		}

		html = html + "</ul>";
		return html;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CmsMenu cmsMenu = new CmsMenu();
		
		cmsMenu.setLoggedIn(true);
		
		System.out.println(cmsMenu.getTopMenu()); // <div><a
		// href='home.jsp'>Home</div>
		System.out.println(cmsMenu.getSideMenu()); // <ul><li><a
													// href='home.jsp'>Home</a></li><li>...
	}

}
