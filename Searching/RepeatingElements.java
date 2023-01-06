package Searching;

public class RepeatingElements {

    public static int repeat(int arr[]){
        boolean visit[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visit[arr[i]])
                return arr[i];
            visit[arr[i]] = true;
        }
        return -1;
    }

    public static int repeatEff(int arr[]){
        int slow = arr[0] + 1, fast = arr[0] + 1;
        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast]+1]+1;
        }while(slow!=fast);
        slow = arr[0] + 1;
        while(slow != fast){
            fast = arr[fast] + 1;
            slow = arr[slow] + 1;
        }
        return slow - 1;
    }
}
