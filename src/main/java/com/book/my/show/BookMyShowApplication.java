package com.book.my.show;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(BookMyShowApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    while (true) {
      // do something
    }
  }
}
