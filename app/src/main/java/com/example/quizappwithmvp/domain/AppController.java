package com.example.quizappwithmvp.domain;

import com.example.quizappwithmvp.R;
import com.example.quizappwithmvp.data.model.CategoryEnum;
import com.example.quizappwithmvp.data.model.QuestionData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppController {
    private static AppController instance;
    private CategoryEnum selectCategory;
    private final List<QuestionData> list = new ArrayList<>();

    private AppController() {
    }

    public static AppController getInstance() {
        if (instance == null) {
            instance = new AppController();
        }

        return instance;
    }

    public void setSelectCategory(CategoryEnum category) {
        this.selectCategory = category;
        loadQuestion();
    }

    public List<QuestionData> getQuestionByCategory() {
        Collections.shuffle(list);
        return list.subList(0, 10);
    }

    public void loadQuestion() {
        list.clear();
        switch (selectCategory) {
            case SUBJECT:
                list.add(new QuestionData(R.string.topic1_question1, "Fe", "Ag", "Au", "Cu", "Au"));
                list.add(new QuestionData(R.string.topic1_question2, "Weak nuclear force", "Gravitational force", "Strong nuclear force", "Weak nuclear force", "Gravitational force"));
                list.add(new QuestionData(R.string.topic1_question3, "Messier 87", "Triangulum", "Andromeda", "Milky Way", "Andromeda"));
                list.add(new QuestionData(R.string.topic1_question4, "Condensation", "Evaporation", "Sublimation", "Precipitation", "Condensation"));
                list.add(new QuestionData(R.string.topic1_question5, "Oxygen", "Carbon dioxide", "Nitrogen", "Methane", "Carbon dioxide"));
                list.add(new QuestionData(R.string.topic1_question6, "Heart", "Brain", "Liver", "Skin", "Liver"));
                list.add(new QuestionData(R.string.topic1_question7, "Roots", "Leaves", "Flowers", "Stems", "Leaves"));
                list.add(new QuestionData(R.string.topic1_question8, "A type of bacteria", "A living organism", "A non-living infectious agent", "A type of fungi", "A non-living infectious agent"));
                list.add(new QuestionData(R.string.topic1_question9, "Venus", "Mars", "Jupiter", "Saturn", "Mars"));
                list.add(new QuestionData(R.string.topic1_question10, "F=m×a", "E=m×c^2", "P=F/A", "W=m×g", "F=m×a"));
                //...
                list.add(new QuestionData(R.string.topic1_question11, "Wo", "Wt", "H2O", "O2H", "H2O"));
                list.add(new QuestionData(R.string.topic1_question12, "Wind", "Fossil fuels", "Sun", "Geothermal", "Sun"));
                list.add(new QuestionData(R.string.topic1_question13, "Volt", "Ampere", "Watt", "Ohm", "Ampere"));
                list.add(new QuestionData(R.string.topic1_question14, "Nitrogen", "Oxygen", "Carbon dioxide", "Hydrogen", "Carbon dioxide"));
                list.add(new QuestionData(R.string.topic1_question15, "Magnetism", "Gravity", "Friction", "Buoyancy", "Gravity"));
                list.add(new QuestionData(R.string.topic1_question16, "Coal", "Solar power", "Natural gas", "Nuclear power", "Solar power"));
                list.add(new QuestionData(R.string.topic1_question17, "Atom", "Molecule", "Cell", "Particle", "Atom"));
                list.add(new QuestionData(R.string.topic1_question18, "Tilt of the Earth's axis", "Distance from the sun", "Earth's rotation speed", "Atmospheric pressure", "Tilt of the Earth's axis"));
                list.add(new QuestionData(R.string.topic1_question19, "Nucleus", "Endoplasmic reticulum", "Golgi apparatus", "Lysosome", "Golgi apparatus"));
                list.add(new QuestionData(R.string.topic1_question20, "NaCl", "H2O", "CO2", "CH4", "NaCl"));
                break;

            case COUNTRIES:
                list.add(new QuestionData(R.string.topic2_question1, "Sydney", "Melbourne", "Canberra", "Brisbane", "Canberra"));
                list.add(new QuestionData(R.string.topic2_question2, "China", "Japan", "South Korea", "Thailand", "Japan"));
                list.add(new QuestionData(R.string.topic2_question3, "Portuguese", "Spanish", "Italian", "French", "Portuguese"));
                list.add(new QuestionData(R.string.topic2_question4, "Asia", "Africa", "Europe", "Australia", "Africa"));
                list.add(new QuestionData(R.string.topic2_question5, "United States", "Russia", "China", "Canada", "Russia"));
                list.add(new QuestionData(R.string.topic2_question6, "Mexico", "Australia", "Egypt", "Brazil", "Australia"));
                list.add(new QuestionData(R.string.topic2_question7, "Yen", "Wong", "Yuan", "Ringgit", "Yen"));
                list.add(new QuestionData(R.string.topic2_question8, "France", "Italy", "Netherlands", "Germany", "Netherlands"));
                list.add(new QuestionData(R.string.topic2_question9, "Amazon River", "Nile River", "Mississippi River", "Yangtze River", "Nile River"));
                list.add(new QuestionData(R.string.topic2_question10, "Greece", "Turkey", "Jordan", "Egypt", "Jordan"));
                //...
                list.add(new QuestionData(R.string.topic2_question11, "Australia", "Greenland", "Indonesia", "Japan", "Greenland"));
                list.add(new QuestionData(R.string.topic2_question12, "Norway", "Sweden", "Finland", "Iceland", "Norway"));
                list.add(new QuestionData(R.string.topic2_question13, "Asia", "Africa", "South America", "North America", "Africa"));
                list.add(new QuestionData(R.string.topic2_question14, "English", "Zulu", "Afrikaans", "Swahili", "English"));
                list.add(new QuestionData(R.string.topic2_question15, "Mexico", "Peru", "Chile", "Argentina", "Peru"));
                list.add(new QuestionData(R.string.topic2_question16, "Rupiah", "Rupee", "Baht", "Ringgit", "Rupee"));
                list.add(new QuestionData(R.string.topic2_question17, "Norway", "Switzerland", "Austria", "Sweden", "Norway"));
                list.add(new QuestionData(R.string.topic2_question18, "Monaco", "Vatican City", "San Marino", "Liechtenstein", "Vatican City"));
                list.add(new QuestionData(R.string.topic2_question19, "Tigris", "Euphrates", "Nile", "Danube", "Nile"));
                list.add(new QuestionData(R.string.topic2_question20, "Maldives", "Sri Lanka", "Seychelles", "Mauritius", "Sri Lanka"));
                break;

            case PLANET:
                list.add(new QuestionData(R.string.topic3_question1, "Venus", "Earth", "Mars", "Jupiter", "Mars"));
                list.add(new QuestionData(R.string.topic3_question2, "Earth", "Jupiter", "Saturn", "Neptune", "Jupiter"));
                list.add(new QuestionData(R.string.topic3_question3, "Venus", "Mercury", "Mars", "Earth", "Mercury"));
                list.add(new QuestionData(R.string.topic3_question4, "Venus", "Mars", "Jupiter", "Saturn", "Venus"));
                list.add(new QuestionData(R.string.topic3_question5, "Titan", "Ganymede", "Europa", "Callisto", "Ganymede"));
                list.add(new QuestionData(R.string.topic3_question6, "Mars", "Earth", "Uranus", "Neptune", "Earth"));
                list.add(new QuestionData(R.string.topic3_question7, "A giant storm", "A mountain range", "A desert", "A volcano", "A giant storm"));
                list.add(new QuestionData(R.string.topic3_question8, "Mars", "Jupiter", "Saturn", "Uranus", "Saturn"));
                list.add(new QuestionData(R.string.topic3_question9, "Mars", "Mercury", "Earth", "Venus", "Mercury"));
                list.add(new QuestionData(R.string.topic3_question10, "Saturn", "Uranus", "Neptune", "Jupiter", "Saturn"));
                //...
                list.add(new QuestionData(R.string.topic3_question11, "Neptune", "Uranus", "Saturn", "Jupiter", "Uranus"));
                list.add(new QuestionData(R.string.topic3_question12, "Mount Everest", "Olympus Mons", "Mauna Kea", "Mount Vesuvius", "Olympus Mons"));
                list.add(new QuestionData(R.string.topic3_question13, "Venus", "Mars", "Jupiter", "Saturn", "Venus"));
                list.add(new QuestionData(R.string.topic3_question14, "Voyager", "Galileo", "Cassini", "Hubble", "Cassini"));
                list.add(new QuestionData(R.string.topic3_question15, "Mars", "Venus", "Mercury", "Jupiter", "Venus"));
                list.add(new QuestionData(R.string.topic3_question16, "Oxygen", "Helium", "Methane", "Hydrogen", "Hydrogen"));
                list.add(new QuestionData(R.string.topic3_question17, "Neptune", "Saturn", "Uranus", "Jupiter", "Jupiter"));
                list.add(new QuestionData(R.string.topic3_question18, "Voyager 1", "Hubble Space Telescope", "Mars Rover", "ISS (International Space Station)", "Voyager 1"));
                list.add(new QuestionData(R.string.topic3_question19, "Venus", "Mercury", "Earth", "Mars", "Venus"));
                list.add(new QuestionData(R.string.topic3_question20, "Europa", "Titan", "Enceladus", "Io", "Enceladus"));


                break;


            case SCIENTIST:
                list.add(new QuestionData(R.string.topic5_question1, "Isaac Newton", "Nikola Tesla", "Galileo Galilei", "Albert Einstein", "Albert Einstein"));
                list.add(new QuestionData(R.string.topic5_question2, "Au", "Fe", "Ag", "Hg", "Au"));
                list.add(new QuestionData(R.string.topic5_question3, "Eart", "Saturn", "Mars", "Jupiter", "Jupiter"));
                list.add(new QuestionData(R.string.topic5_question4, "Calcium", "Potassium", "Iron", "Sodium", "Calcium"));
                list.add(new QuestionData(R.string.topic5_question5, "Tissue", "Atom", "Molecule", "Cell", "Cell"));
                list.add(new QuestionData(R.string.topic5_question6, "Gregor Mendel", "Louis Pasteur", "Charles Darwin", "Marie Curie", "Charles Darwin"));
                list.add(new QuestionData(R.string.topic5_question7, "N2", "O2", "CO2", "H2O", "H2O"));
                list.add(new QuestionData(R.string.topic5_question8, "Pancreas", "Liver", "Kidney", "Stomach", "Pancreas"));
                list.add(new QuestionData(R.string.topic5_question9, "Nitrogen", "Oxygen", "Hydrogen", "Carbon dioxide", "Carbon dioxide"));
                list.add(new QuestionData(R.string.topic5_question10, "Robert Koch", "Alexander Fleming", "Louis Pasteur", "Joseph Lister", "Alexander Fleming"));

                //...

                list.add(new QuestionData(R.string.topic5_question11, "Ir", "In", "I", "Fe", "Fe"));
                list.add(new QuestionData(R.string.topic5_question12, "Oxygen", "Nitrogen", "Hydrogen", "Carbon dioxide", "Nitrogen"));
                list.add(new QuestionData(R.string.topic5_question13, "Atom", "Molecule", "Compound", "Cell", "Atom"));
                list.add(new QuestionData(R.string.topic5_question14, "Venus", "Jupiter", "Mars", "Saturn", "Mars"));
                list.add(new QuestionData(R.string.topic5_question15, "Photosynthesis", "Respiration", "Fermentation", "Digestion", "Photosynthesis"));
                list.add(new QuestionData(R.string.topic5_question16, "Rosalind Franklin", "Linus Pauling", "James Watson and Francis Crick", "Gregor Mendel", "James Watson and Francis Crick"));
                list.add(new QuestionData(R.string.topic5_question17, "186,282 miles per second", "300,000 kilometers per second", "500,000 kilometers per second", "150,000 miles per second", "186,282 miles per second"));
                list.add(new QuestionData(R.string.topic5_question18, "Natural gas", "Coal", "Solar power", "Nuclear energy", "Solar power"));
                list.add(new QuestionData(R.string.topic5_question19, "NaCl", "H2O", "CO2", "CH4", "NaCl"));
                list.add(new QuestionData(R.string.topic5_question20, "Albert Einstein", "Galileo Galilei", "Isaac Newton", "Johannes Kepler", "Isaac Newton"));

                break;

            case JAVA:
                list.add(new QuestionData(R.string.topic4_question1, "variable x;", "int x;", "x = int;", "new Variable(x);", "int x;"));
                list.add(new QuestionData(R.string.topic4_question2, "array x = new array();", "int[] x = new int[];", "int x[] = new int[5];", "x = {1, 2, 3, 4, 5};", "int x[] = new int[5];"));
                list.add(new QuestionData(R.string.topic4_question3, "To make a variable constant", "To indicate that a method belongs to the class, not an instance", "To allow dynamic method dispatch", "To declare a variable with a fixed value", "111To indicate that a method belongs to the class, not an instance1"));
                list.add(new QuestionData(R.string.topic4_question4, "int", "float", "string", "char", "string"));
                list.add(new QuestionData(R.string.topic4_question5, "/* comment */", "// comment", "-- comment --", "comment /*", "// comment"));
                list.add(new QuestionData(R.string.topic4_question6, "To end the loop", "To exit the program", "To skip the current iteration and move to the next one", "To exit the switch statement", "To exit the switch statement"));
                list.add(new QuestionData(R.string.topic4_question7, "true", "false", "0", "1", "false"));
                list.add(new QuestionData(R.string.topic4_question8, "int x = Integer.parseInt(\"123\");", "int x = String.valueOf(123);", "int x = Integer.valueOf(\"123\");", "int x = \"123\".toInt();", "int x = Integer.parseInt(\"123\");"));
                list.add(new QuestionData(R.string.topic4_question9, "To access the superclass's members", "To call a static method", "To create an instance of a class", "To denote a variable as constant", "To access the superclass's members"));
                list.add(new QuestionData(R.string.topic4_question10, "Thread.start();", "new Thread().init();", "Thread.run();", "create Thread();", "Thread.start();"));

                //...

                list.add(new QuestionData(R.string.topic4_question11, "2.5", "2", "2.0", "3", "2"));
                list.add(new QuestionData(R.string.topic4_question12, "const int x = 5;", "final int x = 5;", "constant int x = 5;", "static final int x = 5;", "final int x = 5;"));
                list.add(new QuestionData(R.string.topic4_question13, "To refer to the current instance of the class", "To create a new object", "To access a static variable", "To declare a constructor", "To refer to the current instance of the class"));
                list.add(new QuestionData(R.string.topic4_question14, "Interfaces cannot have methods", "Interfaces can have constructors", "Interfaces can have multiple inheritance", "Interfaces can only have private members", "Interfaces can have multiple inheritance"));
                list.add(new QuestionData(R.string.topic4_question15, "To create resizable arrays", "To build string sequences efficiently", "To parse XML documents", "To manipulate graphical objects", "To build string sequences efficiently"));
                list.add(new QuestionData(R.string.topic4_question16, "To specify the conditions under which an exception is thrown", "To catch and handle exceptions", "To indicate the end of a program", "To define constant variables", "To catch and handle exceptions"));
                list.add(new QuestionData(R.string.topic4_question17, "while (true) {}", "for (;;) {}", "do {} while (true);", "All of the above", "All of the above"));
                list.add(new QuestionData(R.string.topic4_question18, "A physical computer", "A compiler", "A runtime environment for Java bytecode", "A version control system", "A runtime environment for Java bytecode"));
                list.add(new QuestionData(R.string.topic4_question19, "To implement an interface", "To declare a constructor", "To indicate inheritance", "To create a new object", "To indicate inheritance"));
                list.add(new QuestionData(R.string.topic4_question20, "By making the method final", "By making the method abstract", "By using the override keyword", "By declaring the method as static", "By making the method final"));

                break;

            case KOTLIN:
                list.add(new QuestionData(R.string.topic6_question1, "A programming language", "A data structure", "A web browser", "A hardware component", "A programming language"));
                list.add(new QuestionData(R.string.topic6_question2, "val", "const", "let", "var", "var"));
                list.add(new QuestionData(R.string.topic6_question3, "It indicates that a variable cannot be changed after initialization.", "It makes a variable nullable.", "It delays the initialization of a variable until it is first accessed.", "It enforces strict typing for a variable.", "It delays the initialization of a variable until it is first accessed."));
                list.add(new QuestionData(R.string.topic6_question4, "It represents a bitwise OR operation", "It is used for exponentiation.", "It provides a default value if the expression on the left is null.", "It is a syntax error.", "It provides a default value if the expression on the left is null."));
                list.add(new QuestionData(R.string.topic6_question5, "It declares a function.", "It defines a class.", "It creates an object.", "It is short for \"funny.\"", "It declares a function."));
                list.add(new QuestionData(R.string.topic6_question6, "// This is a comment", "/* This is a comment */", "<!-- This is a comment -->", "-- This is a comment", "// This is a comment"));
                list.add(new QuestionData(R.string.topic6_question7, "It creates a loop.", "It defines a class hierarchy.", "It replaces the switch statement from Java.", "It denotes a lambda expression.", "It replaces the switch statement from Java."));
                list.add(new QuestionData(R.string.topic6_question8, "A type that cannot be assigned null.", "A type that can only be assigned null.", "A type that is not allowed in Kotlin.", "A type that may or may not hold a null value.", "A type that may or may not hold a null value."));
                list.add(new QuestionData(R.string.topic6_question9, "It initializes the properties of a class.", "It initializes a variable.", "It defines a secondary constructor.", "It specifies the entry point of the program.", "It initializes the properties of a class."));
                list.add(new QuestionData(R.string.topic6_question10, "class MyData { }", "data class MyData { }", "struct MyData { }", "record MyData { }", "data class MyData { }"));

                // ...

                list.add(new QuestionData(R.string.topic6_question11, "It initializes properties of a class.", "It defines a secondary constructor.", "It declares a variable.", "It creates a new instance of the class.", "It initializes properties of a class."));
                list.add(new QuestionData(R.string.topic6_question12, "protected", "internal", "public", "private", "public"));
                list.add(new QuestionData(R.string.topic6_question13, "(myLambda) => { }", "lambda myLambda { }", "fun myLambda() { }", "{ myLambda -> }", "{ myLambda -> }"));
                list.add(new QuestionData(R.string.topic6_question14, "It repeats a block of code.", "It executes a block of code and returns the result.", "It defines a new thread.", "It runs the program.", "It executes a block of code and returns the result."));
                list.add(new QuestionData(R.string.topic6_question15, "cast(type)", "convertTo(type)", "type.cast()", "as type", "as type"));
                list.add(new QuestionData(R.string.topic6_question16, "It declares a lazy-loaded property.", "It defines a bi-directional association.", "It indicates a variable can only be assigned once.", "It is a syntax error.", "It declares a lazy-loaded property."));
                list.add(new QuestionData(R.string.topic6_question17, "It cannot have any properties.", "It cannot have any subclasses.", "It is marked with the sealed modifier and can have a limited set of subclasses.", "It cannot be instantiated.", "It is marked with the sealed modifier and can have a limited set of subclasses."));
                list.add(new QuestionData(R.string.topic6_question18, "It denotes inheritance.", "It specifies an input parameter.", "It represents an integer.", "It indicates contravariance.", "It indicates contravariance."));
                list.add(new QuestionData(R.string.topic6_question19, "It is used for arithmetic operations.", "It executes a block of code and returns the receiver object.", "It performs bitwise operations.", "It represents an alias for a class.", "It executes a block of code and returns the receiver object."));
                list.add(new QuestionData(R.string.topic6_question20, "const val myConstant = 10", "val myConstant: Const = 10", "final val myConstant = 10", "static val myConstant = 10", "const val myConstant = 10"));

                break;


            case C__:
                list.add(new QuestionData(R.string.topic7_question1, "var x;", "variable x;", "int x;", "x = int;", "int x;"));
                list.add(new QuestionData(R.string.topic7_question2, "int arr[5] = {0};", "int arr[] = {0, 0, 0, 0, 0};", "int arr[5] = {1};", "int arr[5] = 0;", "int arr[] = {0, 0, 0, 0, 0};"));
                list.add(new QuestionData(R.string.topic7_question3, "File operations", "Error handling", "Output", "Input", "Input"));
                list.add(new QuestionData(R.string.topic7_question4, "alloc", "malloc", "new", "allocate", "new"));
                list.add(new QuestionData(R.string.topic7_question5, "Terminate the program", "Skip the next iteration", "Exit the loop", "Exit the switch statement", "Exit the switch statement"));
                list.add(new QuestionData(R.string.topic7_question6, "int &x = y;", "ref int x = y;", "ref x = y;", "int *x = &y;", "int &x = y;"));
                list.add(new QuestionData(R.string.topic7_question7, "11", "12", "13", "14", "14"));
                list.add(new QuestionData(R.string.topic7_question8, "ofstream file(\"example.txt\");", "file.open(\"example.txt\");", "file.open(\"example.txt\", \"w\");", "ifstream file(\"example.txt\");", "ofstream file(\"example.txt\");"));
                list.add(new QuestionData(R.string.topic7_question9, "Declare a variable with a constant value", "Declare a constant variable", "Specify a constant class", "Create a constant function", "Declare a constant variable"));
                list.add(new QuestionData(R.string.topic7_question10, "for loop", "while loop", "do-while loop", "switch loop", "do-while loop"));

                // ...

                list.add(new QuestionData(R.string.topic7_question11, "End the program", "Insert a newline character", "Declare the end of a loop", "Indicate the end of a function", "Insert a newline character"));
                list.add(new QuestionData(R.string.topic7_question12, "int sum(int a, b);", "int add(int a, int b);", "sum(int a, int b);", "add(int a, b)", "int add(int a, int b);"));
                list.add(new QuestionData(R.string.topic7_question13, "Declare a constant variable", "Allocate memory dynamically", "Specify internal linkage", "Indicate the end of a program", "Specify internal linkage"));
                list.add(new QuestionData(R.string.topic7_question14, "2 bytes", "4 bytes", "8 bytes", "Depends of the compiler", "4 bytes"));
                list.add(new QuestionData(R.string.topic7_question15, "myArray[0]", "myArray.first()", "myArray(1)", "first(myArray)", "myArray[0]"));
                list.add(new QuestionData(R.string.topic7_question16, "Define a pure virtual machine", "Specify the function as static", "Enable function overloading", "Allow function overriding in derived classes", "Allow function overriding in derived classes"));
                list.add(new QuestionData(R.string.topic7_question17, "::", "//", "--", "->", "::"));
                list.add(new QuestionData(R.string.topic7_question18, "/* comment */", "# comment", "// comment", "-- comment", "// comment"));
                list.add(new QuestionData(R.string.topic7_question19, "Value of the variable", "Memory address of the variable", "Size of the variable in bytes", "Type of the variable", "Size of the variable in bytes"));
                list.add(new QuestionData(R.string.topic7_question20, "Memory location", "File handing", "Exception handing", "Loop control structures", "Exception handling"));
                break;


        }
    }
}


