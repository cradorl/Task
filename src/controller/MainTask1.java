package controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import model.logic.SearchLogic;
import utilities.Input;
import utilities.MyException;
import view.Printer;

import java.util.Stack;

public class MainTask1 {
    public static void main(String[] args){
        Printer.print(Boolean.toString(SearchLogic.brackets("({})[]()")));
//        System.out.print("1"+2+3);
//        String text = Input.enterString("Please, enter the text: ");
//        try {
//            if (SearchLogic.brackets(text)) {
//                Printer.print("Everything is right!\n");
//                Stack<Integer> stack = new Stack<>();
//                stack.push(0);
//
//            }
//        } catch (MyException e){
//            Printer.print(e.getMessage());
//        }
    }
}
