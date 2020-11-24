import cinema.Cinema;
import org.hyperskill.hstest.dynamic.input.DynamicTestingMethod;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testing.TestedProgram;

public class CinemaTests extends StageTest<String> {

    @DynamicTestingMethod
    CheckResult test1_testOutput() {

        TestedProgram program = new TestedProgram(Cinema.class);
        String output = program.start();

        if (!output.toLowerCase().contains("enter the number of rows")) {
            return CheckResult.wrong("At the beginning your program should ask for entering the number of rows.\n" +
                "Your output should contain 'Enter the number of rows:'");
        }

        output = program.execute("4");

        if (!output.toLowerCase().contains("enter the number of seats in each row")) {
            return CheckResult.wrong("After entering the number of rows your program should ask for entering" +
                " the number of seats in each row.\n" +
                "Your output should contain 'Enter the number of seats in each row'");
        }

        output = program.execute("5");

        if (!output.toLowerCase().contains("total income:")) {
            return CheckResult.wrong("After entering the number of seats in each row your program should print total income.\n" +
                "Your output should contain 'Total income:'");
        }

        if (!output.contains("$200")) {
            return CheckResult.wrong("You miscalculated the income.\nCorrect one is $200");
        }

        return CheckResult.correct();
    }

    @DynamicTestingMethod
    CheckResult test2_testIncomeCalculating() {

        TestedProgram program = new TestedProgram(Cinema.class);
        program.start();

        String output = program.execute("8\n9");

        if (!output.contains("$648")) {
            return CheckResult.wrong("You miscalculated the income.\nCorrect one is $648");
        }

        program = new TestedProgram(Cinema.class);
        program.start();

        output = program.execute("9\n7");

        if (!output.contains("$560")) {
            return CheckResult.wrong("You miscalculated the income.\nCorrect one is $560");
        }

        program = new TestedProgram(Cinema.class);
        program.start();

        output = program.execute("7\n9");

        if (!output.contains("$558")) {
            return CheckResult.wrong("You miscalculated the income.\nCorrect one is $558");
        }

        program = new TestedProgram(Cinema.class);
        program.start();

        output = program.execute("1\n1");

        if (!output.contains("$10")) {
            return CheckResult.wrong("You miscalculated the income.\nCorrect one is $10");
        }

        program = new TestedProgram(Cinema.class);
        program.start();

        output = program.execute("3\n3");

        if (!output.contains("$90")) {
            return CheckResult.wrong("You miscalculated the income.\nCorrect one is $90");
        }

        program = new TestedProgram(Cinema.class);
        program.start();

        output = program.execute("8\n8");

        if (!output.contains("$576")) {
            return CheckResult.wrong("You miscalculated the income.\nCorrect one is $576");
        }

        return CheckResult.correct();
    }
}
