package Colection2.command;

import java.io.IOException;
import java.util.ArrayList;


public interface Command {
    void execute(ArrayList<Integer> array) throws IOException;
}
