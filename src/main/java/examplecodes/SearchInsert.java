import java.util.ArrayList;

public class BitonicBSArray {

    public int solve(ArrayList<Integer> A, int B) {
        int l=0; int r=A.size()-1;

        while(l<= r){
            int mid = l+(r-l)/2;
            int midVal = A.get(mid);
            if(midVal == B)
                return mid;
            if(midVal < A.get(mid+1)){
                if(midVal < B)
                    l=mid+1;
                else
                    r=mid-1;
            }
            else{
               // if()
            }
        }
        return 0;
    }

    public int searchInsert(ArrayList<Integer> a, int b) {
        int l=0; int r=a.size()-1;

        while(l<= r){
            int mid = l+(r-l)/2;
            int midVal = a.get(mid);
            if(midVal == b)
                return mid;
            if(midVal < b)
                l=mid+1;
            else
                r=mid-1;
        }
        return l;
    }
}
