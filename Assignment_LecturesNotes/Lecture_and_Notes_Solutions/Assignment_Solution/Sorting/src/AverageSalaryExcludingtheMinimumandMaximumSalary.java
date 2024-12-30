public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
        int[] a={4000,3000,1000,2000};

        System.out.println(average(a));
    }
    static double average(int[] salary) {
                double sum = 0;
                int minSalary = Integer.MAX_VALUE;
                int maxSalary = Integer.MIN_VALUE;

                for (int i = 0; i < salary.length; i++) {
                    sum += salary[i];
                    if (salary[i] < minSalary) {
                        minSalary = salary[i];
                    }
                    if (salary[i] > maxSalary) {
                        maxSalary = salary[i];
                    }
                }

                sum -= (minSalary + maxSalary);
                double sal = salary.length - 2;
                double total = sum / sal;

                return total;
            }
        }
