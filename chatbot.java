import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! How can I help you today?");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase().trim();

            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Chatbot: Hi there! How are you?");
            } else if (userInput.contains("bye") || userInput.contains("goodbye")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;  // Exit the loop
            } else if (userInput.contains("weather")) {
                System.out.println("Chatbot: I'm not connected to the internet, but I hope it's sunny!");
            } else if (userInput.contains("name")) {
                System.out.println("Chatbot: My name is SimpleBot. What's yours?");
            } else if (userInput.contains("help")) {
                System.out.println("Chatbot: I can respond to greetings, weather, my name, or say goodbye. Try asking!");
            } else {
                System.out.println("Chatbot: Sorry, I didn't understand that. Can you rephrase?");
            }
        }

        scanner.close();
    }
}
