

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class QueueExample {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<String>();
        
        // Enqueue items
        queue.add("Item 1");
        queue.add("Item 2");
        queue.add("Item 3");
        
        // Print the queue using JOptionPane
        StringBuilder sb = new StringBuilder();
        for (String item : queue) {
            sb.append(item);
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}