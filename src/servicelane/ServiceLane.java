package servicelane;

import java.util.Scanner;

/**
 *
 * @author Slava
 * 
 */
public class ServiceLane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        
        int[][] testCases = new int[t][2];
        for(int a0 = 0; a0 < t; a0++){
            testCases[a0][0] = in.nextInt();
            testCases[a0][1] = in.nextInt();
        }
        
        int[] result = getVehicleTypes(width, testCases);
        
        for(int a1 = 0; a1 < result.length; a1++)
            System.out.println(result[a1]);
    }
    
    public static int[] getVehicleTypes(int[] width, int[][] testCases)
    {
        int[] result = new int[testCases.length];
        
        for(int i = 0; i < testCases.length; i++)
        {
            result[i] = 4;
            for(int j = testCases[i][0]; j <= testCases[i][1]; j++)
            {
                if(width[j] < result[i])
                    result[i] = width[j];
            }
        }
        
        return result;
    }
}
