package Colection2;


import Colection2.command.AddElement;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = askSize();
        Operation operation;
        while (true) {

            try {
                operation = askOperation();
                if (operation == Operation.ADD) {
                    if (arrayList.size() < size) CommandExecutor.execute(operation, arrayList);
                    else {
                        new AddElement().exrcute2(arrayList);
                    }
                } else {
                    CommandExecutor.execute(operation, arrayList);

                    if (operation == Operation.EXIT) break;
                }

            } catch (Exception e) {
                ConsolHelper.writeMessage("There was an error, check the entered data");
            }
        }
    }

    public static int askSize() throws IOException {
        int answer;
        ConsolHelper.writeMessage("Select the size of the array:");
        ConsolHelper.writeMessage("1. Default");
        ConsolHelper.writeMessage("2. Indicate");
        answer = ConsolHelper.readInt();
        switch (answer) {
            case 1:
                answer = 16;
                ConsolHelper.writeMessage("Size = 16");
                break;
            case 2:
                ConsolHelper.writeMessage("Enter size of the array:");
                answer = ConsolHelper.readInt();
                break;
            default:
                ConsolHelper.writeMessage("Error!");
                break;
        }
        return answer;
    }

    public static Operation askOperation() throws IOException {
        ConsolHelper.writeMessage("Select an operation:");
        ConsolHelper.writeMessage("1. Add an element - " + (Operation.ADD.ordinal() + 1));
        ConsolHelper.writeMessage("2. Remove element by index - " + (Operation.REMOVEBYINDEX.ordinal() + 1));
        ConsolHelper.writeMessage("3. Remove element by value - " + (Operation.REMOVEBYVALUE.ordinal() + 1));
        ConsolHelper.writeMessage("4. exit - " + (Operation.EXIT.ordinal() + 1));
        return Operation.values()[ConsolHelper.readInt() - 1];
    }

}
