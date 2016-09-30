package excercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by jpmc on 9/30/2016.
 */
public class Collection {
    //private static String item;
    private static int index;
    private static Random random=new Random();


    public static String myList() {
        List<String> myFriends = new ArrayList<String>();
        String[] simpleArray = new String[ myFriends.size() ];
        myFriends.toArray( simpleArray );
        myFriends.add("arniel");
        myFriends.add(1, "jude");
        myFriends.add(2, "mario");
        myFriends.add(3, "arnold");
        myFriends.add(4, "alfredo");
        myFriends.size();
        Collections.shuffle(myFriends);


        /**myFriends*/
        //System.out.println("*****My Friends List*****");
        /*for (int i = 0; i < myFriends.size(); i++) {
            System.out.println(myFriends.get(i));

        }*/

         //index = random.nextInt(myFriends.size());
        index = random.nextInt(myFriends.size());
        return myFriends.get(index);



    }
        /**myGirls*/
        public static String myGirlFriends() {
            List<String> myGirls = new ArrayList<String>();
            myGirls.add("joan");
            myGirls.add("mary");
            myGirls.add("joy");
            myGirls.add("angel");
            myGirls.add( "julie");
            myGirls.size();
            //Collections.shuffle(myGirls);
       // System.out.println("*****My Girl Friends List*****");
        /*for (int i = 0; i < myGirls.size(); i++) {
            System.out.println(myGirls.get(i));

        }*/

          index = random.nextInt(myGirls.size());
            return myGirls.get(index);

    }

    public static String emotions() //This method changes the emotional states of the my Friends.
    {

        List<String> emotionalState = new ArrayList<String>();
        emotionalState.add("is in love with");
        emotionalState.add("angry with");
        emotionalState.add("happy with");
        emotionalState.add("unhappy with");
        emotionalState.add("its complicated with");
        emotionalState.size();
        Collections.shuffle(emotionalState);

      /* for (int i = 0; i < emotionalState.size(); i++)

        System.out.println(emotionalState.get(i));


        }*/

        index = random.nextInt(emotionalState.size());
        return emotionalState.get(index);

    }

}
