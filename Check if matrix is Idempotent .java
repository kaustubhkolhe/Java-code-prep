public class checkIdempotent {
public boolean isIdempotent(ArrayList<ArrayList<Integer>> matrix) {
            int matrixSize = matrix.size();


            for (int i = 0; i < matrixSize; i++) {

                for (int j = 0; j < matrixSize; j++) {

                    int val = 0;
                    for (int k = 0; k < matrixSize; k++) {

                        val += matrix.get(i).get(k) * matrix.get(k).get(j);

                    }
                    if(val != matrix.get(i).get(j)) return false;
                }

            }
            return true;
        }
}
