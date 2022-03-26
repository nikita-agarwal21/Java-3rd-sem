package cn;

public class CRC {

	private int[] message;
	private int[] divisor;
	
	
	public  int[] getMessage() {
		return message;
	}

	public  void setMessage(int[] message) {
		this.message = message;
	}

	public  int[] getDivisor() {
		return divisor;
	}

	public void setDivisor(int[] divisor) {
		this.divisor = divisor;
	}
	
	int[] crcDivide() {
		int remainder[], i;
		
		int data[] = new int[message.length + divisor.length];
		System.arraycopy(message, 0, data, 0, message.length);
		// Remainder array stores the remainder
		remainder = new int[divisor.length];
		// Initially, remainder's bits will be set to the data bits
		System.arraycopy(data, 0, remainder, 0,divisor.length);
		
		// Loop runs for same number of times as number of bits of data
		// This loop will continuously exor the bits of the remainder and
		// divisor
		for(i=0 ; i < message.length ; i++) {
			System.out.println((i+1) + ".) First data bit is : "+ remainder[0]);
			System.out.print("Remainder : ");
			if(remainder[0] == 1) {
				// We have to exor the remainder bits with divisor bits
				for(int j=1 ; j < divisor.length ; j++) {
				remainder[j-1] = crcExor(remainder[j], divisor[j]);
					System.out.print(remainder[j-1]);
				}
			}
			else {
				// We have to exor the remainder bits with 0
				for(int j=1 ; j < divisor.length ; j++) {
					remainder[j-1] = crcExor(remainder[j], 0);
					System.out.print(remainder[j-1]);
				}
			}
			// The last bit of the remainder will be taken from the data
			// This is the 'carry' taken from the dividend after every step
			// of division
			remainder[divisor.length-1] = data[i+divisor.length];
			System.out.println(remainder[divisor.length-1]);
		}
		return remainder;
	}
	
	static int crcExor(int a, int b) {
		// This simple function returns the exor of two bits
		if(a == b) {
			return 0;
		}
		return 1;
	}

	void crcReceive() {
		// This is the receiver method
		// It accepts the data and divisor (although the receiver already has
		// the divisor value stored, with no need for the sender to resend it)
	
		int remainder[] = crcDivide();
		// Division is done
		for(int i=0 ; i < remainder.length ; i++) {
			if(remainder[i] != 0) {
				// If remainder is not zero then there is an error
				System.out.println("There is an error in received data...");
				return;
			}
		}
		//Otherwise there is no error in the received  data
		System.out.println("Data was received without any error.");
	}
}
