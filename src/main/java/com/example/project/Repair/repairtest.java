package com.example.project.Repair;
import java.util.ArrayList;

public class repairtest {
    public static void main(String[] args) {
        RepairSchedule schedule = new RepairSchedule(3); 

        System.out.println(schedule.addRepair(0, 1));
        System.out.println(schedule.getSchedule().size());

        //adding a repair with duplicate mechanic should return False
        System.out.println(schedule.addRepair(0, 2));

        // adding a repair with the same bay --> return flase
        System.out.println(schedule.addRepair(1, 1));

        // adding a repair with a new mechanic (1) and new bay (2))
        System.out.println(schedule.addRepair(1, 2));
        System.out.println(schedule.getSchedule().size());


    }
}
