/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
    package pkgpackage.rice.bags;
    import java.util.*;
    import javax.swing.text.StyleContext;

    /**
     *
     * @author alexandrosaristeridis
     */
    public class PackageRiceBags {
         public Boolean packageRice(Integer big, Integer small, Integer goal) {
   Boolean b=false;

   int kils=goal;
       for (int i = 0; i < goal; i+=5) {
           if(kils>=5 && big>=1){
             kils-=5; 
           System.out.println("bag of 5kl No:"+big+"  kilos:remaining " +kils);
           big--;
           if(kils==0){
           b=true;
         // bags--;
          // System.out.println("bags total of 5kl:"+big);
           }else if (kils>0 && kils<5) {
               continue;
               //bags--;
          // System.out.println("bags of 5kl:"+bags);
           }
           
           }
   }
   int kilo=kils;
       for (int i = 0; i < kils; i++) {
       if (kilo>0 && small>=kilo){
              kilo--;
           System.out.println("bag of 1kl No:"+small +"   kilos remianing "+kilo);
           
            small--;
           if(kilo==0){
           b=true;}
         
       }
   }
     return b;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PackageRiceBags obj=new PackageRiceBags();
        Scanner s = new Scanner(System.in);

        System.out.println("dose num big");

        int n=s.nextInt();
        System.out.println("dose num small");
        int k=s.nextInt();
        System.out.println("dose num goal");
        int t=s.nextInt();
        
        System.out.println(obj.packageRice(n, k, t));
    
    }}
    

