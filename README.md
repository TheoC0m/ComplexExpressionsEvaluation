# ComplexExpressionsEvaluation
Evaluation of complex mathematical expressions

This is a school project (advanced Java course).  
The program evaluates and calculates long and complex expressions like:      

((((((43.36+3.1+4.87)*2.98)/4.75)*(1.4+1.685))/(-2.784))+5.359*4.4+5.5)+6.2*8.98-7.54/9.3+4.8*8.9-3.2      

Quick overview :    

First step : format, optimize and validate input string.  
If expression is syntaxically wrong, the user is warned by a message.  
If it's just fine, the tool optimize and format the input string for an easier further processing.  

Step 2 :  
The tool translates the expression to postfix notation using Shunting-Yard algorithm.    

Step 3:  
It reads the postfix notation and build an expression binary tree    

Step 4: 
The binary tree is recursively evaluated and then the expression is solved    

The program makes uses of many design patterns :  
- Interpreter  
- Factory  
- Singleton  
- Abstract classes and inheritance architecture    

A lot of JUnit tests are provided, there is a test for each cases (from the simplest to the hardest)
