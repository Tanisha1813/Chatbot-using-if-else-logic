SimpleChatbot

SimpleChatbot is a beginner-friendly Java console application that simulates a simple rule-based chatbot. It responds to user input using keyword detection and provides friendly, predefined replies. This project is perfect for learning Java basics such as conditionals, loops, and user input handling.

🚀 Features

👋 Responds to greetings like "hello" and "hi"

👋 Politely ends the conversation when the user says "bye" or "goodbye"

☀️ Gives a generic weather response when "weather" is mentioned

🤖 Introduces itself when the user asks for its name

🆘 Provides help instructions when the user types "help"

❓ Handles unknown input with a default message

🔁 Runs continuously until the user chooses to exit

🧠 How It Works

The program reads user input using Java’s Scanner class.

It converts the input to lowercase and trims spaces for consistency.

A series of if-else conditions check for certain keywords.

The chatbot prints its response and loops until a goodbye keyword is detected.

💻 Example Interaction
Chatbot: Hello! How can I help you today?
You: hi
Chatbot: Hi there! How are you?
You: what's your name?
Chatbot: My name is SimpleBot. What's yours?
You: goodbye
Chatbot: Goodbye! Have a great day!

📁 Code Overview

The chatbot uses:

Scanner for reading user input

while (true) loop for continuous conversation

toLowerCase() and trim() for clean input handling

Conditional checks (if-else) for simple NLP-like behavior

This makes the program easy to read, modify, and extend.

🛠️ How to Run

Clone this repository:

git clone https://github.com/your-username/your-repo-name.git


Navigate to the project folder:

cd your-repo-name


Compile the Java program:

javac SimpleChatbot.java


Run it:

java SimpleChatbot

🌟 Future Improvements (Optional)

Add more commands and responses

Integrate simple machine learning or pattern matching

Connect to a weather API for real-time data

Improve conversation context
