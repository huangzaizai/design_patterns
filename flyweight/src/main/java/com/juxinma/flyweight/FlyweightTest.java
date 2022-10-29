package com.juxinma.flyweight;

import java.util.*;

public class FlyweightTest {

    static abstract class Taxi {

        protected int id; //汽车编号

        protected int mileage; //总里程
        protected int passengerNum; //乘客数量

        /**
         * 载客
         * @param num 乘客数量
         * @param mileage 里程
         */
        public abstract void carryPassenger(int num, int mileage);

    }

    static class RealTaxi extends Taxi {

        public RealTaxi(Integer id) {
            this.id = id;
        }

        @Override
        public void carryPassenger(int num, int mileage) {
            this.passengerNum += num;
            this.mileage += mileage;
        }

        @Override
        public String toString() {
            return "RealTaxi{" +
                    "id=" + id +
                    ", mileage=" + mileage +
                    ", passengerNum=" + passengerNum +
                    '}';
        }
    }

    static class TaxiFactory {

        private TaxiFactory() {}

        private static Map<Integer,Taxi> taxiMap = new HashMap<>();

        /**
         * 派车
         * @param id 汽车编号
         * @return 出租车
         */
        public static Taxi sendCar(Integer id) {
            Taxi taxi = taxiMap.get(id);
            if (taxi == null) {
                taxi = new RealTaxi(id);
                taxiMap.put(id,taxi);
            }
            return taxi;
        }

        /**
         * 数据统计
         */
        public static void statistics() {
            Set<Integer> keySet = taxiMap.keySet();
            Iterator<Integer> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                Integer id = iterator.next();
                Taxi taxi = taxiMap.get(id);
                System.out.println(taxi);
            }
        }

    }

    public static void main(String[] args) {
        Random random = new Random(12);
        for (int i = 0; i < 24; i++) {
            Taxi taxi = TaxiFactory.sendCar(random.nextInt(5));//总共5辆车，编号从0到4
            taxi.carryPassenger(random.nextInt(3) + 1, random.nextInt(10));//载客
        }
        TaxiFactory.statistics();
    }

}
