import java.text.NumberFormat;

import arith.*;
public class tarp2 
{
    public static void main(String[] args)
    {
        //both int
        try 
        {
            int [] n = new int[args.length];
            for(int i = 0 ; i < args.length ; i++)    
            {
                n[i] = Integer.parseInt(args[i]);
            }
            if (args.length==2)
            {
                arithpackage a1 = new arithpackage();
                a1.sum(n[0],n[1]);    
            }
            else
            {
                arithpackage a1 = new arithpackage();
                a1.sum(n[0],n[1],n[2]);
            }
        }
        catch (NumberFormatException e1) 
        {
            //float
            try 
            {
                float [] n = new float[args.length];
                for(int i = 0 ; i < args.length ; i++)    
                {
                    n[i] = Float.parseFloat(args[i]);
                }  
                if (args.length==2)
                {
                    arithpackage a1 = new arithpackage();
                    a1.sum(n[0],n[1]);    
                }
                else
                {
                    arithpackage a1 = new arithpackage();
                    a1.sum(n[0],n[1],n[2]);
                }
            }
            // INTEGER AND CHARACTER COMBOS
            catch (NumberFormatException n2) 
            {
                //int char || i i c
                try 
                {
                    if(args.length==2)
                    {
                        try
                        {
                            int n1 = Integer.parseInt(args[0]);
                            char c = args[1].charAt(0);
                    
                            arithpackage a1 = new arithpackage();
                            a1.sum(n1,c);
                        }
                        catch(NumberFormatException n3)
                        {
                            int n1 = Integer.parseInt(args[1]);
                            char c = args[0].charAt(0);
                                
                            arithpackage a1 = new arithpackage();
                            a1.sum(n1,c);
                        }
                    }
                    else
                    {
                        try
                        {
                            int n1 = Integer.parseInt(args[0]);
                            int n3 = Integer.parseInt(args[1]);
                            char c2 = args[2].charAt(0);
                    
                            arithpackage a1 = new arithpackage();
                            a1.sum(n1,n3,c2);
                        }
                        catch (NumberFormatException n4)
                        {
                           //int char || i c i
                            try 
                            {
                                int n1 = Integer.parseInt(args[0]);
                                int n3 = Integer.parseInt(args[2]);
                                char c2 = args[1].charAt(0);
                            
                                arithpackage a1 = new arithpackage();
                                a1.sum(n1,n3,c2);
                            
                            }
                            catch (NumberFormatException n5) 
                            {
                                    try
                                    {
                                        int n1 = Integer.parseInt(args[1]);
                                        int n3 = Integer.parseInt(args[2]);
                                        char c2 = args[0].charAt(0);
                            
                                        arithpackage a1 = new arithpackage();
                                        a1.sum(n1,n3,c2);
                                    }
                                    catch(NumberFormatException n6)
                                {
                                    //int char || i c c
                                    try 
                                    {
                                        
                                        int n1 = Integer.parseInt(args[0]);
                                        char n3 = args[2].charAt(0);;
                                        char c2 = args[1].charAt(0);
                            
                                        arithpackage a1 = new arithpackage();
                                        a1.sum(n1,n3,c2);
                                        
                                    }
                                    catch(NumberFormatException n7)
                                    {
                                        //int char || c i c
                                        try 
                                        {
                                            
                                            int n1 = Integer.parseInt(args[1]);
                                            char n3 = args[2].charAt(0);;
                                            char c2 = args[0].charAt(0);
                            
                                            arithpackage a1 = new arithpackage();
                                            a1.sum(n1,n3,c2);
                                            
                                        }
                                        catch(NumberFormatException n8)
                                        {
                                            //int char || c c i
                                            try 
                                            {
                                                int n1 = Integer.parseInt(args[2]);
                                                char n3 = args[1].charAt(0);;
                                                char c2 = args[0].charAt(0);
                                
                                                arithpackage a1 = new arithpackage();
                                                a1.sum(n1,n3,c2);
                                            }
                                            catch(NumberFormatException n9)
                                            {
                                            //int char || c c i
                                                try 
                                                {
                                               
                                                    int n1 = Integer.parseInt(args[2]);
                                                    char n3 = args[1].charAt(0);;
                                                    char c2 = args[0].charAt(0);
                                
                                                    arithpackage a1 = new arithpackage();
                                                    a1.sum(n1,n3,c2);
                                                }
                                                catch(NumberFormatException n10)
                                                {
                                                    //int char || c c c
                                                    try 
                                                    {
                                                        char n1 = args[2].charAt(0);
                                                        char n3 = args[1].charAt(0);;
                                                        char c2 = args[0].charAt(0);
                                
                                                        arithpackage a1 = new arithpackage();
                                                        a1.sum(n1,n3,c2);
                                                    
                                                    }
                                                    catch(NumberFormatException n11)
                                                    {
                                                        System.out.println(n11);
                                                    }       
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }        
                }
                catch(NumberFormatException q)
                {
                    System.err.println(q);
                }
            }
        }   
    }
} 

