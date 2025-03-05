class MethodReturn {  
    double displaySalary(double salary, double hra) {  
        return salary + hra;  
    }  

    public static void main(String[] args) {  
        MethodReturn obj = new MethodReturn();  
        double total = obj.displaySalary(20000, 2000);  
        System.out.println("Vishal salary is " + total);  
    }  
}
