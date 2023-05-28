package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test_group_1", "test_header_1", "test_footer_1"));
    submitGroupCreation();
    returnToGroupPage();
    logOut();
  }

}
