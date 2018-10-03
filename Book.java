/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.time.Year;
import java.awt.Color;

public class Book {
    
    public static final int MIN_NUMBER_EDITION_BK  = 1;
    public static final int MIN_NUMBER_PAGES_BK    = 10;
    public static final int MIN_LENGTH_MM_BK       = 10;
    public static final int MIN_WIDTH_MM_BK        = 10;
    public static final int MIN_HEIGHT_MM_BK       = 2;
    
    private static      int numberOfBooksBK        = 0;
    
    private static boolean isValidValue(    int valueT, 
                                            int valueToCompareT     ) { 

        return ( valueT >= valueToCompareT ) ? true : false; 
    }

    private static boolean allValidValues(  int editionBKT, 
                                            int numberOfPagesBKT, 
                                            int lengthBKT, 
                                            int widthBKT, 
                                            int heightBKT         ) {

        return  isValidValue( editionBKT,       MIN_NUMBER_EDITION_BK   )   && 
                isValidValue( numberOfPagesBKT, MIN_NUMBER_PAGES_BK     )   &&
                isValidValue( lengthBKT,        MIN_LENGTH_MM_BK        )   &&
                isValidValue( widthBKT,         MIN_WIDTH_MM_BK         )   &&
                isValidValue( heightBKT,        MIN_HEIGHT_MM_BK        );

    }
    
    private static String booleanIntoYesOrNo( boolean receivedBooleanT ) {
        
        return ( receivedBooleanT == true ) ? "Yes" : "No";
    
    }

    
    private int     idBK;
    private int     editionBK;
    private int     numberOfPagesBK;
    private int     lengthBK;
    private int     widthBK;
    private int     heightBK;
    private int     numberOfReadersBK; 

    private boolean  hasHardCoverBK;
    private boolean  hasIndexBK;
    private boolean  hasGlossaryBK;
    private boolean  hasPicturesBK;
    private boolean  hasWrittenNotesBK;
    private boolean  isWorkRelatedBK;
    private boolean  isDividedByChaptersBK;
    

    private String   isbnBK;
    private String   titleBK;
    private String   originalTitleBK;
    private String   languageBK;
    private String   originalLanguageBK;
    private String   commentsBK;
    
    private Color    mainColorBK;
    private Color    secondaryColorBK;
    
    private Year     yearPublicationBK;
    
    private Publisher publisherBK;
    
    public Book( String isbnBKT ) {

        isbnBK = isbnBKT;

    }

    public Book(    String isbnBKT, 
                    String titleBKT   ) {
                        
        this( isbnBKT );
        titleBK = titleBKT;

    }

    public Book(    int editionBKT,
                    int numberOfPagesBKT,
                    int lengthBKT,
                    int widthBKT,
                    int heightBKT,
                
                    boolean hasHardCoverBKT,
                    boolean hasIndexBKT,
                    boolean hasGlossaryBKT,
                    boolean hasPicturesBKT,
                    boolean hasWrittenNotesBKT,
                    boolean isWorkRelatedBKT,
                    boolean isDividedByChaptersBKT,
                
                    String isbnBKT,
                    String titleBKT,
                    String originalTitleBKT,
                    String languageBKT,
                    String originalLanguageBKT,
                    
                    Color  mainColorBKT,
                    Color  secondaryColorBKT   ) {
        
        // ID EQUAL TO -1 TELLS US THAT THE BOOK HAS NOT YET BEEN
        // INSERTED IN THE DATABASE, WHEN THAT HAPPENS IT WILL BE
        // ASSIGNED A POSITIVE ID NUMBER
        idBK                  = -1; 

        editionBK           = editionBKT;
        numberOfPagesBK     = numberOfPagesBKT;
        lengthBK            = lengthBKT;
        widthBK             = widthBKT;
        heightBK            = heightBKT;
        numberOfReadersBK   = 0;      

        hasHardCoverBK        = hasHardCoverBKT;
        hasIndexBK            = hasIndexBKT;
        hasGlossaryBK         = hasGlossaryBKT;
        hasPicturesBK         = hasPicturesBKT;
        hasWrittenNotesBK     = hasWrittenNotesBKT;
        isWorkRelatedBK       = isWorkRelatedBKT;
        isDividedByChaptersBK = isDividedByChaptersBKT;

        isbnBK                = isbnBKT;
        titleBK               = titleBKT;
        mainColorBK           = mainColorBKT;
        secondaryColorBK      = secondaryColorBKT;
        originalTitleBK       = originalTitleBKT;
        languageBK            = languageBKT;
        originalLanguageBK    = originalLanguageBKT;

        commentsBK = "";
        
        publisherBK = null;
        
        numberOfBooksBK++;
        
        idBK                  = numberOfBooksBK; 

    }

