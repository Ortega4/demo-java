public class hello{
  public static void main (String[] args)
   {
    System.out.println("hello world!");



               int numberOfKingRooms = 20;
               int numberOfQueenRooms = 20;
               int numberOfSuiteRooms = 10;

               int availableKingRooms = 5;//numberOfKingRooms;
               int availableQueenRooms = 0;//numberOfQueenRooms;
               int availableSuiteRooms = 0;//numberOfSuiteRooms;


               //Scanner input = new Scanner(System.in);  // Create a Scanner object
               //System.out.println("bedroom type");

               //String roomType = input.nextLine();
               //if(roomType == "king")

               if(availableKingRooms >0 || availableQueenRooms>0 || availableSuiteRooms>0)
               {
                   if(availableKingRooms >0)
                   {
                       System.out.println("king room available");
                   }
                   if(availableQueenRooms>0)
                   {
                       System.out.println("queen room available");
                   }
                   if(availableSuiteRooms>0)
                       System.out.println("suit room available");
               }
               else
               {
                   System.out.println("all out of rooms");
               }

               System.out.println("kingroom inventory:" + availableKingRooms );
               System.out.println("queenroom inventory:" + availableQueenRooms );
               System.out.println("suiteroom inventory:" + availableSuiteRooms );
           

       }



    }
    
    }
