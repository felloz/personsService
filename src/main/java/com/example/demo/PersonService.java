/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;

public interface PersonService {
   List<Person>show();
   Person showId(int id);
   Person add(Person p);
   Person edit(Person p);
   Person delete(int id);
}
