package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public class SalariedEmployee extends Employee {
    private double AnnualSalary;

    public SalariedEmployee(String name, LocalDate hireDate, double annualSalary) {
        super(name, hireDate);
        this.AnnualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return AnnualSalary;
    }

    @Override
    public double getMonthlyPay() {
        return AnnualSalary / 12.0;
    }

    @Override
    public String toString() {
        return String.format("SalariedEmployee[name=%s, hireDate=%s, annualSalary=%.1f]",
                getName(), getHireDate(), AnnualSalary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SalariedEmployee)) return false;
        SalariedEmployee other = (SalariedEmployee) obj;
        return getName().equals(other.getName()) &&
                getHireDate().equals(other.getHireDate()) &&
                Double.compare(AnnualSalary, other.AnnualSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHireDate(), AnnualSalary);
    }
}
