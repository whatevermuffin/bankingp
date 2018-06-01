
import java.util.Scanner;


/**
 *
 * 
 * This class contains all the methods which perform all the operations
 */
class bank
{
    int ch,i;
             double bal1;
            double accno1;
            
            
            double accno2;
            
            
            double richest;
           
    
   
             int create(int accno1,int accno2)
            {
                              
                 
                 if(accno1==accno2)
                 {
                     return 0;
                 }
                 else
                     return 1;                
                  
    
            }
                
                
               
            
            
                        
             int deposit1(int damt,int bal1)
            {
                    
                    bal1 += damt;
                    
                    return bal1;
            }
            
             
                         
             int withdraw1(int wamt,int bal1)
            {
                    
                    bal1 -= wamt;
                    
                    return bal1;
            }
            
             
                    
           public int transfer(int bal1,int transfer,int bal2)
           {
         
                    
                    bal1=bal1+transfer;
                    bal2=bal2-transfer;
                    
                    return bal1;
           }
           
           
          
           public  int totalbal(int bal1,int bal2)
         {
             
            int totalbal=0;
           
            totalbal = totalbal+bal1+bal2;
                    
                    return totalbal;
                    
         }
            
            
            public int richest(int bal1,int bal2)
             {
                
                    if(bal1>bal2)
                     richest=bal1;
                    return (int) richest;
             }

   
            
}
    


