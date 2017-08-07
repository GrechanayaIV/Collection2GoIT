package Colection2.command;

import Colection2.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class AddElement implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {

        ConsolHelper.writeMessage("Enter element to add: ");
        try {
            int elements = ConsolHelper.readInt();
            array.add(elements);
            ConsolHelper.writeMessage("Operation is successful. Array :");
            for (int i = 0; i < array.size(); i++) {
                System.out.print(array.get(i) + " ");
            }
            System.out.println();
        } catch (Exception e) {
            ConsolHelper.writeMessage("Error ! Such an element can not be added to an array of integers");
        }
    }

    public void exrcute2(ArrayList<Integer> array) throws IOException {
        array.remove(0);
        execute(array);
    }
}
