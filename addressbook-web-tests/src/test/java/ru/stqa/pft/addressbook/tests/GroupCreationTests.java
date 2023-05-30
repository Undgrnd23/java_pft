package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test_group_1", "test_header_1", "test_footer_1"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    app.logOut();
  }

}
