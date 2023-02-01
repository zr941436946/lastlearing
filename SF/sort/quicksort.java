public class quicksort{



    public static void main(String[] args) {
        int[] zhu={-12,1,25,4,9,65,458,-3,0};
        quicksort quicksort = new quicksort();
        // quicksort.Quick_Sort(zhu, 0, zhu.length-1);
        quicksort.sort(zhu, 0, zhu.length-1);

        for (int i=0;i<zhu.length;i++){
            System.out.println(zhu[i]);
        }

    }


    void Quick_Sort(int[] arr, int begin, int end){
        if(begin > end)
            return;
        int tmp = arr[begin];
        int i = begin;
        int j = end;
        while(i != j){
            while(arr[j] >= tmp && j > i)
                j--;
            while(arr[i] <= tmp && j > i)
                i++;
            
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            
        }
        arr[begin] = arr[i];
        arr[i] = tmp;
        Quick_Sort(arr, begin, i-1);
        Quick_Sort(arr, i+1, end);
    }
    
    public void sort(int[] zhu,int begin,int end){
        if(begin>end)
            return;
        int temp=zhu[begin];
        int i = begin,j=end;
        while(i != j){
            while(zhu[j] >= temp && j>i){
                j--;
            }
            while(zhu[i] <= temp && j>i){
                i++;
            }
            int t=zhu[i];
            zhu[i]=zhu[j];
            zhu[j]=t;
        }
        zhu[begin]=zhu[i];
        zhu[i]=temp;
        
        sort(zhu, begin, i-1);
        sort(zhu, i+1, end);

    }

}