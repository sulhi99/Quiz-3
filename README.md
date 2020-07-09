# Question

### 1. What will be printed?
~~~
Meow. I am a cat. My name is Kurre
and I am 6 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.
~~~

### 2. Explain how it is that the instance variable age of Animal can be used in Cat and Dog when it is declared in Animal.
- Which Variables defined within a class are call instance variable. This is because each instance of the class contains  their own copy of the variables.

### 3. What actually consists an instance of?
- Instance is consists of Cat and Dog

### 4. And what consists a class of?
- A class is a template definition of the method and variable in a particular kind of object . A class consists of properties and method definitions.

### 5. What is the difference between a class and an instance?
- A class acts as a blueprint of an object or instance. A class defines the properties and methods of an object or instance while the instance is the object of a class created to be used in a program.

### 6. Change the declaration of the instance variable age of Animal to a class variable using static, in this way:
### public static int age;
##### What is the result of the output now? Why?
~~~
Meow. I am a cat. My name is Kurre
and I am 3 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.
~~~

### 7. It may happen that you get warnings from the compiler that you should access the variable age via Animal.age, but it should be possible to run the program anyway. Otherwise, change the references to age into Animal.age.
 - This is because the variable will just be shared by all instances of the class after changed it to static. So, Cat and Dog classes will not have the same variable with Animal class.

### 8. Where is the value of an instance variable stored?
- It will be stored in the class itself where the variable was defined. For example, it will be stored in the class itself where the variable was defined.

### 9. Where is the value of a class variable stored?
- The value of class variable stored inside a property of the class objects. For example, age is a property of Animal. So, the age will be stored in an Animal instance.

### 10. What refers the variable this to?
- The keyword this refers to the variable in the class.
