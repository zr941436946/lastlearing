import javax.naming.ldap.SortControl;

public class bubblingsort {
    public static void main(String[] args) {
        int[] zhu={-12,1,25,4,9,65,458,-3,0};
        bubblingsort bubblingsort = new bubblingsort();
        bubblingsort.sort(zhu);
        for(int i=0;i<zhu.length;i++){
            System.out.println(zhu[i]);
        }

    }

    public void sort(int[] zhu){
        int len=zhu.length;
        for(int i=len-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(zhu[j+1]<zhu[j]){
                    int temp=zhu[j];
                    zhu[j]=zhu[j+1];
                    zhu[j+1]=temp;
                }
            }
        }
    }



}
