using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Client

{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("============== hello ================");
            ServiceReference1.PoloniexClient stub = new ServiceReference1.PoloniexClient();

            Console.WriteLine("Veuillez saisir la designation : ");
            String des = Console.ReadLine();

            ServiceReference1.cryotCurrency e1 = stub.recherche(des);
            Console.WriteLine("============== Resultat de recherche ================");
            Console.WriteLine("Votre choix est : "+" Num : "+ e1.num + "  Designation : "+ e1.designation + "  Euro : "+ e1.EURO +"  USD : "+ e1.USD);
            Console.ReadLine(); 
        }
    }
}