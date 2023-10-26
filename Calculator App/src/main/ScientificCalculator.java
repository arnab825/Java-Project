package main;
import javax.swing.SwingUtilities;
import Calculation.Framework;

public class ScientificCalculator  {
 
 
    public static void main(String[] args) throws Exception
    {
            SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Framework();
            }
        });
}
}