import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList();
    }

        public int solve(ArrayList<Integer> A, int B) {
            int result = 0;
            int count = 0;
            for(int i = 0 ; i < A.size(); i++)
            {
                if(A.get(i) <= B)
                {
                    count++;
                }
            }

            for(int j = 0; j < count; j++)
            {
                if(A.get(j) > B)
                {
                    result++;
                }
            }

            int sum = result;
            for(int k = 1; k < A.size() - (count - 1); k++)
            {
                if(A.get(k) < B) sum--;
                if(A.get(k + count - 1) < B) sum++;

                if(sum < result)
                    result = sum;
            }

            return result;
        }
    }