
/**
 * Write a description of class Reading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reading
{
    private BookCopy    bookCopyRDNG;
    private Owner       ownerOfBookRDNG;
    private int         numberOfHoursSoFarRDNG;
    private boolean     completedRDNG;

    public Reading( BookCopy    bookCopyRDNGT,
                    Owner       ownerOfBookRDNGT ) {
        
        bookCopyRDNG    = bookCopyRDNGT;
        ownerOfBookRDNG = ownerOfBookRDNGT;
        
        numberOfHoursSoFarRDNG = 0;
        
        completedRDNG = false;
                    
                    
    }

}

