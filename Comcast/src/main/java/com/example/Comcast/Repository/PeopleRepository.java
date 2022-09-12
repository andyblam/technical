package com.example.Comcast.Repository;

import com.example.Comcast.Entity.People;
import java.util.ArrayList;
import java.util.List;
 

/* lack of a database which means no peopleRepository... need to substitue in with helper methods*/

public class PeopleRepository {

    public List<People> init_repo () {
        List<People> indx = new ArrayList<People>();

        People p1 = new People("Andy Lam", "Cherry Hill", 22, 1234);
        indx.add(p1);
        People p2 = new People("Winnie Ing", "Cherry Hill", 26, 4321);
        indx.add(p2);
        People p3 = new People("Mark Mark", "Canada", 99, 1010);
        indx.add(p3);
        People p4 = new People("Joe Joe", "France", 102, 1454);
        indx.add(p4);
        People p5 = new People("Jane Mary Doe", "Brazil", 34, 4444);
        indx.add(p5);
        People p6 = new People("Cowboy Ant", "Texas", 76, 67);
        indx.add(p6);

        return indx;
    }

    public People findByID(List<People> indx, String id) {
       int t = Integer.parseInt(id);
        for(int i = 0; i < indx.size(); i++) {
            if(indx.get(i).getID() == t) return indx.get(i);
        }

        return null;
    }

}
