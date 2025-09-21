package interfaces;

/**
 * Interface for entities that receive payment
 */
public interface Payable {
    double calculateSalary();
    void setSalary(double salary);
    double getSalary();
}