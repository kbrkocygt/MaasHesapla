public class Employee {

    String name;
    Double salary;
    int workHours;
    int hireYear;

    //consturaction method
    Employee(String name, double salary,int workHours, int hireYear)
    {
       this.name=name;
       this.salary=salary;
       this.workHours=workHours;
       this.hireYear=hireYear;
    }
    double tax()
    {
        if (this.salary>1000)
        {
            return this.salary*0.03;
        }
        else {
            return 0;
        }
    }
    double bonus()
    {
        if (this.workHours>40)
        {
            return (workHours-40)*30;
        }
        else
        {
            return 0;
        }
    }
   double raiseSalary()
   {
       int year=2021-this.hireYear;
       if (year<10)
       {

           return this.salary*0.05;
       }
       else if(year>9 && year<20)
       {
          return this.salary*0.1;
       }
       else if(year>19)
       {
           return this.salary*0.15;
       }

       return 0;
   }
    void  ToString()
    {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: "+ this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+ (this.salary-tax()+bonus()));
        System.out.println("Toplam Maaş : "+ (this.salary-tax()+bonus()+raiseSalary()));
    }
}
