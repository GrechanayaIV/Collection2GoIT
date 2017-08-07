package Colection2.command;

import Colection2.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class Exit implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Good bay!");
    }
}
