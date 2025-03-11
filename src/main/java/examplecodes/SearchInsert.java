package examplecodes;

import java.util.ArrayList;

public class SearchInsert {
    public  static int searchInsert(ArrayList<Integer> a, int b) {
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
