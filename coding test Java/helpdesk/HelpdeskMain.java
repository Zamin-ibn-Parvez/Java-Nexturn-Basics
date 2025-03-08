package helpdesk;

import java.util.Locale.Category;

class Employee {
    String fullName;
    int pointLevel;
    Category assignedCategory;

    public Employee(String name, int pointLevel, Category assignedCategory) {
        this.fullName = name;
        this.pointLevel = pointLevel;
        this.assignedCategory = assignedCategory;
    }
}

class Ticket {
    int id;
    String name;
    Category category;
    int point;
    String assignedEmployee = "";
    boolean isCompleted = false;

    public Ticket(int id, String name, Category category, int point) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.point = point;
    }
}

class Helpdesk {
    Employee emp1, emp2;
    Ticket t1, t2, t3, t4, t5;

    void addEmployee(Employee e, int pos) {
        if (pos == 1) {
            emp1 = e;
        } else if (pos == 2) {
            emp2 = e;
        }
    }

    void addTicket(Ticket t, int pos) {
        if (pos == 1) {
            t1 = t;
        } else if (pos == 2) {
            t2 = t;
        } else if (pos == 3) {
            t3 = t;
        } else if (pos == 4) {
            t4 = t;
        } else if (pos == 5) {
            t5 = t;
        }
    }

    void completeTicket(String employeeName, int ticketId) {
        Employee employee = getEmployeeByName(employeeName);
        Ticket ticket = getTicketById(ticketId);

        if (employee != null && ticket != null && !ticket.isCompleted && employee.pointLevel >= ticket.point) {
            ticket.isCompleted = true;
            ticket.assignedEmployee = employeeName;
            System.out.println("Ticket " + ticketId + " marked as completed by " + employeeName);
        } else {
            System.out.println("Ticket " + ticketId + " cannot be completed by " + employeeName + " (Insufficient points or already completed).");
        }
    }

    int getWaitingTicketCount() {
        int count = 0;
        if (t1 != null && !t1.isCompleted) count++;
        if (t2 != null && !t2.isCompleted) count++;
        if (t3 != null && !t3.isCompleted) count++;
        if (t4 != null && !t4.isCompleted) count++;
        if (t5 != null && !t5.isCompleted) count++;
        return count;
    }

    int getCompletedTicketsTotalPoint() {
        int totalPoints = 0;
        if (t1 != null && t1.isCompleted) totalPoints += t1.point;
        if (t2 != null && t2.isCompleted) totalPoints += t2.point;
        if (t3 != null && t3.isCompleted) totalPoints += t3.point;
        if (t4 != null && t4.isCompleted) totalPoints += t4.point;
        if (t5 != null && t5.isCompleted) totalPoints += t5.point;
        return totalPoints;
    }

    private Employee getEmployeeByName(String name) {
        if (emp1 != null && emp1.fullName.equals(name)) return emp1;
        if (emp2 != null && emp2.fullName.equals(name)) return emp2;
        return null;
    }

    private Ticket getTicketById(int id) {
        if (t1 != null && t1.id == id) return t1;
        if (t2 != null && t2.id == id) return t2;
        if (t3 != null && t3.id == id) return t3;
        if (t4 != null && t4.id == id) return t4;
        if (t5 != null && t5.id == id) return t5;
        return null;
    }
}

public class HelpdeskMain {
    public static void main(String[] args) {
        Helpdesk helpDesk = new Helpdesk();
        
        // Adding Employees
        Employee alice = new Employee("Alice Brown", 5, Category.DISPLAY);
        Employee bob = new Employee("Bob Smith", 8, Category.FORMAT);
        helpDesk.addEmployee(alice, 1);
        helpDesk.addEmployee(bob, 2);
        
        // Adding Tickets
        helpDesk.addTicket(new Ticket(101, "Software Bug", Category.DISPLAY, 4), 1);
        helpDesk.addTicket(new Ticket(102, "Network Issue", Category.FORMAT, 7), 2);
        helpDesk.addTicket(new Ticket(103, "System Crash", Category.FORMAT, 10), 3);
        helpDesk.addTicket(new Ticket(104, "Printer Not Working", Category.FORMAT, 3), 4);
        helpDesk.addTicket(new Ticket(105, "UI Bug", Category.DISPLAY, 2), 5);
        
        // Completing Tickets
        helpDesk.completeTicket("Alice Brown", 101);
        helpDesk.completeTicket("Bob Smith", 102);
        helpDesk.completeTicket("Alice Brown", 103);
        helpDesk.completeTicket("Bob Smith", 104);
        helpDesk.completeTicket("Alice Brown", 105);
        
        // Output Queries
        System.out.println("Waiting Tickets: " + helpDesk.getWaitingTicketCount());
        System.out.println("Total Points of Completed Tickets: " + helpDesk.getCompletedTicketsTotalPoint());
    }
}