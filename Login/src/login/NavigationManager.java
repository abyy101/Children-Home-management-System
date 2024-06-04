package login;


import java.util.Stack;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tonuii
 */
public class NavigationManager {
   
    private static Stack<JFrame> navigationStack = new Stack<>();
    private static JFrame homePage;

    public static void navigateTo(JFrame current, JFrame next) {
        if (current != null) {
            current.setVisible(false);
            navigationStack.push(current);
        }
        next.setVisible(true);
    }

    public static void goBack(JFrame current) {
        if (!navigationStack.isEmpty()) {
            current.setVisible(false);
            JFrame previous = navigationStack.pop();
            previous.setVisible(true);
        }
    }

    public static void setHomePage(JFrame home) {
        homePage = home;
    }

    public static JFrame getHomePage() {
        return homePage;
    }

    public static void navigateToHomePage(JFrame current) {
        if (homePage != null) {
            navigateTo(current, homePage);
        }
    }
}


