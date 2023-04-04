public enum Book {
    Kitap1("Dilimizdeki Dikenler",288,"Yavuz Bülent Bakiler","01-05-1453"),
    Kitap2("Avrupa'da Türk İzleri",90,"Yavuz Bülent Bakiler","02-06-1454"),
    Kitap3("Azerbaycan Yüreğimde Bir Şahdamardır",6,"Yavuz Bülent Bakiler","03-07-1500"),
    Kitap4("Unutamadıklarım",253,"Yavuz Bülent Bakiler","04-08-1600"),
    Kitap5("Dünya Bir İnkılap Bekliyor",134,"Necip Fazıl Kısarkürek","05-09-1966"),
    Kitap6("Benim Gözümde Menderes",520,"Necip Fazıl Kısakürek","01-01-2009"),
    Kitap7("Son Nefes",380,"Osman Nuri Topbaş","01-01-2003"),
    Kitap8("Bir Ekonomik Tetikçinin İtirafları",340,"John Perkins","05-05-2009"),
    Kitap9("Okla Yükselen Millet",294,"Erkan Göksü","02-02-2018"),
    Kitap10("En Sevgili Efendimiz ve Sevdalıları",330,"Ahmet Şimşirgil","05-01-2015");

    private String bookName;
    private int numberOfPage;
    private String authorName;
    private String releaseDate;


    Book(String bookName, int numberOfPage, String authorName, String releaseDate){
        this.bookName = bookName;
        this.numberOfPage = numberOfPage;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
