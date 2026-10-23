import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.printf("Hello and welcome!");

//    for (int i = 1; i <= 5; i++) {
//      //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//      // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//      System.out.println("i = " + i);
//    }


  }
}
//    Imagine we're receiving grant status updates from an external government system. Messages may be duplicated or arrive out of order.
//    I want you to write a Java function that processes a list of events and returns the latest valid status for each grant.
//    I'll give you the data structure and the rules. Please think aloud while coding, and leave a little time to test your solution.
//
//    Requirements:
//    Each event has an event ID, grant ID, sequence number, and status.
//
//        Ignore null events and events with missing or blank IDs or status, or negative sequence numbers.
//        Ignore duplicate event IDs after their first valid occurrence.
//    For each grant, keep the event with the highest sequence number.
//        When two valid events for the same grant have the same sequence, keep the earlier one.
//        Return an empty map for a null or empty input.
//    •        6.    Preserve the order in which grant IDs first appear in valid events.
//
//
//
//    Starter code
//
//import java


//    Expected output:
//    {
//      "G100": "APPROVED",
//        "G200": "IN_REVIEW"
//    }
//  }
//}