package com.youtube.mysmartside;

public class Comments {
  // This is an end-of-line comment
  int i;
  /* This is a multi-
  line comment */
  public void method() {
    for(i = 0; /*although allowed, not recommended*/ i < 10; i++) {
      System/*access the system*/.out/*get the output stream*/.println/*write a line*/(i);
      // tip: don't put /**/ comments in the middle of line for readibility
    }
  }
}
