package Colection2;


import Colection2.command.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    public static final Map<Operation, Command> allCommandsMap = new HashMap<>();

    static {
        allCommandsMap.put(Operation.ADD, new AddElement());
        allCommandsMap.put(Operation.REMOVEBYINDEX, new RemoveByIndex());
        allCommandsMap.put(Operation.REMOVEBYVALUE, new RemoveByValue());
        allCommandsMap.put(Operation.EXIT, new Exit());
    }

    public CommandExecutor() {
    }

    public static void execute(Operation operation, ArrayList<Integer> array) throws Exception {
        allCommandsMap.get(operation).execute(array);
    }
}
