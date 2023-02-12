

//User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/
class Solution {
    // Function to generate the linked list with prime numbers
    Node primeList(Node head) {
        // Create a temporary variable to iterate through the linked list
        Node temp = head;
        // Iterate through the linked list
        while (temp != null) {
            // Check if the current value is not a prime number
            if (!isPrime(temp.val)) {
                // If the current value is not a prime number, set it to the nearest prime number
                temp.val = nearestPrime(temp);
            }
            // Move to the next node in the linked list
            temp = temp.next;
        }
        // Return the head of the linked list
        return head;
    }
    
    // Function to find the nearest prime number to the current value
    int nearestPrime(Node head) {
        int valMinusOne = head.val;
        int valPlusOne = head.val;
        // Keep looping until a prime number is found
        while (true) {
            // Check if valMinusOne is a prime number
            if (isPrime(valMinusOne)) {
                // If it is, return it
                return valMinusOne;
            }
            // Check if valPlusOne is a prime number
            else if (isPrime(valPlusOne)) {
                // If it is, return it
                return valPlusOne;
            }
            // Decrement valMinusOne and increment valPlusOne
            valMinusOne -= 1;
            valPlusOne += 1;
        }
    }

    // Function to check if a number is prime or not
    boolean isPrime(int vi) {
        // Return false if the number is less than or equal to 1
        if (vi <= 1) {
            return false;
        }
        // Iterate from 2 to the square root of vi
        for (int i = 2; i * i <= vi; i++) {
            // Return false if vi is divisible by i
            if (vi % i == 0) {
                return false;
            }
        }
        // Return true if vi is prime
        return true;
    }
}