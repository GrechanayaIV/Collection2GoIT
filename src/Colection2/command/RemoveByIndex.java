package Colection2.command;

import Colection2.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class RemoveByIndex implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        try {
            if (array.size() == 0)
                throw new Exception();
            ConsolHelper.writeMessage("Enter element`s index to remove: ");
            int index = ConsolHelper.readInt();
            array.remove(index);
            ConsolHelper.writeMessage("Operation is successful. Array:");
            for (int i = 0; i < array.size(); i++) {
                System.out.print(array.get(i) + " ");
            }
            System.out.println();
        } catch (Exception e) {
            ConsolHelper.writeMessage("Error ! There is no such element in the array or array is empty");
        }
    }
}
