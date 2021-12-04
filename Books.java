public class Books {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBorrowed;//初始化默认就是false;



    //构造方法
    public Books(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }


    //get and set 方法
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
       return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

}
