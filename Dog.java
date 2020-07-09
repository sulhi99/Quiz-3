/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1stage2;

/**
 *
 * @author Sulhi
 */
public class Dog extends Animal {
    
    String dog;

    public Dog(String dog) {
        this.dog = dog;
    }

   public void introduceYourself() {
        System.out.println("Woof. I am a dog. My name is " + this.dog);
        System.out.println("and I am " + this.age + " years old.");
    }
    
}
