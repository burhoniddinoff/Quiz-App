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
//        return list;
    }

    public void loadQuestion() {
        list.clear();
        switch (selectCategory) {
//            case SUBJECT:
//                list.add(new QuestionData(R.string.topic1_question1, "Fe", "Ag", "Au", "Cu", "Au"));
//                list.add(new QuestionData(R.string.topic1_question2, "Weak nuclear force", "Gravitational force", "Strong nuclear force", "Weak nuclear force", "Gravitational force"));
//                list.add(new QuestionData(R.string.topic1_question3, "Messier 87", "Triangulum", "Andromeda", "Milky Way", "Andromeda"));
//                list.add(new QuestionData(R.string.topic1_question4, "Condensation", "Evaporation", "Sublimation", "Precipitation", "Condensation"));
//                list.add(new QuestionData(R.string.topic1_question5, "Oxygen", "Carbon dioxide", "Nitrogen", "Methane", "Carbon dioxide"));
//                list.add(new QuestionData(R.string.topic1_question6, "Heart", "Brain", "Liver", "Skin", "Liver"));
//                list.add(new QuestionData(R.string.topic1_question7, "Roots", "Leaves", "Flowers", "Stems", "Leaves"));
//                list.add(new QuestionData(R.string.topic1_question8, "A type of bacteria", "A living organism", "A non-living infectious agent", "A type of fungi", "A non-living infectious agent"));
//                list.add(new QuestionData(R.string.topic1_question9, "Venus", "Mars", "Jupiter", "Saturn", "Mars"));
//                list.add(new QuestionData(R.string.topic1_question10, "F=m×a", "E=m×c^2", "P=F/A", "W=m×g", "F=m×a"));
//                //...
//                list.add(new QuestionData(R.string.topic1_question11, "Wo", "Wt", "H2O", "O2H", "H2O"));
//                list.add(new QuestionData(R.string.topic1_question12, "Wind", "Fossil fuels", "Sun", "Geothermal", "Sun"));
//                list.add(new QuestionData(R.string.topic1_question13, "Volt", "Ampere", "Watt", "Ohm", "Ampere"));
//                list.add(new QuestionData(R.string.topic1_question14, "Nitrogen", "Oxygen", "Carbon dioxide", "Hydrogen", "Carbon dioxide"));
//                list.add(new QuestionData(R.string.topic1_question15, "Magnetism", "Gravity", "Friction", "Buoyancy", "Gravity"));
//                list.add(new QuestionData(R.string.topic1_question16, "Coal", "Solar power", "Natural gas", "Nuclear power", "Solar power"));
//                list.add(new QuestionData(R.string.topic1_question17, "Atom", "Molecule", "Cell", "Particle", "Atom"));
//                list.add(new QuestionData(R.string.topic1_question18, "Tilt of the Earth's axis", "Distance from the sun", "Earth's rotation speed", "Atmospheric pressure", "Tilt of the Earth's axis"));
//                list.add(new QuestionData(R.string.topic1_question19, "Nucleus", "Endoplasmic reticulum", "Golgi apparatus", "Lysosome", "Golgi apparatus"));
//                list.add(new QuestionData(R.string.topic1_question20, "NaCl", "H2O", "CO2", "CH4", "NaCl"));
//                break;

//            case COUNTRIES:
//                list.add(new QuestionData(R.string.topic2_question1, "Sydney", "Melbourne", "Canberra", "Brisbane", "Canberra"));
//                list.add(new QuestionData(R.string.topic2_question2, "China", "Japan", "South Korea", "Thailand", "Japan"));
//                list.add(new QuestionData(R.string.topic2_question3, "Portuguese", "Spanish", "Italian", "French", "Portuguese"));
//                list.add(new QuestionData(R.string.topic2_question4, "Asia", "Africa", "Europe", "Australia", "Africa"));
//                list.add(new QuestionData(R.string.topic2_question5, "United States", "Russia", "China", "Canada", "Russia"));
//                list.add(new QuestionData(R.string.topic2_question6, "Mexico", "Australia", "Egypt", "Brazil", "Australia"));
//                list.add(new QuestionData(R.string.topic2_question7, "Yen", "Wong", "Yuan", "Ringgit", "Yen"));
//                list.add(new QuestionData(R.string.topic2_question8, "France", "Italy", "Netherlands", "Germany", "Netherlands"));
//                list.add(new QuestionData(R.string.topic2_question9, "Amazon River", "Nile River", "Mississippi River", "Yangtze River", "Nile River"));
//                list.add(new QuestionData(R.string.topic2_question10, "Greece", "Turkey", "Jordan", "Egypt", "Jordan"));
//                //...
//                list.add(new QuestionData(R.string.topic2_question11, "Australia", "Greenland", "Indonesia", "Japan", "Greenland"));
//                list.add(new QuestionData(R.string.topic2_question12, "Norway", "Sweden", "Finland", "Iceland", "Norway"));
//                list.add(new QuestionData(R.string.topic2_question13, "Asia", "Africa", "South America", "North America", "Africa"));
//                list.add(new QuestionData(R.string.topic2_question14, "English", "Zulu", "Afrikaans", "Swahili", "English"));
//                list.add(new QuestionData(R.string.topic2_question15, "Mexico", "Peru", "Chile", "Argentina", "Peru"));
//                list.add(new QuestionData(R.string.topic2_question16, "Rupiah", "Rupee", "Baht", "Ringgit", "Rupee"));
//                list.add(new QuestionData(R.string.topic2_question17, "Norway", "Switzerland", "Austria", "Sweden", "Norway"));
//                list.add(new QuestionData(R.string.topic2_question18, "Monaco", "Vatican City", "San Marino", "Liechtenstein", "Vatican City"));
//                list.add(new QuestionData(R.string.topic2_question19, "Tigris", "Euphrates", "Nile", "Danube", "Nile"));
//                list.add(new QuestionData(R.string.topic2_question20, "Maldives", "Sri Lanka", "Seychelles", "Mauritius", "Sri Lanka"));
//                break;

//            case PLANET:
//                list.add(new QuestionData(R.string.topic3_question1, "Venus", "Earth", "Mars", "Jupiter", "Mars"));
//                list.add(new QuestionData(R.string.topic3_question2, "Earth", "Jupiter", "Saturn", "Neptune", "Jupiter"));
//                list.add(new QuestionData(R.string.topic3_question3, "Venus", "Mercury", "Mars", "Earth", "Mercury"));
//                list.add(new QuestionData(R.string.topic3_question4, "Venus", "Mars", "Jupiter", "Saturn", "Venus"));
//                list.add(new QuestionData(R.string.topic3_question5, "Titan", "Ganymede", "Europa", "Callisto", "Ganymede"));
//                list.add(new QuestionData(R.string.topic3_question6, "Mars", "Earth", "Uranus", "Neptune", "Earth"));
//                list.add(new QuestionData(R.string.topic3_question7, "A giant storm", "A mountain range", "A desert", "A volcano", "A giant storm"));
//                list.add(new QuestionData(R.string.topic3_question8, "Mars", "Jupiter", "Saturn", "Uranus", "Saturn"));
//                list.add(new QuestionData(R.string.topic3_question9, "Mars", "Mercury", "Earth", "Venus", "Mercury"));
//                list.add(new QuestionData(R.string.topic3_question10, "Saturn", "Uranus", "Neptune", "Jupiter", "Saturn"));
//                list.add(new QuestionData(R.string.topic3_question11, "Neptune", "Uranus", "Saturn", "Jupiter", "Uranus"));
//                list.add(new QuestionData(R.string.topic3_question12, "Mount Everest", "Olympus Mons", "Mauna Kea", "Mount Vesuvius", "Olympus Mons"));
//                list.add(new QuestionData(R.string.topic3_question13, "Venus", "Mars", "Jupiter", "Saturn", "Venus"));
//                list.add(new QuestionData(R.string.topic3_question14, "Voyager", "Galileo", "Cassini", "Hubble", "Cassini"));
//                list.add(new QuestionData(R.string.topic3_question15, "Mars", "Venus", "Mercury", "Jupiter", "Venus"));
//                list.add(new QuestionData(R.string.topic3_question16, "Oxygen", "Helium", "Methane", "Hydrogen", "Hydrogen"));
//                list.add(new QuestionData(R.string.topic3_question17, "Neptune", "Saturn", "Uranus", "Jupiter", "Jupiter"));
//                list.add(new QuestionData(R.string.topic3_question18, "Voyager 1", "Hubble Space Telescope", "Mars Rover", "ISS (International Space Station)", "Voyager 1"));
//                list.add(new QuestionData(R.string.topic3_question19, "Venus", "Mercury", "Earth", "Mars", "Venus"));
//                list.add(new QuestionData(R.string.topic3_question20, "Europa", "Titan", "Enceladus", "Io", "Enceladus"));

//                break;


            case PHP:

                list.add(new QuestionData(R.string.topic_php_question1, R.string.topic_php_question1_option1, R.string.topic_php_question1_option2, R.string.topic_php_question1_option3, R.string.topic_php_question1_option4, R.string.topic_php_question1_option2));
                list.add(new QuestionData(R.string.topic_php_question2, R.string.topic_php_question2_option1, R.string.topic_php_question2_option2, R.string.topic_php_question2_option3, R.string.topic_php_question2_option4, R.string.topic_php_question2_option2));
                list.add(new QuestionData(R.string.topic_php_question3, R.string.topic_php_question3_option1, R.string.topic_php_question3_option2, R.string.topic_php_question3_option3, R.string.topic_php_question3_option4, R.string.topic_php_question3_option2));
                list.add(new QuestionData(R.string.topic_php_question4, R.string.topic_php_question4_option1, R.string.topic_php_question4_option2, R.string.topic_php_question4_option3, R.string.topic_php_question4_option4, R.string.topic_php_question4_option1));
                list.add(new QuestionData(R.string.topic_php_question5, R.string.topic_php_question5_option1, R.string.topic_php_question5_option2, R.string.topic_php_question5_option3, R.string.topic_php_question5_option4, R.string.topic_php_question5_option1));
                list.add(new QuestionData(R.string.topic_php_question6, R.string.topic_php_question6_option1, R.string.topic_php_question6_option2, R.string.topic_php_question6_option3, R.string.topic_php_question6_option4, R.string.topic_php_question6_option1));
                list.add(new QuestionData(R.string.topic_php_question7, R.string.topic_php_question7_option1, R.string.topic_php_question7_option2, R.string.topic_php_question7_option3, R.string.topic_php_question7_option4, R.string.topic_php_question7_option1));
                list.add(new QuestionData(R.string.topic_php_question8, R.string.topic_php_question8_option1, R.string.topic_php_question8_option2, R.string.topic_php_question8_option3, R.string.topic_php_question8_option4, R.string.topic_php_question8_option2));
                list.add(new QuestionData(R.string.topic_php_question9, R.string.topic_php_question9_option1, R.string.topic_php_question9_option2, R.string.topic_php_question9_option3, R.string.topic_php_question9_option4, R.string.topic_php_question9_option1));
                list.add(new QuestionData(R.string.topic_php_question10, R.string.topic_php_question10_option1, R.string.topic_php_question10_option2, R.string.topic_php_question10_option3, R.string.topic_php_question10_option4, R.string.topic_php_question10_option2));
                list.add(new QuestionData(R.string.topic_php_question11, R.string.topic_php_question11_option1, R.string.topic_php_question11_option2, R.string.topic_php_question11_option3, R.string.topic_php_question11_option4, R.string.topic_php_question11_option2));
                list.add(new QuestionData(R.string.topic_php_question12, R.string.topic_php_question12_option1, R.string.topic_php_question12_option2, R.string.topic_php_question12_option3, R.string.topic_php_question12_option4, R.string.topic_php_question12_option1));
                list.add(new QuestionData(R.string.topic_php_question13, R.string.topic_php_question13_option1, R.string.topic_php_question13_option2, R.string.topic_php_question13_option3, R.string.topic_php_question13_option4, R.string.topic_php_question13_option2));
                list.add(new QuestionData(R.string.topic_php_question14, R.string.topic_php_question14_option1, R.string.topic_php_question14_option2, R.string.topic_php_question14_option3, R.string.topic_php_question14_option4, R.string.topic_php_question14_option1));
                list.add(new QuestionData(R.string.topic_php_question15, R.string.topic_php_question15_option1, R.string.topic_php_question15_option2, R.string.topic_php_question15_option3, R.string.topic_php_question15_option4, R.string.topic_php_question15_option1));
                list.add(new QuestionData(R.string.topic_php_question16, R.string.topic_php_question16_option1, R.string.topic_php_question16_option2, R.string.topic_php_question16_option3, R.string.topic_php_question16_option4, R.string.topic_php_question16_option3));
                list.add(new QuestionData(R.string.topic_php_question17, R.string.topic_php_question17_option1, R.string.topic_php_question17_option2, R.string.topic_php_question17_option3, R.string.topic_php_question17_option4, R.string.topic_php_question17_option2));
                list.add(new QuestionData(R.string.topic_php_question18, R.string.topic_php_question18_option1, R.string.topic_php_question18_option2, R.string.topic_php_question18_option3, R.string.topic_php_question18_option4, R.string.topic_php_question18_option1));
                list.add(new QuestionData(R.string.topic_php_question19, R.string.topic_php_question19_option1, R.string.topic_php_question19_option2, R.string.topic_php_question19_option3, R.string.topic_php_question19_option4, R.string.topic_php_question19_option4));
                list.add(new QuestionData(R.string.topic_php_question20, R.string.topic_php_question20_option1, R.string.topic_php_question20_option2, R.string.topic_php_question20_option3, R.string.topic_php_question20_option4, R.string.topic_php_question20_option1));
                list.add(new QuestionData(R.string.topic_php_question21, R.string.topic_php_question21_option1, R.string.topic_php_question21_option2, R.string.topic_php_question21_option3, R.string.topic_php_question21_option4, R.string.topic_php_question21_option2));
                list.add(new QuestionData(R.string.topic_php_question22, R.string.topic_php_question22_option1, R.string.topic_php_question22_option2, R.string.topic_php_question22_option3, R.string.topic_php_question22_option4, R.string.topic_php_question22_option2));
                list.add(new QuestionData(R.string.topic_php_question23, R.string.topic_php_question23_option1, R.string.topic_php_question23_option2, R.string.topic_php_question23_option3, R.string.topic_php_question23_option4, R.string.topic_php_question23_option4));
                list.add(new QuestionData(R.string.topic_php_question24, R.string.topic_php_question24_option1, R.string.topic_php_question24_option2, R.string.topic_php_question24_option3, R.string.topic_php_question24_option4, R.string.topic_php_question24_option4));
                list.add(new QuestionData(R.string.topic_php_question25, R.string.topic_php_question25_option1, R.string.topic_php_question25_option2, R.string.topic_php_question25_option3, R.string.topic_php_question25_option4, R.string.topic_php_question25_option2));
                list.add(new QuestionData(R.string.topic_php_question26, R.string.topic_php_question26_option1, R.string.topic_php_question26_option2, R.string.topic_php_question26_option3, R.string.topic_php_question26_option4, R.string.topic_php_question26_option1));
                list.add(new QuestionData(R.string.topic_php_question27, R.string.topic_php_question27_option1, R.string.topic_php_question27_option2, R.string.topic_php_question27_option3, R.string.topic_php_question27_option4, R.string.topic_php_question27_option3));
                list.add(new QuestionData(R.string.topic_php_question28, R.string.topic_php_question28_option1, R.string.topic_php_question28_option2, R.string.topic_php_question28_option3, R.string.topic_php_question28_option4, R.string.topic_php_question28_option1));
                list.add(new QuestionData(R.string.topic_php_question29, R.string.topic_php_question29_option1, R.string.topic_php_question29_option2, R.string.topic_php_question29_option3, R.string.topic_php_question29_option4, R.string.topic_php_question29_option2));
                list.add(new QuestionData(R.string.topic_php_question30, R.string.topic_php_question30_option1, R.string.topic_php_question30_option2, R.string.topic_php_question30_option3, R.string.topic_php_question30_option4, R.string.topic_php_question30_option2));
                list.add(new QuestionData(R.string.topic_php_question31, R.string.topic_php_question31_option1, R.string.topic_php_question31_option2, R.string.topic_php_question31_option3, R.string.topic_php_question31_option4, R.string.topic_php_question31_option4));
                list.add(new QuestionData(R.string.topic_php_question32, R.string.topic_php_question32_option1, R.string.topic_php_question32_option2, R.string.topic_php_question32_option3, R.string.topic_php_question32_option4, R.string.topic_php_question32_option3));
                list.add(new QuestionData(R.string.topic_php_question33, R.string.topic_php_question33_option1, R.string.topic_php_question33_option2, R.string.topic_php_question33_option3, R.string.topic_php_question33_option4, R.string.topic_php_question33_option1));
                list.add(new QuestionData(R.string.topic_php_question34, R.string.topic_php_question34_option1, R.string.topic_php_question34_option2, R.string.topic_php_question34_option3, R.string.topic_php_question34_option4, R.string.topic_php_question34_option2));
                list.add(new QuestionData(R.string.topic_php_question35, R.string.topic_php_question35_option1, R.string.topic_php_question35_option2, R.string.topic_php_question35_option3, R.string.topic_php_question35_option4, R.string.topic_php_question35_option3));
                list.add(new QuestionData(R.string.topic_php_question36, R.string.topic_php_question36_option1, R.string.topic_php_question36_option2, R.string.topic_php_question36_option3, R.string.topic_php_question36_option4, R.string.topic_php_question36_option1));
                list.add(new QuestionData(R.string.topic_php_question37, R.string.topic_php_question37_option1, R.string.topic_php_question37_option2, R.string.topic_php_question37_option3, R.string.topic_php_question37_option4, R.string.topic_php_question37_option2));
                list.add(new QuestionData(R.string.topic_php_question38, R.string.topic_php_question38_option1, R.string.topic_php_question38_option2, R.string.topic_php_question38_option3, R.string.topic_php_question38_option4, R.string.topic_php_question38_option1));
                list.add(new QuestionData(R.string.topic_php_question39, R.string.topic_php_question39_option1, R.string.topic_php_question39_option2, R.string.topic_php_question39_option3, R.string.topic_php_question39_option4, R.string.topic_php_question39_option2));
                list.add(new QuestionData(R.string.topic_php_question40, R.string.topic_php_question40_option1, R.string.topic_php_question40_option2, R.string.topic_php_question40_option3, R.string.topic_php_question40_option4, R.string.topic_php_question40_option2));
                list.add(new QuestionData(R.string.topic_php_question41, R.string.topic_php_question41_option1, R.string.topic_php_question41_option2, R.string.topic_php_question41_option3, R.string.topic_php_question41_option4, R.string.topic_php_question41_option1));
                list.add(new QuestionData(R.string.topic_php_question42, R.string.topic_php_question42_option1, R.string.topic_php_question42_option2, R.string.topic_php_question42_option3, R.string.topic_php_question42_option4, R.string.topic_php_question42_option1));
                list.add(new QuestionData(R.string.topic_php_question43, R.string.topic_php_question43_option1, R.string.topic_php_question43_option2, R.string.topic_php_question43_option3, R.string.topic_php_question43_option4, R.string.topic_php_question43_option1));
                list.add(new QuestionData(R.string.topic_php_question44, R.string.topic_php_question44_option1, R.string.topic_php_question44_option2, R.string.topic_php_question44_option3, R.string.topic_php_question44_option4, R.string.topic_php_question44_option4));
                list.add(new QuestionData(R.string.topic_php_question45, R.string.topic_php_question45_option1, R.string.topic_php_question45_option2, R.string.topic_php_question45_option3, R.string.topic_php_question45_option4, R.string.topic_php_question45_option4));
                list.add(new QuestionData(R.string.topic_php_question46, R.string.topic_php_question46_option1, R.string.topic_php_question46_option2, R.string.topic_php_question46_option3, R.string.topic_php_question46_option4, R.string.topic_php_question46_option1));
                list.add(new QuestionData(R.string.topic_php_question47, R.string.topic_php_question47_option1, R.string.topic_php_question47_option2, R.string.topic_php_question47_option3, R.string.topic_php_question47_option4, R.string.topic_php_question47_option1));
                list.add(new QuestionData(R.string.topic_php_question48, R.string.topic_php_question48_option1, R.string.topic_php_question48_option2, R.string.topic_php_question48_option3, R.string.topic_php_question48_option4, R.string.topic_php_question48_option1));
                list.add(new QuestionData(R.string.topic_php_question49, R.string.topic_php_question49_option1, R.string.topic_php_question49_option2, R.string.topic_php_question49_option3, R.string.topic_php_question49_option4, R.string.topic_php_question49_option2));
                list.add(new QuestionData(R.string.topic_php_question50, R.string.topic_php_question50_option1, R.string.topic_php_question50_option2, R.string.topic_php_question50_option3, R.string.topic_php_question50_option4, R.string.topic_php_question50_option2));

                break;


            case JAVA:
//                list.add(new QuestionData(R.string.topic4_question1, "variable x;", "int x;", "x = int;", "new Variable(x);", "int x;"));
//                list.add(new QuestionData(R.string.topic4_question2, "array x = new array();", "int[] x = new int[];", "int x[] = new int[5];", "x = {1, 2, 3, 4, 5};", "int x[] = new int[5];"));
//                list.add(new QuestionData(R.string.topic4_question3, "To make a variable constant", "To indicate that a method belongs to the class, not an instance", "To allow dynamic method dispatch", "To declare a variable with a fixed value", "111To indicate that a method belongs to the class, not an instance1"));
//                list.add(new QuestionData(R.string.topic4_question4, "int", "float", "string", "char", "string"));
//                list.add(new QuestionData(R.string.topic4_question5, "/* comment */", "// comment", "-- comment --", "comment /*", "// comment"));
//                list.add(new QuestionData(R.string.topic4_question6, "To end the loop", "To exit the program", "To skip the current iteration and move to the next one", "To exit the switch statement", "To exit the switch statement"));
//                list.add(new QuestionData(R.string.topic4_question7, "true", "false", "0", "1", "false"));
//                list.add(new QuestionData(R.string.topic4_question8, "int x = Integer.parseInt(\"123\");", "int x = String.valueOf(123);", "int x = Integer.valueOf(\"123\");", "int x = \"123\".toInt();", "int x = Integer.parseInt(\"123\");"));
//                list.add(new QuestionData(R.string.topic4_question9, "To access the superclass's members", "To call a static method", "To create an instance of a class", "To denote a variable as constant", "To access the superclass's members"));
//                list.add(new QuestionData(R.string.topic4_question10, "Thread.start();", "new Thread().init();", "Thread.run();", "create Thread();", "Thread.start();"));
//                list.add(new QuestionData(R.string.topic4_question11, "2.5", "2", "2.0", "3", "2"));
//                list.add(new QuestionData(R.string.topic4_question12, "const int x = 5;", "final int x = 5;", "constant int x = 5;", "static final int x = 5;", "final int x = 5;"));
//                list.add(new QuestionData(R.string.topic4_question13, "To refer to the current instance of the class", "To create a new object", "To access a static variable", "To declare a constructor", "To refer to the current instance of the class"));
//                list.add(new QuestionData(R.string.topic4_question14, "Interfaces cannot have methods", "Interfaces can have constructors", "Interfaces can have multiple inheritance", "Interfaces can only have private members", "Interfaces can have multiple inheritance"));
//                list.add(new QuestionData(R.string.topic4_question15, "To create resizable arrays", "To build string sequences efficiently", "To parse XML documents", "To manipulate graphical objects", "To build string sequences efficiently"));
//                list.add(new QuestionData(R.string.topic4_question16, "To specify the conditions under which an exception is thrown", "To catch and handle exceptions", "To indicate the end of a program", "To define constant variables", "To catch and handle exceptions"));
//                list.add(new QuestionData(R.string.topic4_question17, "while (true) {}", "for (;;) {}", "do {} while (true);", "All of the above", "All of the above"));
//                list.add(new QuestionData(R.string.topic4_question18, "A physical computer", "A compiler", "A runtime environment for Java bytecode", "A version control system", "A runtime environment for Java bytecode"));
//                list.add(new QuestionData(R.string.topic4_question19, "To implement an interface", "To declare a constructor", "To indicate inheritance", "To create a new object", "To indicate inheritance"));
//                list.add(new QuestionData(R.string.topic4_question20, "By making the method final", "By making the method abstract", "By using the override keyword", "By declaring the method as static", "By making the method final"));

                list.add(new QuestionData(R.string.topic_4_question1, R.string.topic_4_question1_option1, R.string.topic_4_question1_option2, R.string.topic_4_question1_option3, R.string.topic_4_question1_option4, R.string.topic_4_question1_option3));
                list.add(new QuestionData(R.string.topic_4_question2, R.string.topic_4_question2_option1, R.string.topic_4_question2_option2, R.string.topic_4_question2_option3, R.string.topic_4_question2_option4, R.string.topic_4_question2_option2));
                list.add(new QuestionData(R.string.topic_4_question3, R.string.topic_4_question3_option1, R.string.topic_4_question3_option2, R.string.topic_4_question3_option3, R.string.topic_4_question3_option4, R.string.topic_4_question3_option2));
                list.add(new QuestionData(R.string.topic_4_question4, R.string.topic_4_question4_option1, R.string.topic_4_question4_option2, R.string.topic_4_question4_option3, R.string.topic_4_question4_option4, R.string.topic_4_question4_option1));
                list.add(new QuestionData(R.string.topic_4_question5, R.string.topic_4_question5_option1, R.string.topic_4_question5_option2, R.string.topic_4_question5_option3, R.string.topic_4_question5_option4, R.string.topic_4_question5_option4));
                list.add(new QuestionData(R.string.topic_4_question6, R.string.topic_4_question6_option1, R.string.topic_4_question6_option2, R.string.topic_4_question6_option3, R.string.topic_4_question6_option4, R.string.topic_4_question6_option2));
                list.add(new QuestionData(R.string.topic_4_question7, R.string.topic_4_question7_option1, R.string.topic_4_question7_option2, R.string.topic_4_question7_option3, R.string.topic_4_question7_option4, R.string.topic_4_question7_option4));
                list.add(new QuestionData(R.string.topic_4_question8, R.string.topic_4_question8_option1, R.string.topic_4_question8_option2, R.string.topic_4_question8_option3, R.string.topic_4_question8_option4, R.string.topic_4_question8_option4));
                list.add(new QuestionData(R.string.topic_4_question9, R.string.topic_4_question9_option1, R.string.topic_4_question9_option2, R.string.topic_4_question9_option3, R.string.topic_4_question9_option4, R.string.topic_4_question9_option1));
                list.add(new QuestionData(R.string.topic_4_question10, R.string.topic_4_question10_option1, R.string.topic_4_question10_option2, R.string.topic_4_question10_option3, R.string.topic_4_question10_option4, R.string.topic_4_question10_option1));
                list.add(new QuestionData(R.string.topic_4_question11, R.string.topic_4_question11_option1, R.string.topic_4_question11_option2, R.string.topic_4_question11_option3, R.string.topic_4_question11_option4, R.string.topic_4_question11_option2));
                list.add(new QuestionData(R.string.topic_4_question12, R.string.topic_4_question12_option1, R.string.topic_4_question12_option2, R.string.topic_4_question12_option3, R.string.topic_4_question12_option4, R.string.topic_4_question12_option2));
                list.add(new QuestionData(R.string.topic_4_question13, R.string.topic_4_question13_option1, R.string.topic_4_question13_option2, R.string.topic_4_question13_option3, R.string.topic_4_question13_option4, R.string.topic_4_question13_option1));
                list.add(new QuestionData(R.string.topic_4_question14, R.string.topic_4_question14_option1, R.string.topic_4_question14_option2, R.string.topic_4_question14_option3, R.string.topic_4_question14_option4, R.string.topic_4_question14_option1));
                list.add(new QuestionData(R.string.topic_4_question15, R.string.topic_4_question15_option1, R.string.topic_4_question15_option2, R.string.topic_4_question15_option3, R.string.topic_4_question15_option4, R.string.topic_4_question15_option4));
                list.add(new QuestionData(R.string.topic_4_question16, R.string.topic_4_question16_option1, R.string.topic_4_question16_option2, R.string.topic_4_question16_option3, R.string.topic_4_question16_option4, R.string.topic_4_question16_option2));
                list.add(new QuestionData(R.string.topic_4_question17, R.string.topic_4_question17_option1, R.string.topic_4_question17_option2, R.string.topic_4_question17_option3, R.string.topic_4_question17_option4, R.string.topic_4_question17_option1));
                list.add(new QuestionData(R.string.topic_4_question18, R.string.topic_4_question18_option1, R.string.topic_4_question18_option2, R.string.topic_4_question18_option3, R.string.topic_4_question18_option4, R.string.topic_4_question18_option1));
                list.add(new QuestionData(R.string.topic_4_question19, R.string.topic_4_question19_option1, R.string.topic_4_question19_option2, R.string.topic_4_question19_option3, R.string.topic_4_question19_option4, R.string.topic_4_question19_option2));
                list.add(new QuestionData(R.string.topic_4_question20, R.string.topic_4_question20_option1, R.string.topic_4_question20_option2, R.string.topic_4_question20_option3, R.string.topic_4_question20_option4, R.string.topic_4_question20_option1));
                list.add(new QuestionData(R.string.topic_4_question21, R.string.topic_4_question21_option1, R.string.topic_4_question21_option2, R.string.topic_4_question21_option3, R.string.topic_4_question21_option4, R.string.topic_4_question21_option1));
                list.add(new QuestionData(R.string.topic_4_question22, R.string.topic_4_question22_option1, R.string.topic_4_question22_option2, R.string.topic_4_question22_option3, R.string.topic_4_question22_option4, R.string.topic_4_question22_option1));
                list.add(new QuestionData(R.string.topic_4_question23, R.string.topic_4_question23_option1, R.string.topic_4_question23_option2, R.string.topic_4_question23_option3, R.string.topic_4_question23_option4, R.string.topic_4_question23_option2));
                list.add(new QuestionData(R.string.topic_4_question24, R.string.topic_4_question24_option1, R.string.topic_4_question24_option2, R.string.topic_4_question24_option3, R.string.topic_4_question24_option4, R.string.topic_4_question24_option4));
                list.add(new QuestionData(R.string.topic_4_question25, R.string.topic_4_question25_option1, R.string.topic_4_question25_option2, R.string.topic_4_question25_option3, R.string.topic_4_question25_option4, R.string.topic_4_question25_option1));
                list.add(new QuestionData(R.string.topic_4_question26, R.string.topic_4_question26_option1, R.string.topic_4_question26_option2, R.string.topic_4_question26_option3, R.string.topic_4_question26_option4, R.string.topic_4_question26_option2));
                list.add(new QuestionData(R.string.topic_4_question27, R.string.topic_4_question27_option1, R.string.topic_4_question27_option2, R.string.topic_4_question27_option3, R.string.topic_4_question27_option4, R.string.topic_4_question27_option1));
                list.add(new QuestionData(R.string.topic_4_question28, R.string.topic_4_question28_option1, R.string.topic_4_question28_option2, R.string.topic_4_question28_option3, R.string.topic_4_question28_option4, R.string.topic_4_question28_option1));
                list.add(new QuestionData(R.string.topic_4_question29, R.string.topic_4_question29_option1, R.string.topic_4_question29_option2, R.string.topic_4_question29_option3, R.string.topic_4_question29_option4, R.string.topic_4_question29_option4));
                list.add(new QuestionData(R.string.topic_4_question30, R.string.topic_4_question30_option1, R.string.topic_4_question30_option2, R.string.topic_4_question30_option3, R.string.topic_4_question30_option4, R.string.topic_4_question30_option2));
                list.add(new QuestionData(R.string.topic_4_question31, R.string.topic_4_question31_option1, R.string.topic_4_question31_option2, R.string.topic_4_question31_option3, R.string.topic_4_question31_option4, R.string.topic_4_question31_option2));
                list.add(new QuestionData(R.string.topic_4_question32, R.string.topic_4_question32_option1, R.string.topic_4_question32_option2, R.string.topic_4_question32_option3, R.string.topic_4_question32_option4, R.string.topic_4_question32_option1));
                list.add(new QuestionData(R.string.topic_4_question33, R.string.topic_4_question33_option1, R.string.topic_4_question33_option2, R.string.topic_4_question33_option3, R.string.topic_4_question33_option4, R.string.topic_4_question33_option3));
                list.add(new QuestionData(R.string.topic_4_question34, R.string.topic_4_question34_option1, R.string.topic_4_question34_option2, R.string.topic_4_question34_option3, R.string.topic_4_question34_option4, R.string.topic_4_question34_option2));
                list.add(new QuestionData(R.string.topic_4_question35, R.string.topic_4_question35_option1, R.string.topic_4_question35_option2, R.string.topic_4_question35_option3, R.string.topic_4_question35_option4, R.string.topic_4_question35_option4));
                list.add(new QuestionData(R.string.topic_4_question36, R.string.topic_4_question36_option1, R.string.topic_4_question36_option2, R.string.topic_4_question36_option3, R.string.topic_4_question36_option4, R.string.topic_4_question36_option1));
                list.add(new QuestionData(R.string.topic_4_question37, R.string.topic_4_question37_option1, R.string.topic_4_question37_option2, R.string.topic_4_question37_option3, R.string.topic_4_question37_option4, R.string.topic_4_question37_option2));
                list.add(new QuestionData(R.string.topic_4_question38, R.string.topic_4_question38_option1, R.string.topic_4_question38_option2, R.string.topic_4_question38_option3, R.string.topic_4_question38_option4, R.string.topic_4_question38_option1));
                list.add(new QuestionData(R.string.topic_4_question39, R.string.topic_4_question39_option1, R.string.topic_4_question39_option2, R.string.topic_4_question39_option3, R.string.topic_4_question39_option4, R.string.topic_4_question39_option3));
                list.add(new QuestionData(R.string.topic_4_question40, R.string.topic_4_question40_option1, R.string.topic_4_question40_option2, R.string.topic_4_question40_option3, R.string.topic_4_question40_option4, R.string.topic_4_question40_option1));
                list.add(new QuestionData(R.string.topic_4_question41, R.string.topic_4_question41_option1, R.string.topic_4_question41_option2, R.string.topic_4_question41_option3, R.string.topic_4_question41_option4, R.string.topic_4_question41_option1));
                list.add(new QuestionData(R.string.topic_4_question42, R.string.topic_4_question42_option1, R.string.topic_4_question42_option2, R.string.topic_4_question42_option3, R.string.topic_4_question42_option4, R.string.topic_4_question42_option2));
                list.add(new QuestionData(R.string.topic_4_question43, R.string.topic_4_question43_option1, R.string.topic_4_question43_option2, R.string.topic_4_question43_option3, R.string.topic_4_question43_option4, R.string.topic_4_question43_option2));
                list.add(new QuestionData(R.string.topic_4_question44, R.string.topic_4_question44_option1, R.string.topic_4_question44_option2, R.string.topic_4_question44_option3, R.string.topic_4_question44_option4, R.string.topic_4_question44_option2));
                list.add(new QuestionData(R.string.topic_4_question45, R.string.topic_4_question45_option1, R.string.topic_4_question45_option2, R.string.topic_4_question45_option3, R.string.topic_4_question45_option4, R.string.topic_4_question45_option1));
                list.add(new QuestionData(R.string.topic_4_question46, R.string.topic_4_question46_option1, R.string.topic_4_question46_option2, R.string.topic_4_question46_option3, R.string.topic_4_question46_option4, R.string.topic_4_question46_option2));
                list.add(new QuestionData(R.string.topic_4_question47, R.string.topic_4_question47_option1, R.string.topic_4_question47_option2, R.string.topic_4_question47_option3, R.string.topic_4_question47_option4, R.string.topic_4_question47_option2));
                list.add(new QuestionData(R.string.topic_4_question48, R.string.topic_4_question48_option1, R.string.topic_4_question48_option2, R.string.topic_4_question48_option3, R.string.topic_4_question48_option4, R.string.topic_4_question48_option1));
                list.add(new QuestionData(R.string.topic_4_question49, R.string.topic_4_question49_option1, R.string.topic_4_question49_option2, R.string.topic_4_question49_option3, R.string.topic_4_question49_option4, R.string.topic_4_question49_option4));
                list.add(new QuestionData(R.string.topic_4_question50, R.string.topic_4_question50_option1, R.string.topic_4_question50_option2, R.string.topic_4_question50_option3, R.string.topic_4_question50_option4, R.string.topic_4_question50_option1));


                break;

            case KOTLIN:
//                list.add(new QuestionData(R.string.topic6_question1, "A programming language", "A data structure", "A web browser", "A hardware component", "A programming language"));
//                list.add(new QuestionData(R.string.topic6_question2, "val", "const", "let", "var", "var"));
//                list.add(new QuestionData(R.string.topic6_question3, "It indicates that a variable cannot be changed after initialization.", "It makes a variable nullable.", "It delays the initialization of a variable until it is first accessed.", "It enforces strict typing for a variable.", "It delays the initialization of a variable until it is first accessed."));
//                list.add(new QuestionData(R.string.topic6_question4, "It represents a bitwise OR operation", "It is used for exponentiation.", "It provides a default value if the expression on the left is null.", "It is a syntax error.", "It provides a default value if the expression on the left is null."));
//                list.add(new QuestionData(R.string.topic6_question5, "It declares a function.", "It defines a class.", "It creates an object.", "It is short for \"funny.\"", "It declares a function."));
//                list.add(new QuestionData(R.string.topic6_question6, "// This is a comment", "/* This is a comment */", "<!-- This is a comment -->", "-- This is a comment", "// This is a comment"));
//                list.add(new QuestionData(R.string.topic6_question7, "It creates a loop.", "It defines a class hierarchy.", "It replaces the switch statement from Java.", "It denotes a lambda expression.", "It replaces the switch statement from Java."));
//                list.add(new QuestionData(R.string.topic6_question8, "A type that cannot be assigned null.", "A type that can only be assigned null.", "A type that is not allowed in Kotlin.", "A type that may or may not hold a null value.", "A type that may or may not hold a null value."));
//                list.add(new QuestionData(R.string.topic6_question9, "It initializes the properties of a class.", "It initializes a variable.", "It defines a secondary constructor.", "It specifies the entry point of the program.", "It initializes the properties of a class."));
//                list.add(new QuestionData(R.string.topic6_question10, "class MyData { }", "data class MyData { }", "struct MyData { }", "record MyData { }", "data class MyData { }"));
//                list.add(new QuestionData(R.string.topic6_question11, "It initializes properties of a class.", "It defines a secondary constructor.", "It declares a variable.", "It creates a new instance of the class.", "It initializes properties of a class."));
//                list.add(new QuestionData(R.string.topic6_question12, "protected", "internal", "public", "private", "public"));
//                list.add(new QuestionData(R.string.topic6_question13, "(myLambda) => { }", "lambda myLambda { }", "fun myLambda() { }", "{ myLambda -> }", "{ myLambda -> }"));
//                list.add(new QuestionData(R.string.topic6_question14, "It repeats a block of code.", "It executes a block of code and returns the result.", "It defines a new thread.", "It runs the program.", "It executes a block of code and returns the result."));
//                list.add(new QuestionData(R.string.topic6_question15, "cast(type)", "convertTo(type)", "type.cast()", "as type", "as type"));
//                list.add(new QuestionData(R.string.topic6_question16, "It declares a lazy-loaded property.", "It defines a bi-directional association.", "It indicates a variable can only be assigned once.", "It is a syntax error.", "It declares a lazy-loaded property."));
//                list.add(new QuestionData(R.string.topic6_question17, "It cannot have any properties.", "It cannot have any subclasses.", "It is marked with the sealed modifier and can have a limited set of subclasses.", "It cannot be instantiated.", "It is marked with the sealed modifier and can have a limited set of subclasses."));
//                list.add(new QuestionData(R.string.topic6_question18, "It denotes inheritance.", "It specifies an input parameter.", "It represents an integer.", "It indicates contravariance.", "It indicates contravariance."));
//                list.add(new QuestionData(R.string.topic6_question19, "It is used for arithmetic operations.", "It executes a block of code and returns the receiver object.", "It performs bitwise operations.", "It represents an alias for a class.", "It executes a block of code and returns the receiver object."));
//                list.add(new QuestionData(R.string.topic6_question20, "const val myConstant = 10", "val myConstant: Const = 10", "final val myConstant = 10", "static val myConstant = 10", "const val myConstant = 10"));

                list.add(new QuestionData(R.string.topic6_question1, R.string.topic6_question1_option1, R.string.topic6_question1_option2, R.string.topic6_question1_option3, R.string.topic6_question1_option4, R.string.topic6_question1_option1));
                list.add(new QuestionData(R.string.topic6_question2, R.string.topic6_question2_option1, R.string.topic6_question2_option2, R.string.topic6_question2_option3, R.string.topic6_question2_option4, R.string.topic6_question2_option4));
                list.add(new QuestionData(R.string.topic6_question3, R.string.topic6_question3_option1, R.string.topic6_question3_option2, R.string.topic6_question3_option3, R.string.topic6_question3_option4, R.string.topic6_question3_option1));
                list.add(new QuestionData(R.string.topic6_question4, R.string.topic6_question4_option1, R.string.topic6_question4_option2, R.string.topic6_question4_option3, R.string.topic6_question4_option4, R.string.topic6_question4_option2));
                list.add(new QuestionData(R.string.topic6_question5, R.string.topic6_question5_option1, R.string.topic6_question5_option2, R.string.topic6_question5_option3, R.string.topic6_question5_option4, R.string.topic6_question5_option4));
                list.add(new QuestionData(R.string.topic6_question6, R.string.topic6_question6_option1, R.string.topic6_question6_option2, R.string.topic6_question6_option3, R.string.topic6_question6_option4, R.string.topic6_question6_option1));
                list.add(new QuestionData(R.string.topic6_question7, R.string.topic6_question7_option1, R.string.topic6_question7_option2, R.string.topic6_question7_option3, R.string.topic6_question7_option4, R.string.topic6_question7_option2));
                list.add(new QuestionData(R.string.topic6_question8, R.string.topic6_question8_option1, R.string.topic6_question8_option2, R.string.topic6_question8_option3, R.string.topic6_question8_option4, R.string.topic6_question8_option2));
                list.add(new QuestionData(R.string.topic6_question9, R.string.topic6_question9_option1, R.string.topic6_question9_option2, R.string.topic6_question9_option3, R.string.topic6_question9_option4, R.string.topic6_question9_option3));
                list.add(new QuestionData(R.string.topic6_question10, R.string.topic6_question10_option1, R.string.topic6_question10_option2, R.string.topic6_question10_option3, R.string.topic6_question10_option4, R.string.topic6_question10_option2));
                list.add(new QuestionData(R.string.topic6_question11, R.string.topic6_question11_option1, R.string.topic6_question11_option2, R.string.topic6_question11_option3, R.string.topic6_question11_option4, R.string.topic6_question11_option1));
                list.add(new QuestionData(R.string.topic6_question12, R.string.topic6_question12_option1, R.string.topic6_question12_option2, R.string.topic6_question12_option3, R.string.topic6_question12_option4, R.string.topic6_question12_option1));
                list.add(new QuestionData(R.string.topic6_question13, R.string.topic6_question13_option1, R.string.topic6_question13_option2, R.string.topic6_question13_option3, R.string.topic6_question13_option4, R.string.topic6_question13_option1));
                list.add(new QuestionData(R.string.topic6_question14, R.string.topic6_question14_option1, R.string.topic6_question14_option2, R.string.topic6_question14_option3, R.string.topic6_question14_option4, R.string.topic6_question14_option1));
                list.add(new QuestionData(R.string.topic6_question15, R.string.topic6_question15_option1, R.string.topic6_question15_option2, R.string.topic6_question15_option3, R.string.topic6_question15_option4, R.string.topic6_question15_option2));
                list.add(new QuestionData(R.string.topic6_question16, R.string.topic6_question16_option1, R.string.topic6_question16_option2, R.string.topic6_question16_option3, R.string.topic6_question16_option4, R.string.topic6_question16_option1));
                list.add(new QuestionData(R.string.topic6_question17, R.string.topic6_question17_option1, R.string.topic6_question17_option2, R.string.topic6_question17_option3, R.string.topic6_question17_option4, R.string.topic6_question17_option1));
                list.add(new QuestionData(R.string.topic6_question18, R.string.topic6_question18_option1, R.string.topic6_question18_option2, R.string.topic6_question18_option3, R.string.topic6_question18_option4, R.string.topic6_question18_option1));
                list.add(new QuestionData(R.string.topic6_question19, R.string.topic6_question19_option1, R.string.topic6_question19_option2, R.string.topic6_question19_option3, R.string.topic6_question19_option4, R.string.topic6_question19_option2));
                list.add(new QuestionData(R.string.topic6_question20, R.string.topic6_question20_option1, R.string.topic6_question20_option2, R.string.topic6_question20_option3, R.string.topic6_question20_option4, R.string.topic6_question20_option1));
                list.add(new QuestionData(R.string.topic6_question21, R.string.topic6_question21_option1, R.string.topic6_question21_option2, R.string.topic6_question21_option3, R.string.topic6_question21_option4, R.string.topic6_question21_option2));
                list.add(new QuestionData(R.string.topic6_question22, R.string.topic6_question22_option1, R.string.topic6_question22_option2, R.string.topic6_question22_option3, R.string.topic6_question22_option4, R.string.topic6_question22_option1));
                list.add(new QuestionData(R.string.topic6_question23, R.string.topic6_question23_option1, R.string.topic6_question23_option2, R.string.topic6_question23_option3, R.string.topic6_question23_option4, R.string.topic6_question23_option2));
                list.add(new QuestionData(R.string.topic6_question24, R.string.topic6_question24_option1, R.string.topic6_question24_option2, R.string.topic6_question24_option3, R.string.topic6_question24_option4, R.string.topic6_question24_option3));
                list.add(new QuestionData(R.string.topic6_question25, R.string.topic6_question25_option1, R.string.topic6_question25_option2, R.string.topic6_question25_option3, R.string.topic6_question25_option4, R.string.topic6_question25_option2));
                list.add(new QuestionData(R.string.topic6_question26, R.string.topic6_question26_option1, R.string.topic6_question26_option2, R.string.topic6_question26_option3, R.string.topic6_question26_option4, R.string.topic6_question26_option1));
                list.add(new QuestionData(R.string.topic6_question27, R.string.topic6_question27_option1, R.string.topic6_question27_option2, R.string.topic6_question27_option3, R.string.topic6_question27_option4, R.string.topic6_question27_option4));
                list.add(new QuestionData(R.string.topic6_question28, R.string.topic6_question28_option1, R.string.topic6_question28_option2, R.string.topic6_question28_option3, R.string.topic6_question28_option4, R.string.topic6_question28_option2));
                list.add(new QuestionData(R.string.topic6_question29, R.string.topic6_question29_option1, R.string.topic6_question29_option2, R.string.topic6_question29_option3, R.string.topic6_question29_option4, R.string.topic6_question29_option1));
                list.add(new QuestionData(R.string.topic6_question30, R.string.topic6_question30_option1, R.string.topic6_question30_option2, R.string.topic6_question30_option3, R.string.topic6_question30_option4, R.string.topic6_question30_option4));
                list.add(new QuestionData(R.string.topic6_question31, R.string.topic6_question31_option1, R.string.topic6_question31_option2, R.string.topic6_question31_option3, R.string.topic6_question31_option4, R.string.topic6_question31_option4));
                list.add(new QuestionData(R.string.topic6_question32, R.string.topic6_question32_option1, R.string.topic6_question32_option2, R.string.topic6_question32_option3, R.string.topic6_question32_option4, R.string.topic6_question32_option2));
                list.add(new QuestionData(R.string.topic6_question33, R.string.topic6_question33_option1, R.string.topic6_question33_option2, R.string.topic6_question33_option3, R.string.topic6_question33_option4, R.string.topic6_question33_option1));
                list.add(new QuestionData(R.string.topic6_question34, R.string.topic6_question34_option1, R.string.topic6_question34_option2, R.string.topic6_question34_option3, R.string.topic6_question34_option4, R.string.topic6_question34_option2));
                list.add(new QuestionData(R.string.topic6_question35, R.string.topic6_question35_option1, R.string.topic6_question35_option2, R.string.topic6_question35_option3, R.string.topic6_question35_option4, R.string.topic6_question35_option4));
                list.add(new QuestionData(R.string.topic6_question36, R.string.topic6_question36_option1, R.string.topic6_question36_option2, R.string.topic6_question36_option3, R.string.topic6_question36_option4, R.string.topic6_question36_option1));
                list.add(new QuestionData(R.string.topic6_question37, R.string.topic6_question37_option1, R.string.topic6_question37_option2, R.string.topic6_question37_option3, R.string.topic6_question37_option4, R.string.topic6_question37_option4));
                list.add(new QuestionData(R.string.topic6_question38, R.string.topic6_question38_option1, R.string.topic6_question38_option2, R.string.topic6_question38_option3, R.string.topic6_question38_option4, R.string.topic6_question38_option1));
                list.add(new QuestionData(R.string.topic6_question39, R.string.topic6_question39_option1, R.string.topic6_question39_option2, R.string.topic6_question39_option3, R.string.topic6_question39_option4, R.string.topic6_question39_option4));
                list.add(new QuestionData(R.string.topic6_question40, R.string.topic6_question40_option1, R.string.topic6_question40_option2, R.string.topic6_question40_option3, R.string.topic6_question40_option4, R.string.topic6_question40_option4));
                list.add(new QuestionData(R.string.topic6_question41, R.string.topic6_question41_option1, R.string.topic6_question41_option2, R.string.topic6_question41_option3, R.string.topic6_question41_option4, R.string.topic6_question41_option3));
                list.add(new QuestionData(R.string.topic6_question42, R.string.topic6_question42_option1, R.string.topic6_question42_option2, R.string.topic6_question42_option3, R.string.topic6_question42_option4, R.string.topic6_question42_option1));
                list.add(new QuestionData(R.string.topic6_question43, R.string.topic6_question43_option1, R.string.topic6_question43_option2, R.string.topic6_question43_option3, R.string.topic6_question43_option4, R.string.topic6_question43_option3));
                list.add(new QuestionData(R.string.topic6_question44, R.string.topic6_question44_option1, R.string.topic6_question44_option2, R.string.topic6_question44_option3, R.string.topic6_question44_option4, R.string.topic6_question44_option1));
                list.add(new QuestionData(R.string.topic6_question45, R.string.topic6_question45_option1, R.string.topic6_question45_option2, R.string.topic6_question45_option3, R.string.topic6_question45_option4, R.string.topic6_question45_option2));
                list.add(new QuestionData(R.string.topic6_question46, R.string.topic6_question46_option1, R.string.topic6_question46_option2, R.string.topic6_question46_option3, R.string.topic6_question46_option4, R.string.topic6_question46_option1));
                list.add(new QuestionData(R.string.topic6_question47, R.string.topic6_question47_option1, R.string.topic6_question47_option2, R.string.topic6_question47_option3, R.string.topic6_question47_option4, R.string.topic6_question47_option3));
                list.add(new QuestionData(R.string.topic6_question48, R.string.topic6_question48_option1, R.string.topic6_question48_option2, R.string.topic6_question48_option3, R.string.topic6_question48_option4, R.string.topic6_question48_option1));
                list.add(new QuestionData(R.string.topic6_question49, R.string.topic6_question49_option1, R.string.topic6_question49_option2, R.string.topic6_question49_option3, R.string.topic6_question49_option4, R.string.topic6_question49_option4));
                list.add(new QuestionData(R.string.topic6_question50, R.string.topic6_question50_option1, R.string.topic6_question50_option2, R.string.topic6_question50_option3, R.string.topic6_question50_option4, R.string.topic6_question50_option1));

                break;


            case C__:
//                list.add(new QuestionData(R.string.topic7_question1, "var x;", "variable x;", "int x;", "x = int;", "int x;"));
//                list.add(new QuestionData(R.string.topic7_question2, "int arr[5] = {0};", "int arr[] = {0, 0, 0, 0, 0};", "int arr[5] = {1};", "int arr[5] = 0;", "int arr[] = {0, 0, 0, 0, 0};"));
//                list.add(new QuestionData(R.string.topic7_question3, "File operations", "Error handling", "Output", "Input", "Input"));
//                list.add(new QuestionData(R.string.topic7_question4, "alloc", "malloc", "new", "allocate", "new"));
//                list.add(new QuestionData(R.string.topic7_question5, "Terminate the program", "Skip the next iteration", "Exit the loop", "Exit the switch statement", "Exit the switch statement"));
//                list.add(new QuestionData(R.string.topic7_question6, "int &x = y;", "ref int x = y;", "ref x = y;", "int *x = &y;", "int &x = y;"));
//                list.add(new QuestionData(R.string.topic7_question7, "11", "12", "13", "14", "14"));
//                list.add(new QuestionData(R.string.topic7_question8, "ofstream file(\"example.txt\");", "file.open(\"example.txt\");", "file.open(\"example.txt\", \"w\");", "ifstream file(\"example.txt\");", "ofstream file(\"example.txt\");"));
//                list.add(new QuestionData(R.string.topic7_question9, "Declare a variable with a constant value", "Declare a constant variable", "Specify a constant class", "Create a constant function", "Declare a constant variable"));
//                list.add(new QuestionData(R.string.topic7_question10, "for loop", "while loop", "do-while loop", "switch loop", "do-while loop"));
//                list.add(new QuestionData(R.string.topic7_question11, "End the program", "Insert a newline character", "Declare the end of a loop", "Indicate the end of a function", "Insert a newline character"));
//                list.add(new QuestionData(R.string.topic7_question12, "int sum(int a, b);", "int add(int a, int b);", "sum(int a, int b);", "add(int a, b)", "int add(int a, int b);"));
//                list.add(new QuestionData(R.string.topic7_question13, "Declare a constant variable", "Allocate memory dynamically", "Specify internal linkage", "Indicate the end of a program", "Specify internal linkage"));
//                list.add(new QuestionData(R.string.topic7_question14, "2 bytes", "4 bytes", "8 bytes", "Depends of the compiler", "4 bytes"));
//                list.add(new QuestionData(R.string.topic7_question15, "myArray[0]", "myArray.first()", "myArray(1)", "first(myArray)", "myArray[0]"));
//                list.add(new QuestionData(R.string.topic7_question16, "Define a pure virtual machine", "Specify the function as static", "Enable function overloading", "Allow function overriding in derived classes", "Allow function overriding in derived classes"));
//                list.add(new QuestionData(R.string.topic7_question17, "::", "//", "--", "->", "::"));
//                list.add(new QuestionData(R.string.topic7_question18, "/* comment */", "# comment", "// comment", "-- comment", "// comment"));
//                list.add(new QuestionData(R.string.topic7_question19, "Value of the variable", "Memory address of the variable", "Size of the variable in bytes", "Type of the variable", "Size of the variable in bytes"));
//                list.add(new QuestionData(R.string.topic7_question20, "Memory location", "File handing", "Exception handing", "Loop control structures", "Exception handling"));

                list.add(new QuestionData(R.string.topic7_question1, R.string.topic7_question1_option1, R.string.topic7_question1_option2, R.string.topic7_question1_option3, R.string.topic7_question1_option4, R.string.topic7_question1_option3));
                list.add(new QuestionData(R.string.topic7_question2, R.string.topic7_question2_option1, R.string.topic7_question2_option2, R.string.topic7_question2_option3, R.string.topic7_question2_option4, R.string.topic7_question2_option1));
                list.add(new QuestionData(R.string.topic7_question3, R.string.topic7_question3_option1, R.string.topic7_question3_option2, R.string.topic7_question3_option3, R.string.topic7_question3_option4, R.string.topic7_question3_option4));
                list.add(new QuestionData(R.string.topic7_question4, R.string.topic7_question4_option1, R.string.topic7_question4_option2, R.string.topic7_question4_option3, R.string.topic7_question4_option4, R.string.topic7_question4_option3));
                list.add(new QuestionData(R.string.topic7_question5, R.string.topic7_question5_option1, R.string.topic7_question5_option2, R.string.topic7_question5_option3, R.string.topic7_question5_option4, R.string.topic7_question5_option4));
                list.add(new QuestionData(R.string.topic7_question6, R.string.topic7_question6_option1, R.string.topic7_question6_option2, R.string.topic7_question6_option3, R.string.topic7_question6_option4, R.string.topic7_question6_option1));
                list.add(new QuestionData(R.string.topic7_question7, R.string.topic7_question7_option1, R.string.topic7_question7_option2, R.string.topic7_question7_option3, R.string.topic7_question7_option4, R.string.topic7_question7_option3));
                list.add(new QuestionData(R.string.topic7_question8, R.string.topic7_question8_option1, R.string.topic7_question8_option2, R.string.topic7_question8_option3, R.string.topic7_question8_option4, R.string.topic7_question8_option3));
                list.add(new QuestionData(R.string.topic7_question9, R.string.topic7_question9_option1, R.string.topic7_question9_option2, R.string.topic7_question9_option3, R.string.topic7_question9_option4, R.string.topic7_question9_option1));
                list.add(new QuestionData(R.string.topic7_question10, R.string.topic7_question10_option1, R.string.topic7_question10_option2, R.string.topic7_question10_option3, R.string.topic7_question10_option4, R.string.topic7_question10_option3));
                list.add(new QuestionData(R.string.topic7_question11, R.string.topic7_question11_option1, R.string.topic7_question11_option2, R.string.topic7_question11_option3, R.string.topic7_question11_option4, R.string.topic7_question11_option2));
                list.add(new QuestionData(R.string.topic7_question12, R.string.topic7_question12_option1, R.string.topic7_question12_option2, R.string.topic7_question12_option3, R.string.topic7_question12_option4, R.string.topic7_question12_option2));
                list.add(new QuestionData(R.string.topic7_question13, R.string.topic7_question13_option1, R.string.topic7_question13_option2, R.string.topic7_question13_option3, R.string.topic7_question13_option4, R.string.topic7_question13_option3));
                list.add(new QuestionData(R.string.topic7_question14, R.string.topic7_question14_option1, R.string.topic7_question14_option2, R.string.topic7_question14_option3, R.string.topic7_question14_option4, R.string.topic7_question14_option2));
                list.add(new QuestionData(R.string.topic7_question15, R.string.topic7_question15_option1, R.string.topic7_question15_option2, R.string.topic7_question15_option3, R.string.topic7_question15_option4, R.string.topic7_question15_option1));
                list.add(new QuestionData(R.string.topic7_question16, R.string.topic7_question16_option1, R.string.topic7_question16_option2, R.string.topic7_question16_option3, R.string.topic7_question16_option4, R.string.topic7_question16_option4));
                list.add(new QuestionData(R.string.topic7_question17, R.string.topic7_question17_option1, R.string.topic7_question17_option2, R.string.topic7_question17_option3, R.string.topic7_question17_option4, R.string.topic7_question17_option1));
                list.add(new QuestionData(R.string.topic7_question18, R.string.topic7_question18_option1, R.string.topic7_question18_option2, R.string.topic7_question18_option3, R.string.topic7_question18_option4, R.string.topic7_question18_option3));
                list.add(new QuestionData(R.string.topic7_question19, R.string.topic7_question19_option1, R.string.topic7_question19_option2, R.string.topic7_question19_option3, R.string.topic7_question19_option4, R.string.topic7_question19_option3));
                list.add(new QuestionData(R.string.topic7_question20, R.string.topic7_question20_option1, R.string.topic7_question20_option2, R.string.topic7_question20_option3, R.string.topic7_question20_option4, R.string.topic7_question20_option3));
                list.add(new QuestionData(R.string.topic7_question21, R.string.topic7_question21_option1, R.string.topic7_question21_option2, R.string.topic7_question21_option3, R.string.topic7_question21_option4, R.string.topic7_question21_option1));
                list.add(new QuestionData(R.string.topic7_question22, R.string.topic7_question22_option1, R.string.topic7_question22_option2, R.string.topic7_question22_option3, R.string.topic7_question22_option4, R.string.topic7_question22_option4));
                list.add(new QuestionData(R.string.topic7_question23, R.string.topic7_question23_option1, R.string.topic7_question23_option2, R.string.topic7_question23_option3, R.string.topic7_question23_option4, R.string.topic7_question23_option3));
                list.add(new QuestionData(R.string.topic7_question24, R.string.topic7_question24_option1, R.string.topic7_question24_option2, R.string.topic7_question24_option3, R.string.topic7_question24_option4, R.string.topic7_question24_option4));
                list.add(new QuestionData(R.string.topic7_question25, R.string.topic7_question25_option1, R.string.topic7_question25_option2, R.string.topic7_question25_option3, R.string.topic7_question25_option4, R.string.topic7_question25_option1));
                list.add(new QuestionData(R.string.topic7_question26, R.string.topic7_question26_option1, R.string.topic7_question26_option2, R.string.topic7_question26_option3, R.string.topic7_question26_option4, R.string.topic7_question26_option1));
                list.add(new QuestionData(R.string.topic7_question27, R.string.topic7_question27_option1, R.string.topic7_question27_option2, R.string.topic7_question27_option3, R.string.topic7_question27_option4, R.string.topic7_question27_option1));
                list.add(new QuestionData(R.string.topic7_question28, R.string.topic7_question28_option1, R.string.topic7_question28_option2, R.string.topic7_question28_option3, R.string.topic7_question28_option4, R.string.topic7_question28_option1));
                list.add(new QuestionData(R.string.topic7_question29, R.string.topic7_question29_option1, R.string.topic7_question29_option2, R.string.topic7_question29_option3, R.string.topic7_question29_option4, R.string.topic7_question29_option3));
                list.add(new QuestionData(R.string.topic7_question30, R.string.topic7_question30_option1, R.string.topic7_question30_option2, R.string.topic7_question30_option3, R.string.topic7_question30_option4, R.string.topic7_question30_option2));
                list.add(new QuestionData(R.string.topic7_question31, R.string.topic7_question31_option1, R.string.topic7_question31_option2, R.string.topic7_question31_option3, R.string.topic7_question31_option4, R.string.topic7_question31_option2));
                list.add(new QuestionData(R.string.topic7_question32, R.string.topic7_question32_option1, R.string.topic7_question32_option2, R.string.topic7_question32_option3, R.string.topic7_question32_option4, R.string.topic7_question32_option3));
                list.add(new QuestionData(R.string.topic7_question33, R.string.topic7_question33_option1, R.string.topic7_question33_option2, R.string.topic7_question33_option3, R.string.topic7_question33_option4, R.string.topic7_question33_option4));
                list.add(new QuestionData(R.string.topic7_question34, R.string.topic7_question34_option1, R.string.topic7_question34_option2, R.string.topic7_question34_option3, R.string.topic7_question34_option4, R.string.topic7_question34_option1));
                list.add(new QuestionData(R.string.topic7_question35, R.string.topic7_question35_option1, R.string.topic7_question35_option2, R.string.topic7_question35_option3, R.string.topic7_question35_option4, R.string.topic7_question35_option4));
                list.add(new QuestionData(R.string.topic7_question36, R.string.topic7_question36_option1, R.string.topic7_question36_option2, R.string.topic7_question36_option3, R.string.topic7_question36_option4, R.string.topic7_question36_option1));
                list.add(new QuestionData(R.string.topic7_question37, R.string.topic7_question37_option1, R.string.topic7_question37_option2, R.string.topic7_question37_option3, R.string.topic7_question37_option4, R.string.topic7_question37_option3));
                list.add(new QuestionData(R.string.topic7_question38, R.string.topic7_question38_option1, R.string.topic7_question38_option2, R.string.topic7_question38_option3, R.string.topic7_question38_option4, R.string.topic7_question38_option3));
                list.add(new QuestionData(R.string.topic7_question39, R.string.topic7_question39_option1, R.string.topic7_question39_option2, R.string.topic7_question39_option3, R.string.topic7_question39_option4, R.string.topic7_question39_option3));
                list.add(new QuestionData(R.string.topic7_question40, R.string.topic7_question40_option1, R.string.topic7_question40_option2, R.string.topic7_question40_option3, R.string.topic7_question40_option4, R.string.topic7_question40_option1));
                list.add(new QuestionData(R.string.topic7_question41, R.string.topic7_question41_option1, R.string.topic7_question41_option2, R.string.topic7_question41_option3, R.string.topic7_question41_option4, R.string.topic7_question41_option4));
                list.add(new QuestionData(R.string.topic7_question42, R.string.topic7_question42_option1, R.string.topic7_question42_option2, R.string.topic7_question42_option3, R.string.topic7_question42_option4, R.string.topic7_question42_option3));
                list.add(new QuestionData(R.string.topic7_question43, R.string.topic7_question43_option1, R.string.topic7_question43_option2, R.string.topic7_question43_option3, R.string.topic7_question43_option4, R.string.topic7_question43_option4));
                list.add(new QuestionData(R.string.topic7_question44, R.string.topic7_question44_option1, R.string.topic7_question44_option2, R.string.topic7_question44_option3, R.string.topic7_question44_option4, R.string.topic7_question44_option1));
                list.add(new QuestionData(R.string.topic7_question45, R.string.topic7_question45_option1, R.string.topic7_question45_option2, R.string.topic7_question45_option3, R.string.topic7_question45_option4, R.string.topic7_question45_option1));
                list.add(new QuestionData(R.string.topic7_question46, R.string.topic7_question46_option1, R.string.topic7_question46_option2, R.string.topic7_question46_option3, R.string.topic7_question46_option4, R.string.topic7_question46_option1));
                list.add(new QuestionData(R.string.topic7_question47, R.string.topic7_question47_option1, R.string.topic7_question47_option2, R.string.topic7_question47_option3, R.string.topic7_question47_option4, R.string.topic7_question47_option1));
                list.add(new QuestionData(R.string.topic7_question48, R.string.topic7_question48_option1, R.string.topic7_question48_option2, R.string.topic7_question48_option3, R.string.topic7_question48_option4, R.string.topic7_question48_option3));
                list.add(new QuestionData(R.string.topic7_question49, R.string.topic7_question49_option1, R.string.topic7_question49_option2, R.string.topic7_question49_option3, R.string.topic7_question49_option4, R.string.topic7_question49_option4));
                list.add(new QuestionData(R.string.topic7_question50, R.string.topic7_question50_option1, R.string.topic7_question50_option2, R.string.topic7_question50_option3, R.string.topic7_question50_option4, R.string.topic7_question50_option1));

                break;

        }
    }
}


