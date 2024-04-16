package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void nonBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void filledBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsInBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void emptyBracketFirstReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void incompleteLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void incompleteRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
   @Test
    public void oppositeBracketsWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void oppositeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void sameLeftBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }
    @Test
    public void sameRightBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void singleBracketLeft() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleBracketRight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

}