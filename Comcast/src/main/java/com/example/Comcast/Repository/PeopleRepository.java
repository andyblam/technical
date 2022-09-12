package com.example.Comcast.Repository;

import com.example.Comcast.Entity.People;
import java.util.ArrayList;
import java.util.List;
 

/* lack of a database which means no peopleRepository... need to substitue in with helper methods*/

public class PeopleRepository {

    public People findByID(List<People> indx, String id) {
       int t = Integer.parseInt(id);
        for(int i = 0; i < indx.size(); i++) {
            if(indx.get(i).getID() == t) return indx.get(i);
        }

        return null;
    }

}
