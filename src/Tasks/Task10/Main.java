package Tasks.Task10;

import java.util.Comparator;

public class Main implements Comparator<Student>{
    private Student[] iDNumber;

    public void setArray(Student[] iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void mergeSort(){
        mergeSort(0, iDNumber.length-1);
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {
        Student[] temp = new Student[iDNumber.length];
        for (int i = low; i <= high; i++) {
            temp[i] = iDNumber[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (compare(temp[i], temp[j]) < 0){
                iDNumber[k] = temp[i];
                i++;
            } else {
                iDNumber[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            iDNumber[k] = temp[i];
            k++;
            i++;
        }
    }

    public void quickSort() {
        quickSort(0, iDNumber.length - 1);
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;
        Student pivot = iDNumber[low + (high - low) / 2];

        while (i <= j) {
            while (compare(iDNumber[i], pivot) == -1) {
                i++;
            }
            while (compare(iDNumber[j], pivot) == 1) {
                j--;
            }
            if (i <= j) {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }

    public void outArray() {
        for (int i = 0; i < iDNumber.length; i++){
            System.out.print(iDNumber[i].getName() +" "+ iDNumber[i].getSecondname() +" "+ iDNumber[i].getSpeciality()+" "+ iDNumber[i].getGrade()+" "+ iDNumber[i].getNumber_of_group()+" "+iDNumber[i].getGpa());
            System.out.print("\n");
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGpa() < o2.getGpa()){
            return 1;
        }
        else if (o1.getGpa() > o2.getGpa()){
            return -1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Анастасия", "Кириллова", "Программист", 2, 111, 4);
        Student student2 = new Student("Юлия", "Умарова", "Журналист", 3, 102, 3);
        Student student3 = new Student("Николай", "Бугаков", "Врач-хирург", 4, 103, 2);
        Student student4 = new Student("Евгений", "Маккавеев", "Повар", 4, 109, 3);


        Student[] students = {student1, student2, student3,student4};
        Main main = new Main();
        main.setArray(students);
        main.quickSort();
        main.outArray();

        System.out.println();
        Student student5 = new Student("Анастасия", "Кириллова", "Программист", 2, 111, 4);
        Student student6 = new Student("Юлия", "Умарова", "Журналист", 3, 102, 3);
        Student student7 = new Student("Николай", "Бугаков", "Врач-хирург", 4, 103, 2);
        Student student8 = new Student("Евгений", "Маккавеев", "Повар", 4, 109, 3);

        Student[] students1 = {student5, student6, student7,student8};
        main.setArray(students1);
        main.mergeSort();
        main.outArray();
    }
}