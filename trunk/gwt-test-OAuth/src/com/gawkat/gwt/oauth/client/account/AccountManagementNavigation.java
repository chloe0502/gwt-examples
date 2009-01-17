package com.gawkat.gwt.oauth.client.account;

import com.gawkat.gwt.oauth.client.global.QueryStringData;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AccountManagementNavigation {

  // using historyToken for navigation, with parameters
  private QueryStringData qsd = null;

  private VerticalPanel pWidget = new VerticalPanel();

  /**
   * constructor - init account navigation system. How to render the account
   * widgets
   */
  public AccountManagementNavigation() {

    pWidget.setWidth("100%");

    // set up the div it will render in
    setDiv();
    
  }
  
  public void setQueryStringData(QueryStringData qsd) {
    this.qsd = qsd;
    
    // navigate through the widgets that the user wants
    navigate();
  }

  /**
   * where will the accountmangement widgets render
   */
  public void setDiv() {

    String div = "AccountManagement";

    try {
      RootPanel.get(div).isAttached();
    } catch (Exception e) {
      System.out.println("Div missing for account management");
    }
    
    RootPanel.get(div).add(pWidget);
  }

  /**
   * render/draw the widgets according to the url 
   * 
   * reserved 
   * account_Login for LoginUi
   * account_ForgotPassword for LoginUi
   * account_Create for LoginUi
   *
   */
  private void navigate() {
    
    String historyToken = qsd.getHistoryToken();
   
    if (historyToken.equals("account_Wizard")) { //  account creation wizard
      // TODO
      
    } else if (historyToken.equals("account_Profile")) { // user profile
      // TODO 
      
    } else if (historyToken.equals("account_Friends")) { // user friends
      // TODO
      
    }
    
  }


}
