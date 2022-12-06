/* sample code*/
class Trainee{
    public static int choc=100;
    public int id;
    public String name;
    
    Trainee(int id,String name){
        this.id=id;
        this.name=name;
        Trainee.choc-=1;
    }
    
    public void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
    }
}
public class Tester {
    public static void main(String[] args) {
        Trainee trainee1 = new Trainee(1234,"Priya"); //obj creation, LHS = RHS, default constructor
        trainee1.display();
        Trainee trainee2 = new Trainee(1235,"Ankith"); //obj creation, LHS = RHS, default constructor
        trainee2.display();
        System.out.println("choc count: "  + trainee2.choc); //Not the correct way of accessing
        System.out.println("choc count: "  + Trainee.choc); //The correct way of accessing
        
    }
}


class Trainee{
    private static int choc=100;
    public int id;
    public String name;    
    Trainee(int id,String name){
        this.id=id;
        this.name=name;
        Trainee.choc-=1;
    }
    public static int getChoc(){
        return Trainee.choc;
    }
    public void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
    }
}
public class Tester {
    public static void main(String[] args) {
        Trainee trainee1 = new Trainee(1234,"Priya"); //obj creation, LHS = RHS, default constructor
        trainee1.display();
        Trainee trainee2 = new Trainee(1235,"Ankith"); //obj creation, LHS = RHS, default constructor
        trainee2.display();
        
        System.out.println("choc count: "  + Trainee.getChoc()); //The correct way of accessing
        
    }
}


class Trainee{
    public static int counter=1000;
    public String id;
    public String name;    
    
    Trainee(String name){
        this.name=name;
    }
    
    public void generateId(){
        this.id=this.name.substring(0, 2).toUpperCase() + ++Trainee.counter;
    }
    
    public void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
    }
}
public class Tester {
    public static void main(String[] args) {
        Trainee trainee1 = new Trainee("Priya"); //obj creation, LHS = RHS, default constructor
        trainee1.generateId();
        trainee1.display();
        Trainee trainee2 = new Trainee("Ankith"); //obj creation, LHS = RHS, default constructor
        trainee2.generateId();
        trainee2.display();        
    }
}



class Address{
    private int doorNo;
    private String area;
    private int pincode;
    private String city;
    public Address(int doorNo,String area,int pincode,String city) {
        this.doorNo=doorNo;
        this.area=area;
        this.pincode=pincode;
        this.city=city;
    }
    public int getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
}

class Customer{
    private int custId;
    private String name;
    private Address abc; //step 1 //aggregation
    
    public Customer(int custId,String name,Address abc) {//step3
        this.custId=custId;
        this.name=name;
        this.abc=abc;
        
    }
    
    public Address getAbc() {//step2
        return abc;
    }
    public void setAbc(Address abc) {//step2
        this.abc = abc;
    }
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println(this.custId+":"+this.name+":"+this.abc.getArea()+":"+this.abc.getPincode()+":"+this.abc.getCity()+":"+this.abc.getDoorNo());//step 4
    }
}

class Tester {
    
    public static void main(String[] args) {
        Address obj=new Address(101,"baker street",12345,"NY");
        Customer obj1=new Customer(1001,"John",obj);//step 5
        obj1.display();
        obj1.getAbc().setPincode(34567);
        obj1.display();
        
      
    }
}



class CreditCard{
    private int cardNo;
    private String cardType;
    private int cvv;
    public CreditCard(int cardNo,String cardType,int cvv) {
        this.cardNo=cardNo;
        this.cardType=cardType;
        this.cvv=cvv;
        
    }
    public int getCardNo() {
        return cardNo;
    }
    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }
    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
}
class Customer{
    private int custId;
    private String name;
    public Customer(int custId,String name) {
        this.custId=custId;
        this.name=name;    
    }
    
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display(CreditCard abc) {//step 1 //pass as local parameter //method level
        System.out.println(this.custId+":"+this.name+":"+abc.getCardNo()+":"+abc.getCardType()+":"+abc.getCvv()); //step2
    }
}

class Tester {
    
    public static void main(String[] args) {
        CreditCard obj=new CreditCard(1000000001,"Visa",765);
        Customer obj1=new Customer(1001,"John");
        obj1.display(obj); //step 3      
    }
}


