public class Main {

    public static void main(String[] args) {
	var test=new Doubly_Linked_List();
    test.insertIndex(3,0);
    test.insertIndex(2,1);
    test.insertIndex(8,2);
    System.out.println(test.length());
    test.display();
    System.out.println("****************");
        test.deleteLast();
        test.display();
        System.out.println("*******");
        test.DeleteFromEnd(1);
        test.display();
        System.out.println("******************");
    var palindrometest=new Doubly_Linked_List();
    palindrometest.insertIndex(0,0);
    palindrometest.insertIndex(1,1);
    palindrometest.insertIndex(2,2);
    palindrometest.insertIndex(1,3);
    palindrometest.insertIndex(0,4);
        System.out.println(palindrometest.IsPalindrome());
        palindrometest.insertIndex(1,0);
        System.out.println(palindrometest.IsPalindrome());

    }
}
