package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hoursWorked;

    public HourlyEmployee(String name, LocalDate hireDate, double wageRate, double hoursWorked) {
        super(name, hireDate);
        this.wageRate = wageRate;
        this.hoursWorked = hoursWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double getMonthlyPay() {
        return wageRate * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee[name=%s, hireDate=%s, wageRate=%.1f, hoursWorked=%.1f]",
                getName(), getHireDate(), wageRate, hoursWorked);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HourlyEmployee)) return false;
        HourlyEmployee other = (HourlyEmployee) obj;
        return getName().equals(other.getName()) &&
                getHireDate().equals(other.getHireDate()) &&
                Double.compare(wageRate, other.wageRate) == 0 &&
                Double.compare(hoursWorked, other.hoursWorked) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHireDate(), wageRate, hoursWorked);
    }
}