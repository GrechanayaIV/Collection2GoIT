package Colection2.command;

import Colection2.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class RemoveByValue implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        try {
            if (array.size() == 0)
                throw new Exception();
            ConsolHelper.writeMessage("Enter element to remove: ");
            int elements = ConsolHelper.readInt();
            for (int i = 0; i < array.size(); i++) {
                if (elements == array.get(i))
                    array.remove(array.get(i));
            }

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
