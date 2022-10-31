class BookConst {

    public static String ESM = 
            "{ \"titulo\": \"Eng Soft Moderna\" }";
  
    public static String NULLBOOK = 
            "{ \"titulo\": \"NULL\" }";  
}

  
class MockBookService implements BookService {
  
    public String search(int isbn) {
        if (isbn == 1234)
            return BookConst.ESM;
        return BookConst.NULLBOOK;
    }  
}