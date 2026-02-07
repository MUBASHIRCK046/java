import java.util.Scanner;

class CPU {
double price;
class Processor {
int noofcores;
String manufacturer;
}
static class RAM {
int memory;
String manufacturer;
}
}

public class CPUMAIN {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
CPU cpu = new CPU();
CPU.Processor p = cpu.new Processor();
System.out.println("Enter number of cores:");
p.noofcores = sc.nextInt();
sc.nextLine();
System.out.println("Enter processor manufacturer:");
p.manufacturer = sc.nextLine();

System.out.println("Enter CPU price:");
cpu.price = sc.nextDouble();
sc.nextLine();

CPU.RAM r = new CPU.RAM();
System.out.println("Enter RAM memory:");
r.memory = sc.nextInt();
sc.nextLine();

System.out.println("Enter RAM manufacturer:");
r.manufacturer = sc.nextLine();


System.out.println("\n---- CPU DETAILS ----");
System.out.println("Price: " + cpu.price);
System.out.println("Processor cores: " + p.noofcores);
System.out.println("Processor manufacturer: " + p.manufacturer);
System.out.println("RAM memory: " + r.memory);
 System.out.println("RAM manufacturer: " + r.manufacturer);
    }
}

