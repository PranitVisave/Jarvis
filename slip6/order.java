//not getting proper output
import java.util.*;

abstract class Order
{
       protected int id;
       protected String dsp;
     
       public Order(int id,String dsp)
       {
              this.id=id;
              this.dsp=dsp;
       }
       public abstract void accept();
       public abstract void display();
}
class Purchase extends Order
{
   private String cname;
   public Purchase(int id,String dsp)
   {
         super(id,dsp);
   }
   public void accept()
   {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter Customer name: ");
         String cname=scan.nextLine();
         this.cname=cname;
         scan.close();
   }
   public void display()
   {
         System.out.println("Purchase order ID: "+id);
         System.out.println("Description: "+dsp);
         System.out.println("Customer name:"+cname);
   }
}

class Sales extends Order
{
   private String vname;
   public Sales(int id,String dsp)
   {
         super(id,dsp);
   }
   public void accept()
   {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter Vendor name: ");
         String vname=scan.nextLine();   
         this.vname=vname;
         scan.close();
   }
   public void display()
   {
         System.out.println("Sales order ID: "+id);
         System.out.println("Description: "+dsp);
         System.out.println("Vendor name:"+vname);
   }
}

class order
{
     public static void main(String[] args)
     {
            Purchase[] porder=new Purchase[1];
            for (int i=0;i<3;i++)
            {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter Purchase Order id: ");
                int orderid=scan.nextInt();
                scan.nextLine();
                System.out.println("Enter Purchase order description: ");
                String orderdsp=scan.nextLine();
                Purchase porders=new Purchase(orderid,orderdsp);
                porders.accept();
                porder[i]=porders;
                scan.close();
            }
            Sales[] sorder =new Sales[1];
            for (int i=0;i<3;i++)
            {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter Sales Order id: ");
                int orderid=scan.nextInt();
                scan.nextLine();
                System.out.println("Enter Sales order description: ");
                String orderdsp=scan.nextLine();
                Sales sorders=new Sales(orderid,orderdsp);
                sorders.accept();
                sorder[i]=sorders;
                scan.close();
            }
            
            System.out.println("\nPurchase Orders: ");
            for (Purchase porders: porder)
                porders.display();           
            System.out.println("\nSales Orders: ");
            for (Sales sorders: sorder)
                sorders.display();         
     }
}
