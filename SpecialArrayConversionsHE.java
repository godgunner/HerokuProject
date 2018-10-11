import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SpecialArrayConversionsHE {

	

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String st[] = in.readLine().split(" ");
		int prim[] = new int[1000006];
		int non[] = new int[1000006];
		int a = 0;
		int b = 0;
		SpecialArrayConversionsHE prog = new SpecialArrayConversionsHE();
		boolean sieve[] =prog.sieve();

		for(int i=0;i<n;i++) {
			int s = Integer.parseInt(st[i]);
			//			System.out.println(s);
			if(!sieve[s]) {
				prim[a++]=s;
			}
			else {
				non[b++]=s;
			}
		}

		Arrays.sort(prim,0,a);
		Arrays.sort(non,0,b);

		for(int i=0;i<a;i++)
			System.out.print(prim[i]+" ");
		for(int i=b-1;i>=0;i--)
			System.out.print(non[i]+" ");

	}

	boolean[] sieve() {
		boolean sieve[] = new boolean [1000006];
		sieve[1] = true;
		for(int i=2;i<=1000;i++) {
			if(!sieve[i]) {
				for(int j=2;j*i < 1000006; j++) {
					sieve[j*i] = true;
				}
			}
		}
		return sieve;
	}

}
