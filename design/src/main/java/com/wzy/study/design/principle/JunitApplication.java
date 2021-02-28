package com.wzy.study.design.principle;

import java.util.ArrayList;
import java.util.List;

public class JunitApplication {

  public static final void main(String[] args) {
    JunitApplication application = new JunitApplication();
    application.register(new UserServiceTest());
    application.register(new UserServiceTest());



  }

  private List<UserServiceTest> testCases = new ArrayList<>();

    public void register(UserServiceTest testCase) {
        testCases.add(testCase);
    }
}