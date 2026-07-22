package main.java.DSA.Scenerio_Based.LinkedList;


public class TrainManagementSystem {

    CoachNode head;

    // Add Coach at End
    public void addCoach(int coachNo) {

        CoachNode newNode = new CoachNode(coachNo);

        if (head == null) {
            head = newNode;
            return;
        }

        CoachNode temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Remove Coach
    public void removeCoach(int coachNo) {

        if (head == null)
            return;

        if (head.coachNo == coachNo) {
            head = head.next;
            return;
        }

        CoachNode temp = head;

        while (temp.next != null &&
                temp.next.coachNo != coachNo) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Display Train
    public void display() {

        CoachNode temp = head;

        while (temp != null) {
            System.out.print(temp.coachNo + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Reverse Train
    public void reverseTrain() {

        CoachNode prev = null;
        CoachNode curr = head;
        CoachNode next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Middle Coach
    public CoachNode middleCoach() {

        CoachNode slow = head;
        CoachNode fast = head;

        while (fast != null &&
                fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Detect Cycle
    public boolean hasCycle() {

        CoachNode slow = head;
        CoachNode fast = head;

        while (fast != null &&
                fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    // Merge Two Sorted Lists
    public CoachNode merge(CoachNode l1,
                           CoachNode l2) {

        CoachNode dummy = new CoachNode(-1);
        CoachNode tail = dummy;

        while (l1 != null &&
                l2 != null) {

            if (l1.coachNo <= l2.coachNo) {

                tail.next = l1;
                l1 = l1.next;

            } else {

                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        if (l1 != null)
            tail.next = l1;

        if (l2 != null)
            tail.next = l2;

        return dummy.next;
    }

    // Display Any List
    public void display(CoachNode node) {

        while (node != null) {

            System.out.print(node.coachNo + " -> ");
            node = node.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        TrainManagementSystem train =
                new TrainManagementSystem();

        train.addCoach(10);
        train.addCoach(20);
        train.addCoach(30);
        train.addCoach(40);
        train.addCoach(50);

        System.out.println("Original Train");

        train.display();

        train.removeCoach(30);

        System.out.println("\nAfter Removing Coach 30");

        train.display();

        train.reverseTrain();

        System.out.println("\nAfter Reversing");

        train.display();

        CoachNode middle = train.middleCoach();

        System.out.println("\nMiddle Coach = "
                + middle.coachNo);

        System.out.println("\nCycle Present = "
                + train.hasCycle());

        // Merge Demo

        TrainManagementSystem t1 =
                new TrainManagementSystem();

        t1.addCoach(10);
        t1.addCoach(30);
        t1.addCoach(50);

        TrainManagementSystem t2 =
                new TrainManagementSystem();

        t2.addCoach(20);
        t2.addCoach(40);
        t2.addCoach(60);

        CoachNode merged =
                train.merge(t1.head, t2.head);

        System.out.println("\nMerged Train");

        train.display(merged);
    }
}