    public int      getIdBK()                 { return idBK;                    }
    public int      getEditionBK()            { return editionBK;               }
    public int      getNumberOfPagesBK()      { return numberOfPagesBK;         }
    public int      getLengthBK()             { return lengthBK;                }
    public int      getWidthBK()              { return widthBK;                 }
    public int      getHeightBK()             { return heightBK;                }
    public int      getNumberOfReadersBK()    { return numberOfReadersBK;       }
    public boolean  getHasHardCoverBK()       { return hasHardCoverBK;          }
    public boolean  getHasIndexBK()           { return hasIndexBK;              }
    public boolean  getHasGlossaryBK()        { return hasGlossaryBK;           }
    public boolean  getHasPicturesBK()        { return hasPicturesBK;           }
    public boolean  getIsDividedByChapters()  { return isDividedByChaptersBK;   }
    public String   getISBNBK()               { return isbnBK;                  }
    public String   getTitleBK()              { return titleBK;                 }
    public Color    getMainColorBK()          { return mainColorBK;             }
    public Color    getSecondaryColorBK()     { return secondaryColorBK;        }
    public String   getOriginalTitleBK()      { return originalTitleBK;         }
    public String   getLanguageBK()           { return languageBK;              }
    public String   getOriginalLanguageBK()   { return originalLanguageBK;      } 
    public String   getCommentsBK()           { return commentsBK;              }

    public void setEdition(         int editionBKT        )   { if ( isValidValue(  editionBKT,         MIN_NUMBER_EDITION_BK   ) )   { editionBK       = editionBKT;         } }
    public void setNumberOfPages(   int numberOfPagesBKT  )   { if ( isValidValue(  numberOfPagesBKT,   MIN_NUMBER_PAGES_BK     ) )   { numberOfPagesBK = numberOfPagesBKT;   } }
    public void setLength(          int lengthBKT         )   { if ( isValidValue(  lengthBKT,          MIN_LENGTH_MM_BK        ) )   { lengthBK        = lengthBKT;          } }   
    public void setWidth(           int widthBKT          )   { if( isValidValue(   widthBKT,           MIN_WIDTH_MM_BK         ) )   { widthBK         = widthBKT;           } }
    public void setHeight(          int heightBKT         )   { if ( isValidValue(  heightBKT,          MIN_HEIGHT_MM_BK        ) )   { heightBK        = heightBKT;          } }
    
    public void updateNumberOfReaders() { numberOfReadersBK = numberOfReadersBK + 1; }
    
    public String toString() {
        
        return  "Title: "               + titleBK                                 + "\n" +
                "Edition: "             + editionBK                               + "\n" +
                "Pages: "               + numberOfPagesBK                         + "\n" +
                "Length: "              + lengthBK    + " mm"                     + "\n" +
                "Width: "               + widthBK     + " mm"                     + "\n" +
                "Height: "              + heightBK    + " mm"                     + "\n" +
                "HardCover: "           + booleanIntoYesOrNo( hasHardCoverBK )    + "\n" +
                "Index: "               + booleanIntoYesOrNo( hasIndexBK )        + "\n" +
                "Glossary: "            + booleanIntoYesOrNo( hasGlossaryBK )     + "\n" +
                "Pictures: "            + booleanIntoYesOrNo( hasPicturesBK )     + "\n" +
                "Has written notes: "   + booleanIntoYesOrNo( hasWrittenNotesBK ) + "\n" +
                "Work Related: "        + booleanIntoYesOrNo( isWorkRelatedBK )   + "\n" +
                "ISBN: "                + isbnBK                                  + "\n" +
                "Main Color: "          + mainColorBK                             + "\n" +
                "Secondary Color: "     + secondaryColorBK                        + "\n";
    
    
    }
    
    public static void main( String[] args ) {
        
        Book book_one = new Book( 1, 100, 20, 10, 5, false, false, false, true, false, false, false, "1923-456", "Software Enginnering", "Original", "English", "English", Color.BLUE, Color.WHITE );
        System.out.println( book_one );
        System.out.println( Book.numberOfBooksBK );
    
    
    }
}
