package gov.pnnl.aparapi.sample.mdarray;
import com.syncleus.aparapi.Kernel;

class SMatMul3D extends Kernel{
   short[][][] A;

   short[][][] B;

   short[][][] C;

   int N;

   public SMatMul3D(short[][][] A, short[][][] B, short[][][] C, int N) {
      this.A = A;
      this.B = B;
      this.C = C;
      this.N = N;
   }

   @Override public void run() {
      int id = getGlobalId();
      int i = id / (N * N);
      int j = (id / N) % N;
      int k = id % N;
      for (int l = 0; l < N; l++) {
         C[i][j][k] += (short) (A[i][j][l] * B[l][j][k]);
      }
   }
}
