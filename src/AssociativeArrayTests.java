import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import structures.AssociativeArray;
import structures.KeyNotFoundException;

/**
 * Tests of the AssociativeArray class.
 *
 * @author CSC-207 2023Fa
 */
public class AssociativeArrayTests {

  // +---------------------+-----------------------------------------
  // | Tests by Sam Bigham |
  // +---------------------+

  // +-----------------------+---------------------------------------
  // | Tests by Micah Cantor |
  // +-----------------------+

  // +------------------------+--------------------------------------
  // | Tests by Reed Colloton |
  // +------------------------+

  // +------------------+--------------------------------------------
  // | Tests by Pom Dao |
  // +------------------+

  // +--------------------------+------------------------------------
  // | Tests by Joshua Delarosa |
  // +--------------------------+

  // +-------------------+-------------------------------------------
  // | Tests by Jinny Eo |
  // +-------------------+

  // +---------------------------+-----------------------------------
  // | Tests by Kevin Fitzgerald |
  // +---------------------------+

  // +---------------------+-----------------------------------------
  // | Tests by Joyce Gill |
  // +---------------------+

  // +--------------------+------------------------------------------
  // | Tests by Che Glenn |
  // +--------------------+

  // +-------------------------+-------------------------------------
  // | Tests by Kevin Johanson |
  // +-------------------------+

  // +----------------------+----------------------------------------
  // | Tests by Chloe Kelly |
  // +----------------------+

  // +--------------------+------------------------------------------
  // | Tests by Hyeon Kim |
  // +--------------------+

  // +---------------------+-----------------------------------------
  // | Tests by Julian Kim |
  // +---------------------+

  // +-----------------------+---------------------------------------
  // | Tests by Jason Kunkel |
  // +-----------------------+

  // +---------------------+-----------------------------------------
  // | Tests by Wenfei Lin |
  // +---------------------+

  // +-----------------------+---------------------------------------
  // | Tests by Noah Mendola |
  // +-----------------------+

  // +----------------------+----------------------------------------
  // | Tests by John Miller |
  // +----------------------+

  // +-----------------------+---------------------------------------
  // | Tests by Albert Okine |
  // +-----------------------+

  // +---------------------+-----------------------------------------
  // | Tests by Alma Ordaz |
  // +---------------------+

  // +-----------------------------+---------------------------------
  // | Tests by Samuel A. Rebelsky |
  // +-----------------------------+

  /**
   * A test of cloning.
   */
  @Test
  public void samuelRebelskyTest01() {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    arr.set("A", "Apple");
    try {
      assertEquals("Apple", arr.get("A"));
    } catch (Exception e) {
      fail("Exception in call to get()");
    }
  } // samuelRebelskyTest01()

  /**
   * Do we get exceptions when grabbing a deleted value from the array?
   */
  public void samuelRebelskyTest03() {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    // Add an element to the array
    arr.set("A", "Apple");
    // Make sure that it's there.
    try {
      assertEquals("Apple", arr.get("A"));
    } catch (KeyNotFoundException e) {
      fail("Could not set A to Apple");
    }
    // Remove it.
    arr.remove("A");
    // Make sure it's no longer there.
    try {
      // The following line should throw an exception
      arr.get("A");
      fail("Did not throw an exception");
    } catch (KeyNotFoundException e) {
      // Do nothing
    }
  } // samuelRebelskyTest03

  /**
   * Do we get exceptions when grabbing a value from the empty array.
   */
  @Test
  public void samuelRebelskyEdge01() {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    try {
      // The following line should throw an exception
      arr.get("A");
      fail("Did not throw an exception");
    } catch (KeyNotFoundException e) {
      // Do nothing
    }
  } // samuelRebelskyEdge01

  // +--------------------------+------------------------------------
  // | Tests by Maria Rodriguez |
  // +--------------------------+

  // +-----------------------------+---------------------------------
  // | Tests by Gabriela Roznawska |
  // +-----------------------------+

  // +-----------------------+---------------------------------------
  // | Tests by Shuta Shibue |
  // +-----------------------+

  // +----------------------+----------------------------------------
  // | Tests by Madel Sibal |
  // +----------------------+

  // +------------------------------+--------------------------------
  // | Tests by Livia Stein Freitas |
  // +------------------------------+

  // +------------------------+--------------------------------------
  // | Tests by Tyrell Taylor |
  // +------------------------+

  // +-----------------------+---------------------------------------
  // | Tests by Audrey Trinh |
  // +-----------------------+

  // +---------------------+-----------------------------------------
  // | Tests by Rene Urias |
  // +---------------------+

  // +-----------------------+---------------------------------------
  // | Tests by Christina Vu |
  // +-----------------------+

  // +-----------------------+---------------------------------------
  // | Tests by Luke Walters |
  // +-----------------------+

  // +------------------------+--------------------------------------
  // | Tests by Jonathan Wang |
  // +------------------------+

  // +-------------------+-------------------------------------------
  // | Tests by Lydia Ye |
  // +-------------------+

} // class AssociativeArrayTests
