package ParkingLotLLD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class main {

    public static void main(String args[]) {
        ParkingSpot ps1 = new ParkingSpot(VehicleType.TwoWheeler, true);
        ParkingSpot ps2 = new ParkingSpot(VehicleType.TwoWheeler, true);
        ParkingSpot ps3 = new ParkingSpot(VehicleType.TwoWheeler, true);
        ParkingSpot ps4 = new ParkingSpot(VehicleType.FourWheeler, true);
        ParkingSpot ps5 = new ParkingSpot(VehicleType.FourWheeler, true);

        List<ParkingSpot> twowheelerParking = new ArrayList<>();
        List<ParkingSpot> fourwheelerParking = new ArrayList<>();

        twowheelerParking.add(ps1);
        twowheelerParking.add(ps2);
        twowheelerParking.add(ps3);

        fourwheelerParking.add(ps4);
        fourwheelerParking.add(ps5);

        ParkingSpotManagerFactory psmf = new ParkingSpotManagerFactory(twowheelerParking, fourwheelerParking);
        Vehicle v = new Vehicle(VehicleType.FourWheeler, "UP32AB1234");
        Ticket t = new Ticket(v);
        EntranceGate eg = new EntranceGate(t, psmf);
        eg.setSpot();
        ExitGate exitGate = new ExitGate(psmf);
        exitGate.freeSpot(t);
        exitGate.getCost(v);
    }
}

//        ArrayList<Integer> A = new ArrayList<>();
//        ArrayList<Integer> B = new ArrayList<>();
//        A.add(68);
//        A.add(35);
//        B.add(68);
//        B.add(35);
//        System.out.println(solve(A,B,1));
//    }
//        public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
//            PriorityQueue<Integer> pqA = new PriorityQueue<>();
//            PriorityQueue<Integer> ans = new PriorityQueue<>((a,b)->b-a);
//
//            for(int i:A){
//                for(int j:B){
//                    pqA.add(i+j);
//                }
//            }
//
//            while(pqA.size()>0){
//                // if(ans.size()>0&&ans.size()>C){
//                //     ans.remove();
//                // }
//                int anss= pqA.remove();
////                System.out.println(anss);
//                ans.add(anss);
//            }
//
//            ArrayList<Integer> ansArr = new ArrayList<>();
//            int c =C;
////            System.out.println(c);
//
//            while(c>0 && ans.size()>0){
//
//                ansArr.add(ans.remove());
//                c--;
//            }
//            Collections.sort(ansArr,Collections.reverseOrder());
//            return ansArr;
//        }
//    }
