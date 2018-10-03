import java.time.Year;

public class BookCopy
{
    
    private static  int numberOfCopiesBKC = 0;
    
    
    private Book    bookBKC;
    private int     idBKC;
    private Year    yearOfPurchaseBKC;
    private String  conditionBKC;
    private String  pathToPhotographBKC;
    private boolean isTradableBKC;
    
    
    
    public BookCopy( Book bookBKCT) {
        
        numberOfCopiesBKC++;
        
        idBKC               = numberOfCopiesBKC;
        
        bookBKC             = bookBKCT;
        
        yearOfPurchaseBKC   = null;
    
        conditionBKC        = "";
        
        pathToPhotographBKC = "";
        
        isTradableBKC        = true;
    
    }
}
