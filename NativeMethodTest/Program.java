import java.util.*;

class Program {
	
	public static void main(String[] args) {
		if(args[0].equals("gcd")){
			if(args.length < 4){
				long a = Long.parseLong(args[1]);
				long b = Long.parseLong(args[2]);
				System.out.printf("G.C.D = %d%n", LegacyBridge.gcdOfTwo(a, b));
			}else{
				long[] nums = Arrays.stream(args)
								.skip(1)
								.mapToLong(Long::parseLong)
								.toArray();
				System.out.printf("G.C.D = %d%n", LegacyBridge.gcdOfMany(nums));
			}
		}
	}
}

