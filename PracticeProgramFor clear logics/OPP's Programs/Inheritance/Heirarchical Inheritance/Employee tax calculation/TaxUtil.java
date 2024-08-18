class TaxUtil {
    public double calculateTax(Developer d){
        double grossSalary = d.calculateGrossSalary();
        if(grossSalary>50000){
            return grossSalary * 0.20;
        }
        else{
            return grossSalary * 0.05;
        }
    }
    public double calculateTax(Manager m){
        double grossSalary = m.calculateGrossSalary();
        if(grossSalary>50000){
            return grossSalary * 0.20;
        }
        else{
            return grossSalary * 0.05;
        }
    }
    public double calculateTax(Trainer t){
        double grossSalary = t.calculateGrossSalary();
        if(grossSalary>50000){
            return grossSalary * 0.20;
        }
        else{
            return grossSalary * 0.05;
        }
    }
    public double calculateTax(Sourcing s){
        double grossSalary = s.calculateGrossSalary();
        if(grossSalary>50000){
            return grossSalary * 0.20;
        }
        else{
            return grossSalary * 0.05;
        }
    }
}
