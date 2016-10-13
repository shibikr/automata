import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FiniteAutomataTest {

    @Test
    public void isStringPassing_should_return_true_for_powers_of_two(){
        String[] states = {"q1", "q2"};
        char[] alphabets = {'1', '0'};
        String[][] delta = {{"q1", "1", "q2"},{"q2", "0", "q2"}};
        String initialState = "q1";
        String[] finalStates = {"q2"};
        String language = "1000";

        FiniteAutomata automata = new FiniteAutomata(states, alphabets, delta,initialState,finalStates);
        assertTrue(automata.isStringPassing(language));
    }

    @Test
    public void isStringPassing_should_return_false_for_powers_of_two(){
        String[] states = {"q1", "q2"};
        char[] alphabets = {'1', '0'};
        String[][] delta = {{"q1", "1", "q2"},{"q2", "0", "q2"}};
        String initialState = "q1";
        String[] finalStates = {"q2"};
        String language = "10001";

        FiniteAutomata automata = new FiniteAutomata(states, alphabets, delta,initialState,finalStates);
        assertFalse(automata.isStringPassing(language));
    }

    @Test
    public void isStringPassing_should_return_true_for_odd_number_of_zeros(){
        String[] states = {"q1", "q2"};
        char[] alphabets = {'1', '0'};
        String[][] delta = {{"q1", "0", "q2"},{"q1","1","q1"},{"q2", "0", "q1"},{"q2","1","q2"}};
        String initialState = "q1";
        String[] finalStates = {"q2"};
        String string1 = "0";
        String string2 = "000";
        String string3 = "00000";
        String string4 = "10";
        String string5 = "101010";
        String string6 = "010101";

        FiniteAutomata automata = new FiniteAutomata(states, alphabets, delta,initialState,finalStates);
        assertTrue(automata.isStringPassing(string1));
        assertTrue(automata.isStringPassing(string2));
        assertTrue(automata.isStringPassing(string3));
        assertTrue(automata.isStringPassing(string4));
        assertTrue(automata.isStringPassing(string5));
        assertTrue(automata.isStringPassing(string6));

    }

    @Test
    public void isStringPassing_should_return_false_for_odd_number_of_zeros(){
        String[] states = {"q1", "q2"};
        char[] alphabets = {'1', '0'};
        String[][] delta = {{"q1", "0", "q2"},{"q1","1","q1"},{"q2", "0", "q1"},{"q2","1","q2"}};
        String initialState = "q1";
        String[] finalStates = {"q2"};
        String string1 = "00";
        String string2 = "0000";
        String string3 = "1001";
        String string4 = "1010";
        String string5 = "001100";
        String string6 = "0101010";

        FiniteAutomata automata = new FiniteAutomata(states, alphabets, delta,initialState,finalStates);
        assertFalse(automata.isStringPassing(string1));
        assertFalse(automata.isStringPassing(string2));
        assertFalse(automata.isStringPassing(string3));
        assertFalse(automata.isStringPassing(string4));
        assertFalse(automata.isStringPassing(string5));
        assertFalse(automata.isStringPassing(string6));

    }
}