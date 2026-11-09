class Solution {
        public ArrayList<Integer> primeTillN(int n) {
            ArrayList<Integer> res = new ArrayList<>();

            if(n<2) return res;

            // Sieve of Erathesious

            boolean[] isPrime = new boolean[n+1];
            Arrays.fill(isPrime,true);
            isPrime[0] = isPrime[1] = false;

            for(int i=2;i*i<=n;i++){ //<--
                if(isPrime[i]){
                    for(int j=i*i;j<=n;j=j+i){ //<--
                        isPrime[j]=false;
                    }
                }
            }


            for(int i=2;i<=n;i++){ //<--
                if(isPrime[i]){
                    res.add(i);
                }
            }

            return res;
        }
}
