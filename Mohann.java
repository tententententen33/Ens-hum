import java.io.*;

class Mohann
{
    public static void main(String[] args) throws IOException
	{
        System.out.println();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
		int sum = 0;
		
        int tokuten = Integer.parseInt(br.readLine());
        sum = sum + tokuten;
		
		if(tokuten == 0){
			return;    
		}
		
		while (true) {
			
            tokuten = Integer.parseInt(br.readLine());
			sum = sum + tokuten;
			if(tokuten == 0){
				break;
            }

        }

        System.out.println("合計点は" + sum + "点です。");
    }
}
