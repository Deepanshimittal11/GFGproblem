//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class GFG {
    static void printList(Node head) {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            ArrayList<Integer> arr = new ArrayList<>();
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int x = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            tail.next = head; // Make it circular
            Solution ob = new Solution();
            Node ans = ob.sortedInsert(head, x);
            printList(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newNode = new Node(data);

    // Empty list
    if (head == null) {
        newNode.next = newNode;
        return newNode;
    }

    Node current = head;

    // Insert before head (new smallest element)
    if (data < head.data) {
        while (current.next != head)
            current = current.next;
        current.next = newNode;
        newNode.next = head;
        return newNode;
    }

    // Insert in middle or end
    while (current.next != head && current.next.data < data)
        current = current.next;

    newNode.next = current.next;
    current.next = newNode;

    return head;
    }
}