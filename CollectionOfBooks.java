import java.util.ArrayList;

public class CollectionOfBooks {
    
    private String          nameCBKS;
    private int             numberOfBooksCBKS;
    private ArrayList<Book> booksCBKS;
    
    //private Publisher publisherCBKS;

    public CollectionOfBooks( String nameCBKST ) {
        
        nameCBKS = nameCBKST;

    }
    
    public CollectionOfBooks(   String  nameCBKST,
                                int     numberOfBooksCBKST ) {
        
        nameCBKS            = nameCBKST;
        numberOfBooksCBKS   = numberOfBooksCBKST;

    }
    
    
    
    public String           getNameCBKS()           { return nameCBKS;          }
    public int              getNumberOfBooksCBKS()  { return numberOfBooksCBKS; } 
    public ArrayList<Book>  getBooksCBKS()          { return booksCBKS;         }
 

}
